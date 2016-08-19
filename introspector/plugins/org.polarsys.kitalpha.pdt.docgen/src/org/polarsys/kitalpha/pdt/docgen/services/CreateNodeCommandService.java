/**
 * <copyright>
 * 
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *   
 * </copyright>
 */

package org.polarsys.kitalpha.pdt.docgen.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.RefreshIdsHolder;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DragAndDropTarget;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManager;
import org.eclipse.sirius.diagram.business.api.query.AbstractNodeMappingQuery;
import org.eclipse.sirius.diagram.business.internal.componentization.mappings.DiagramMappingsManagerRegistryImpl;
import org.eclipse.sirius.diagram.business.internal.experimental.sync.AbstractDNodeCandidate;
import org.eclipse.sirius.diagram.business.internal.experimental.sync.DDiagramSynchronizer;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;

/**
 * Recording command allowing to create a node in a diagram
 * 
 * @author Boubekeur Zendagui
 * 		   Xavier DECOOL
 * 
 * Reworked from {@link ...}
 */

@SuppressWarnings("restriction")
public class CreateNodeCommandService extends RecordingCommand {

	/** Command properties **/
	private DDiagram _diagram;
	private Session _session;
	private EList<AbstractNodeMapping> _mappings;
	private EObject _target;

	/** Internal properties **/
	private DDiagramSynchronizer diagramSynchronizer;
	private DiagramMappingsManager diagramMappingsManager;
	private IInterpreter interpreter;

	/**
	 * Default constructor
	 * 
	 * @param session
	 *            used {@link Session} to create representations
	 * @param diagram
	 *            {@link DDiagram} wherein the node will be created
	 * @param abstractNodeMappings
	 *            an {@link AbstractNodeMapping} used to create the node
	 * @param target
	 *            semantic element
	 */
	public CreateNodeCommandService(Session session, DDiagram diagram,
			EList<AbstractNodeMapping> abstractNodeMappings, EObject target) {
		this(session.getTransactionalEditingDomain());
		this._diagram = diagram;
		this._session = session;
		this._mappings = abstractNodeMappings;
		this._target = target;
		/*
		 * This properties are set as class properties because they are used in
		 * a recursive method #createOneNode(). This allows to control created
		 * instance number.
		 */
		this.interpreter = _session.getInterpreter();
		this.diagramSynchronizer = new DDiagramSynchronizer(this.interpreter,
				_diagram.getDescription(), _session.getModelAccessor());
		this.diagramSynchronizer.setDiagram((DSemanticDiagram) _diagram);
		this.diagramMappingsManager = DiagramMappingsManagerRegistryImpl.INSTANCE
				.getDiagramMappingsManager(_session, _diagram);
	}

	protected AbstractNodeMapping getMappingForElement(EObject obj) {
		for (AbstractNodeMapping currentMapping : _mappings) {

			if (currentMapping.getDomainClass().equals(obj.eClass().getName()))
				return currentMapping;
		}
		return null;
	}

	/**
	 * Hidden constructor
	 * 
	 * @param domain
	 *            {@link TransactionalEditingDomain}
	 */
	private CreateNodeCommandService(TransactionalEditingDomain domain) {
		super(domain);
	}

	@Override
	protected void doExecute() {
		boolean preCondition = false;
		if (_target != null) {
			AbstractNodeMapping nodeMapping = getMappingForElement(_target);
			if (nodeMapping != null) {
				AbstractNodeMappingQuery abstractNodeMappingQuery = new AbstractNodeMappingQuery(
						nodeMapping);
				preCondition = abstractNodeMappingQuery.evaluatePrecondition(
						(DSemanticDiagram) _diagram, _diagram, interpreter,
						_target);
			}
			if (preCondition) {
				createNodeAndItChildrenNodes(_target, nodeMapping, _diagram);
			}
		} else
			System.out.println("can't find a target for : "
					+ _diagram.getName());
	}

	/**
	 * Create node and its sub nodes if there is sub mappings defined in it
	 * description
	 * 
	 * @param nodeMapping
	 *            current {@link AbstractNodeMapping} which can be a
	 *            {@link NodeMapping} or a {@link ContainerMapping}
	 * @param currentObject
	 *            current root semantic element
	 * @param parent
	 *            a {@link DragAndDropTarget} element wherein the node will be
	 *            created
	 */
	private void createNodeAndItChildrenNodes(EObject currentObject,
			AbstractNodeMapping nodeMapping, DDiagram parent) {

		String diagramName = parent.getName();
		// create it sub nodes
		if (currentObject instanceof Plugin) {

			// create concerned node
			createOneNode((Plugin) currentObject, parent);

			EList<PluginDependency> pluginDependencies = ((Plugin) currentObject)
					.getPluginDependencies().getPluginDependencies();
			EList<Extension> extensions = ((Plugin) currentObject)
					.getExtensions().getExtensions();

			if (diagramName.contains("Features and Plugins")) {
				if (!pluginDependencies.isEmpty()) {
					for (PluginDependency pluginDependency : pluginDependencies) {
						
						/*
						 * The plugin wich i'm creating depends on others, 
						 * I create node for this plugin and i add it to diagram
						 * */
						Plugin target = pluginDependency.getTarget();
						createOneNode(target, parent);
					}
				}
			}

			//I test if i'm in the extension/extension point's diagram
			if (diagramName.contains("Extensions and Extension Points")) {
				
				//I work on extensions to know on which extension point it's linked
				if (!extensions.isEmpty()) {
					for (Extension extension : extensions) {
						ExtensionPoint extensionPoint = extension
								.getExtensionPoint();
						if (extensionPoint != null) {
							EObject pluginContainer = extensionPoint
									.eContainer().eContainer();
							if (pluginContainer instanceof Plugin) {
								createOneNode(pluginContainer, parent);
							}
						}
					}
				}
			}
		}

		if (currentObject instanceof Feature) {

			// create concerned node
			createOneNode((Feature) currentObject, parent);

			EList<FeatureDependency> featureDependencies = ((Feature) currentObject)
					.getFeatureDependencies().getFeatureDependencies();
			EList<FeatureToPluginDependency> pluginDependencies = ((Feature) currentObject)
					.getPluginDependencies().getPluginDependencies();
			EList<FeatureInclusion> featureInclusions = ((Feature) currentObject)
					.getFeatureInclusions().getFeatureInclusions();
			EList<Plugin> includedPlugins = ((Feature) currentObject)
					.getIncludedPlugins().getIncludedPlugins();

			if (featureDependencies != null) {
				for (FeatureDependency featureDependency : featureDependencies) {
					
					/*
					 * The feature which i'm working on depends on others
					 * i create that and i include it to the current diagram
					 * */
					Feature target = featureDependency.getTarget();
					createOneNode(target, parent);
				}
			}

			if (pluginDependencies != null) {
				for (FeatureToPluginDependency featureToPluginDependency : pluginDependencies) {
					/*
					 * The feature which i'm working on depends on other plugins
					 * i create that and i include it to the current diagram
					 * */
					Plugin target = featureToPluginDependency.getTarget();
					createOneNode(target, parent);
				}
			}

			if (featureInclusions != null) {
				for (FeatureInclusion includedFeature : featureInclusions) {
					/*
					 * The feature which i'm working on includes other features
					 * i create that and i include it to the current diagram
					 * */
					Feature target = includedFeature.getIncludedFeature();
					createOneNode(target, parent);
				}
			}

			if (includedPlugins != null) {
				for (Plugin plugin : includedPlugins) {
					/*
					 * The feature which i'm working on includes other plugins
					 * i create that and i include it to the current diagram
					 * */
					createOneNode(plugin, parent);
				}
			}
		}
	}

	/**
	 * Create one node in the current {@link DDiagram}
	 * 
	 * @param mapping
	 *            {@link AbstractNodeMapping} describing the node to create
	 * @param target
	 *            {@link EObject} used to create the node
	 * @param parent
	 *            a {@link DragAndDropTarget} element wherein the node will be
	 *            created
	 */
	private void createOneNode(EObject target, DDiagram parent) {
		if (target != null) {
			AbstractNodeMapping mapping = getMappingForElement(target);
			/*
			 * FIXME: [FAB] refreshIdHolder created manually. I'm not sur that
			 * is the good way to do.
			 * May be use Sirius public API to perform this task. (Migration Sirius 4)
			 */
			RefreshIdsHolder _tmp = new RefreshIdsHolder();
			final AbstractDNodeCandidate abstractDNodeCandidate = new AbstractDNodeCandidate(
					mapping, target, parent, _tmp);
			
			 diagramSynchronizer.getElementSynchronizer().createNewNode(
					diagramMappingsManager, abstractDNodeCandidate, false);
		}
	}
}
