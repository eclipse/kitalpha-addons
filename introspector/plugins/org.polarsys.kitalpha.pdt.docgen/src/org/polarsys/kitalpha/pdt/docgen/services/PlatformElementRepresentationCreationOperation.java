/*******************************************************************************
 * Copyright (c) 2016, 2021 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.docgen.services;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.util.ObjectAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutService;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.query.DRepresentationQuery;
import org.eclipse.sirius.business.api.session.CustomDataConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
import org.eclipse.sirius.diagram.business.api.refresh.DiagramCreationUtil;
import org.eclipse.sirius.diagram.business.internal.refresh.SynchronizeGMFModelCommand;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.model.business.internal.helper.ContentHelper;
import org.eclipse.sirius.table.metamodel.table.description.TableDescription;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.doc.gen.business.ecore.Activator;
import org.polarsys.kitalpha.pdt.docgen.exceptions.DocGenException;
import org.polarsys.kitalpha.pdt.docgen.helpers.AIRDHelpers;
import org.polarsys.kitalpha.pdt.docgen.helpers.Helpers;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.modeler.utils.services.IntrospectionServices;

/**
 * @author Boubekeur Zendagui
 * 		   Xavier Decool
 * 
 */
@SuppressWarnings("restriction")
public class PlatformElementRepresentationCreationOperation extends
		WorkspaceModifyOperation {

	/** Sirius representation files extension **/
	private final static String _AIRD_FILE_EXTENSION = "aird";

	/** Viewpoint and diagrams names **/
	private String _viewpointPluginID = "";
	private String _viewpointName = "";
	private List<String> _representationsNames = new ArrayList<String>();

	/** Semantic elements to create representation for them */
	protected List<EObject> semanticElemens = new ArrayList<EObject>();

	/** List of all representation names to create **/
	protected Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
	protected List<RepresentationDescription> representationsDescriptions = new ArrayList<RepresentationDescription>();

	/** Project informations **/
	private String representationFileName;
	private URI representationFileURI;
	// private IProject representationProject;

	/** {@link URI} of the model **/
	private URI _modelURI;

	/** Received element and working session **/
	private EclipseElement _element;
	private Session _currentSession;

	/**
	 * Default constructor
	 * 
	 * @param platformModelURI
	 *            platform model {@link URI}
	 */
	public PlatformElementRepresentationCreationOperation(URI modelURI,
			String elementID, Session currentSession, String fileName,
			String viewpointPluginID, String viewpointName,
			List<String> representations) {
		//Logger.getLogger().info("Platform Element Representation");
		this._modelURI = modelURI;
		this._viewpointName = viewpointName;
		this._viewpointPluginID = viewpointPluginID;
		this._representationsNames = representations;
		this._currentSession = currentSession;
		this._element = null;

		Collection<Resource> resources = _currentSession.getSemanticResources();
		for (Resource resource : resources) {
			if (resource.getEObject(elementID) != null) {
				this._element = (EclipseElement) resource.getEObject(elementID);
				break;
			}
		}

		initRepresentationFileInformations(fileName);
		initViewpointsList(representations == null);
	}

	public List<EObject> getSemanticElements(Session session, URI modelUri,
			EclipseElement element) {
		final List<EObject> result = new ArrayList<EObject>();
		EList<ExtensionPoint> extensionPoints = null;
		EList<Extension> extensions = null;

		// I check the instance of my element
		if (element instanceof Plugin) {

			// i add my current plugin on the todo list
			Plugin currentPlugin = (Plugin) element;
			result.add(currentPlugin);

			// i check all his children
			if (currentPlugin.getExtensionPoints().getExtensionPoints() != null)
				extensionPoints = currentPlugin.getExtensionPoints()
						.getExtensionPoints();

			if (currentPlugin.getExtensions().getExtensions() != null)
				extensions = currentPlugin.getExtensions().getExtensions();

			// If my current plugin contains extension or extension point
			if (extensions != null)
				// i add it
				result.addAll(extensions);
			if (extensionPoints != null)
				result.addAll(extensionPoints);
		} else if (element instanceof Feature) {
			Feature currentFeature = (Feature) element;
			// i add it to my todo list
			result.add(currentFeature);
		}
		return result;
	}

	public String getLabelFrom(EObject currentSemantic,
			RepresentationDescription description) {
		return currentSemantic instanceof EclipseElement ? Helpers
				.getLabel((EclipseElement) currentSemantic)
				+ " "
				+ description.getName() : "";
	}

	/**
	 * Initialize representation file information
	 * 
	 * @param fileName
	 *            representation file name
	 */
	private void initRepresentationFileInformations(String fileName) {
		this.representationFileName = getRepresentationFileName(fileName);
		this.representationFileURI = getRepresentationUri(fileName);
		getRepresentationProject(fileName);
	}

	/**
	 * Check if fileName value is valid. If it is not the case, this method
	 * return model file name + ".aird"
	 * 
	 * @param fileName
	 *            representation file name. This parameter accept
	 *            <code> null <code/> value
	 * @return a valid representation file name
	 * 
	 **/
	private String getRepresentationFileName(String fileName) {
		if (fileName == null
				|| (fileName != null && fileName.trim().length() < 1)) {
			URI modelUriWithoutFileExtension = this._modelURI
					.trimFileExtension();
			if (modelUriWithoutFileExtension != null
					&& modelUriWithoutFileExtension.segmentCount() > 1) {
				String modelName = modelUriWithoutFileExtension.lastSegment();
				modelName += "." + _AIRD_FILE_EXTENSION;
				return modelName;
			} else {
				throw new RuntimeException("Model file URI is not valid");
			}
		} else {
			boolean fqnFileName = isFqnFileName(fileName);
			if (fqnFileName) {
				String[] segments = fileName.split("/");
				String lastSegment = segments[segments.length - 1];
				if (lastSegment.contains(_AIRD_FILE_EXTENSION))
					return lastSegment;
				else
					return lastSegment + "." + _AIRD_FILE_EXTENSION;

			}
		}
		return fileName;
	}

	/**
	 * Compute the representation file {@link URI}. This file will be created
	 * near of model
	 * 
	 * @return the representation file {@link URI}
	 **/
	private URI getRepresentationUri(String fileName) {
		String stringRepresentationURI = "";

		if (isFqnFileName(fileName)) {
			stringRepresentationURI = fileName;
		} else {
			URI modelUriWithoutFileExtension = this._modelURI
					.trimFileExtension();
			if (modelUriWithoutFileExtension != null
					&& modelUriWithoutFileExtension.segmentCount() > 1) {
				for (int i = 1; i < modelUriWithoutFileExtension.segments().length - 1; i++) {
					stringRepresentationURI += "/"
							+ modelUriWithoutFileExtension.segments()[i];
				}
				stringRepresentationURI += "/" + this.representationFileName;
			} else {
				throw new RuntimeException("Model URI is not valid");
			}
		}

		if (stringRepresentationURI.length() > 0)
			return URI.createPlatformResourceURI(stringRepresentationURI, true);
		else
			throw new RuntimeException("Error on creating representation URI");

	}

	/**
	 * @return the {@link IProject} containing the model
	 * 
	 * **/
	private IProject getRepresentationProject(String fileName) {
		String projectName = null;
		List<String> foldersToCreate = new ArrayList<String>();

		if (isFqnFileName(fileName)) {/*
									 * The file name provided by user is like:
									 * /PluginID/folders/filename.aird In this
									 * case, the project and folder will be
									 * created if they are not available
									 */

			String[] segments = fileName.split("/");
			projectName = segments[0];
			// create the list of folders to create
			for (int i = 1; i < segments.length - 1; i++) {
				foldersToCreate.add(segments[i]);
			}
		} else {// The file name provided by user is like: filename.aird
			if (_modelURI.isPlatform()) {// Case of platform URI (Plug-in or
											// Resource URI)
				projectName = _modelURI.segment(1);
			} else {// Case of hierarchical URI. Only URI FQN like are handled.
				projectName = _modelURI.segment(0);
			}
		}

		// Get/create the project from/into the workspace
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		NullProgressMonitor NPM = new NullProgressMonitor();

		try {
			if (!project.exists()) {
				project.create(NPM);
			}
			project.open(NPM);
		} catch (CoreException e) {
			throw new RuntimeException("Project with name : " + projectName
					+ " can't be localized", e);
		}

		// Create folders if needed
		if (!foldersToCreate.isEmpty()) {
			IFolder currentFolder = null;
			for (String folderName : foldersToCreate) {
				if (currentFolder == null) {// Case of the first iteration, get
											// the folder from the project
					currentFolder = project.getFolder(folderName);
				} else {// Case of the other iterations, get the folder from it
						// parent folder
					currentFolder = currentFolder.getFolder(folderName);
				}

				if (!currentFolder.exists()) { // Create the folder if it is was
												// not created yet.
					try {
						currentFolder.create(true, true, NPM);
					} catch (CoreException e) {
						throw new RuntimeException("Can't create folder : "
								+ currentFolder, e);
					}
				}
			}
		}

		return project;
	}

	private boolean isFqnFileName(String fileName) {
		if (fileName != null && !fileName.isEmpty() && fileName.contains("/"))
			return true;
		else
			return false;
	}

	/**
	 * Initialize Viewpoints list
	 */
	private void initViewpointsList(boolean allRepresentations) {
		// Step 1: initialize Viewpoint list
		for (Viewpoint viewpoint : ViewpointRegistry.getInstance()
				.getViewpoints()) {
			if (viewpoint.getName().equals(_viewpointName)
					&& viewpoint.eResource().getURI().segmentsList()
							.contains(_viewpointPluginID)) {// This version
															// handle only one
															// viewpoint
				viewpoints.add(viewpoint);
				break;
			}
		}

		// Step 2: initialize Representation list
		if (!viewpoints.isEmpty()) {
			for (Viewpoint viewpoint : viewpoints) {
				EList<RepresentationDescription> ownedRepresentations = viewpoint
						.getOwnedRepresentations();
				if (ownedRepresentations != null
						&& !ownedRepresentations.isEmpty()) {
					if (allRepresentations) {
						_representationsNames = new ArrayList<String>();
						representationsDescriptions
								.addAll(ownedRepresentations);
						for (RepresentationDescription representationDescription : ownedRepresentations) {
							_representationsNames.add(representationDescription
									.getName());
						}
					} else {
						for (RepresentationDescription representationDescription : ownedRepresentations) {
							final String name = representationDescription
									.getName();
							if (_representationsNames.contains(name)) {
								representationsDescriptions
										.add(representationDescription);
							}
						}
					}
				}
			}
		}
	}

	public boolean initializeDiagram(DDiagram diagram) {
		return true;
	}

	/**
	 * Check if diagram and matrix generation can be done
	 * 
	 * @return True if all data are not null and not empty
	 */
	private boolean canGenerate() {
		if (_modelURI == null)
			return false;
		if (_viewpointName == null || _viewpointName.isEmpty())
			return false;
		if (_viewpointPluginID == null || _viewpointPluginID.isEmpty())
			return false;
		if (_representationsNames == null || _representationsNames.isEmpty())
			return false;

		return true;
	}

	/**
	 * Create diagram content
	 * 
	 * @param session
	 *            used {@link Session} to edit diagrams
	 * @param diagram
	 *            {@link DDiagram} to populate with containers, nodes and edges
	 * @param currentObject
	 */
	private void populateEntitiesDiagram(final Session session,
			final DDiagram diagram, EObject currentObject) {

		populateNodesAndContainers(session, diagram, currentObject);
	}

	private void cleanUselessObjects(final Session session,
			final DDiagram diagram) {

		DRepresentationQuery rep2descQuery = new DRepresentationQuery(diagram);
		DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
		String representationName = (result == null) ? diagram.getUid() : result.getName();
		List<DEdge> outgoingEdges = new ArrayList<DEdge>();
		List<DEdge> diagramEdges = new ArrayList<DEdge>();
		List<DNode> borderedNodes = new ArrayList<DNode>();
		List<DNode> currentObjectNodes = new ArrayList<DNode>();
		List<DNode> nodesNeeded = new ArrayList<DNode>();
		String elementName = "";

		EList<DDiagramElement> ownedDiagramElements = diagram
				.getOwnedDiagramElements();

		// filling my lists of edges/bordered nodes
		for (DDiagramElement dDiagramElement : ownedDiagramElements) {
			if (dDiagramElement instanceof DEdge)
				// i fill my list of edges
				diagramEdges.add((DEdge) dDiagramElement);
			else if (dDiagramElement instanceof DNodeList) {
				// if nodes handle bordered nodes, typically in an extensions &
				// extension points diagram
				if (((DNodeList) dDiagramElement).getOwnedBorderedNodes() != null) {
					borderedNodes.addAll((((DNodeList) dDiagramElement)
							.getOwnedBorderedNodes()));
				}
			}
		}

		for (DDiagramElement dDiagramElement : ownedDiagramElements) {
			if (dDiagramElement instanceof DNodeList) {
				elementName = ((DNodeList) dDiagramElement).getName();

				// i'm in the root element of my representation & in a plugin
				// and feature diagram
				if (representationName.contains(elementName)
						&& ((DNodeList) dDiagramElement).getOutgoingEdges() != null
						&& !representationName.contains("Extensions")) {
					// i get my outgoing edges
					outgoingEdges = ((DNodeList) dDiagramElement)
							.getOutgoingEdges();
					// and i remove all other edges
					if (!diagramEdges.isEmpty()) {
						for (DEdge rootEdge : outgoingEdges) {
							for (DEdge edge : diagramEdges) {
								if (edge.getSourceNode() != rootEdge
										.getSourceNode()) {
									// i clear my useless edges
									CleanUselessObjectCommandService command = new CleanUselessObjectCommandService(
											session, edge);
									session.getTransactionalEditingDomain()
											.getCommandStack().execute(command);
								}
							}
						}
					}
				}
				// i'm in an extension and extension point diagram
				else if (representationName.contains(elementName)
						&& representationName
								.contains("Extensions and Extension Points")) {

					// now i fill my list of bordered node handled by my current
					// plugin
					if (((DNodeList) dDiagramElement).getOwnedBorderedNodes() != null)
						currentObjectNodes.addAll(((DNodeList) dDiagramElement)
								.getOwnedBorderedNodes());

					if (!currentObjectNodes.isEmpty()
							&& !borderedNodes.isEmpty()) {

						// i add first nodes of my current plugin
						nodesNeeded.addAll(currentObjectNodes);
						for (DNode rootNode : currentObjectNodes) {
							EList<DEdge> outgoingEdges2 = rootNode
									.getOutgoingEdges();

							// then i store bordered node used by my plugin
							for (DEdge dEdge : outgoingEdges2) {
								EObject target = dEdge.getTargetNode();
								if (target instanceof DNode) {
									nodesNeeded.add((DNode) target);
								}
							}
						}

						// now i store in a list bordered nodes that i don't
						// need in my diagram
						borderedNodes.removeAll(nodesNeeded);
						for (DNode node : borderedNodes) {
							// i clear my useless nodes
							CleanUselessObjectCommandService nodeCommand = new CleanUselessObjectCommandService(
									session, node);
							session.getTransactionalEditingDomain()
									.getCommandStack().execute(nodeCommand);
						}
					}
				}
			}
		}
	}

	/**
	 * Create nodes and containers diagram children
	 * 
	 * @param session
	 *            used {@link Session} to edit diagrams
	 * @param diagram
	 *            {@link DDiagram} to populate with nodes and containers
	 * @param ePackage
	 *            {@link EPackage}
	 */
	private void populateNodesAndContainers(final Session session,
			final DDiagram diagram, EObject ePackage) {

		/** List of diagram description node and container mapping **/
		EList<AbstractNodeMapping> abstractNodeMappings = new BasicEList<AbstractNodeMapping>();
		final DiagramDescription description = diagram.getDescription();

		/** Handle description NodeMppings **/
		EList<NodeMapping> nodeMappings = ContentHelper.getAllNodeMappings(description, false);
		if (!nodeMappings.isEmpty())
			abstractNodeMappings.addAll(nodeMappings);

		/** Handle description ContainerMppings **/
		EList<ContainerMapping> containerMappings = ContentHelper.getAllContainerMappings(description, false);
		if (!containerMappings.isEmpty())
			abstractNodeMappings.addAll(containerMappings);

		/*
		 * I call my command to create nodes included in my current feature
		 */
		CreateNodeCommandService command = new CreateNodeCommandService(
				session, diagram, abstractNodeMappings, ePackage);
		command.canExecute();
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(command);

	}

	/**
	 * Refresh a given diagram.
	 * 
	 * @param session
	 *            session used to edit <code>diagram</code>
	 * @param diagram
	 *            the diagram to refresh
	 */
	private void refreshRepresentation(final Session session,
			final DRepresentation representation) {
		final TransactionalEditingDomain editingDomain = session
				.getTransactionalEditingDomain();
		
		Command refreshCommand = new RefreshRepresentationsCommand(editingDomain, true, 
				new NullProgressMonitor(), representation);
		editingDomain.getCommandStack().execute(refreshCommand);
	}

	/**
	 * Allows to arrange all on a given diagram
	 * 
	 * @param session
	 *            uses {@link Session} to edit diagrams
	 * @param diagram
	 *            {@link DDiagram} to arrange
	 */
	private void arrangeAll(final Session session, final DDiagram diagram) {
		final DiagramCreationUtil util = new DiagramCreationUtil(diagram);
		Diagram associatedGMFDiagram = null;
		if (!util.findAssociatedGMFDiagram()) {// If GMF diagram is not
												// initialized, create it
			util.createNewGMFDiagram();
			associatedGMFDiagram = util.getAssociatedGMFDiagram();
			if (associatedGMFDiagram != null)
				session.getServices().putCustomData(
						CustomDataConstants.GMF_DIAGRAMS, diagram,
						associatedGMFDiagram);
		} else {// Get the GMF diagram
			associatedGMFDiagram = util.getAssociatedGMFDiagram();
		}

		// Synchronize Sirius diagram with GMF diagram
		final TransactionalEditingDomain domain = session
				.getTransactionalEditingDomain();
		if (associatedGMFDiagram != null) {
			final CanonicalSynchronizer canonicalSynchronizer = CanonicalSynchronizerFactory.INSTANCE
					.createCanonicalSynchronizer(associatedGMFDiagram);

			Command gmfNotationModelSynchronizationCmd = new SynchronizeGMFModelCommand(
					domain, canonicalSynchronizer);
			domain.getCommandStack()
					.execute(gmfNotationModelSynchronizationCmd);
		}

		final Diagram associatedGMFDiagram_f = associatedGMFDiagram;
		Display.getDefault().syncExec(new Runnable() {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public void run() {
				Shell shell = new Shell(Display.getDefault());
				try {
					DiagramEditPart diagramEP = org.eclipse.sirius.diagram.ui.tools.internal.part.OffscreenEditPartFactory
							.getInstance().createDiagramEditPart(
									associatedGMFDiagram_f, shell);

					/** Register Nodes Edit Part in diagram viewpoint Registry **/
					final ListIterator listIterator = associatedGMFDiagram_f
							.getChildren().listIterator();
					while (listIterator.hasNext()) {
						final Object next = listIterator.next();
						org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart g = ((org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart) diagramEP
								.getPrimaryEditParts().get(0));
						next.toString();
						diagramEP.getViewer().getEditPartRegistry()
								.put(next, g);
					}

					/** Define hint **/
					List<Object> hints = new ArrayList<Object>(2);
					hints.add(LayoutType.DEFAULT);
					hints.add(diagramEP);
					IAdaptable layoutHint = new ObjectAdapter(hints);

					/** Process layout **/
					EList children = null;
					try {
						children = associatedGMFDiagram_f.getChildren();
					} catch (IllegalArgumentException e) {
					}

					if (children != null && children.isEmpty() == false) {
						List layoutNodes = LayoutService.getInstance()
								.getLayoutNodes(diagramEP,
										associatedGMFDiagram_f.getChildren());
						if (layoutNodes.isEmpty() == false) {
							Runnable layoutRun = LayoutService.getInstance()
									.layoutLayoutNodes(layoutNodes, false,
											layoutHint);
							layoutRun.run();
						}
					}
				} finally {
				}
			}
		});

	}

	/**
	 * Create all diagrams for semantic element
	 * 
	 * @param session
	 *            The {@link Session} opened on the created representation file
	 * @param monitor
	 *            {@link IProgressMonitor}
	 */
	private List<DRepresentation> createRepresentations(IProgressMonitor monitor) throws DocGenException {
		List<DRepresentation> result = new ArrayList<DRepresentation>();

		for (EObject semantic : semanticElemens) {
			
			Collection<DRepresentation> representations = DialectManager.INSTANCE
					.getRepresentations(semantic, _currentSession);
			if (representations.isEmpty()) {
				// Create all representation
				for (String representationName : _representationsNames) {
					final DRepresentation newRepresentation = createRepresentation(
							semantic, representationName, monitor);
					if (newRepresentation != null)
						result.add(newRepresentation);
				}
			}
		}
		return result;
	}

	/**
	 * Create a Table representation
	 * 
	 * @param semantic
	 *            model element root of the representation to create
	 * @param session
	 *            {@link Session} used to create the representation
	 * @param representationName
	 * @param representationLabelc
	 * @param monitor
	 *            {@link IProgressMonitor} to trace representation creation
	 * @return True if the representation is well created, false otherwise
	 */
	private DRepresentation createRepresentation(final EObject semantic,
			String representationName, IProgressMonitor monitor) throws DocGenException{
		if(monitor.isCanceled()){
			throw new DocGenException("arrete detecté");
		}

		// get associate description on my representationName
		final RepresentationDescription representationDescription = getRepresentationDescription(representationName);
		String domainClass = null;
		if (representationDescription instanceof DiagramDescription)
			domainClass = ((DiagramDescription) representationDescription)
					.getDomainClass();
		if (representationDescription instanceof TableDescription)
			domainClass = ((TableDescription) representationDescription)
					.getDomainClass();

		DRepresentation createRepresentation = null;
		if (domainClass != null
				&& _currentSession.getModelAccessor().eInstanceOf(semantic,
						domainClass))
			createRepresentation = createRepresentation(semantic,
					representationDescription, monitor);

		return createRepresentation;
	}

	/**
	 * 
	 * @param representationName
	 *            the name of sought representation
	 * @return a {@link RepresentationDescription} or null
	 */
	private RepresentationDescription getRepresentationDescription(
			String representationName) {
		for (RepresentationDescription representation : representationsDescriptions) {
			if (representation.getName().equals(representationName))
				return representation;
		}
		return null;
	}

	/**
	 * Create one representation for a given semantic element in a given session
	 * 
	 * @param semantic
	 *            model element root of the representation to create
	 * @param session
	 *            {@link Session} used to create the representation
	 * @param description
	 *            {@link RepresentationDescription} used to create the
	 *            representation
	 * @param name
	 *            representation name
	 * @param monitor
	 *            {@link IProgressMonitor} to trace representation creation
	 * @return the created {@link DRepresentation}
	 */
	private DRepresentation createRepresentation(final EObject semantic,
			final RepresentationDescription description,
			IProgressMonitor monitor) throws DocGenException{
		String name = getLabelFrom(semantic, description);
		if(monitor.isCanceled()){
			throw new DocGenException("arrete detecté");
		}
		CreateRepresentationCommand createRepresentationCommand = new CreateRepresentationCommand(
				_currentSession, description, semantic, name, monitor);
		try {

			Set<Resource> resources = _currentSession.getAllSessionResources();
			for (Resource resource : resources) {
				EcoreUtil.resolveAll(resource);
			}

			_currentSession.getTransactionalEditingDomain().getCommandStack()
					.execute(createRepresentationCommand);
		} catch (NullPointerException e2) {
			Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error during representation creation", e2));
		} catch (RuntimeException e) {
			Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error during representation creation", e));
		} 
		DRepresentation createdRepresentation = createRepresentationCommand
				.getCreatedRepresentation();
		return createdRepresentation;
	}

	/**
	 * Create the representation file for the model
	 * 
	 * @param monitor
	 *            {@link IProgressMonitor} to trace operation
	 */
	private Session createRepresentationFile(IProgressMonitor monitor) {

		monitor.subTask("create the representation model...");

		if (_currentSession != null) {
			_currentSession.save(monitor);
			_currentSession.open(monitor);
		} else {// Session is not created
			throw new RuntimeException("Can't create a session for "
					+ representationFileURI.toString());
		}

		// Command to link ecore model to the session
		AddSemanticResourceCommand addSemanticResourceCommand = new AddSemanticResourceCommand(
				_currentSession, _modelURI, new SubProgressMonitor(monitor, 1));

		// Command to select Viewpoint in the current session
		ChangeViewpointSelectionCommand changeViewpointSelectionCommand = new ChangeViewpointSelectionCommand(
				_currentSession, new ViewpointSelectionCallback(), viewpoints,
				Collections.<Viewpoint> emptySet(), false,
				new SubProgressMonitor(monitor, 1));

		// Execute the 2 created commands bellow
		CompoundCommand compoundCommand = new CompoundCommand(
				"Link resources to representation"); //$NON-NLS-1$ 
		compoundCommand.append(addSemanticResourceCommand);
		compoundCommand.append(changeViewpointSelectionCommand);
		_currentSession.getTransactionalEditingDomain().getCommandStack()
				.execute(compoundCommand);

		return _currentSession;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		if (canGenerate() == false)
			return;

		// add model to aird
		if (_currentSession.getSemanticResources().isEmpty())
			_currentSession = createRepresentationFile(monitor);

		/** Step 2: Create diagrams on EPackages **/
		if (_currentSession != null) {
			// Collect semantic elements
			semanticElemens = getSemanticElements(_currentSession, _modelURI,
					_element);
			// Create diagrams if session was well created in the previous step
			List<DRepresentation> newAndCreatedRepresentations = new ArrayList<DRepresentation>();
			try {
				newAndCreatedRepresentations = createRepresentations(monitor);
			} catch (DocGenException e) {
				AIRDHelpers.INSTANCE.cleanAllMaps();
				AIRDHelpers.INSTANCE.clearCurrentAird();
			}

			// Create diagram content
			if (newAndCreatedRepresentations.isEmpty() == false) {
				for (DRepresentation dRepresentation : newAndCreatedRepresentations) {
					if (dRepresentation instanceof DDiagram) {
						if (initializeDiagram((DDiagram) dRepresentation))
							for (EObject currentObject : semanticElemens) {

								// I work with a feature
								if (currentObject instanceof Feature) {
									DDiagram diagram = (DDiagram) dRepresentation;
									DRepresentationQuery rep2descQuery = new DRepresentationQuery(diagram);
									DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
									String name = (result == null) ? diagram.getUid() : result.getName();
									String objectName = ((Feature) currentObject)
											.getId();
									String diagramName = objectName
											+ " Features and Plugins";
									if (name.equalsIgnoreCase(diagramName))
										populateEntitiesDiagram(
												_currentSession,
												(DDiagram) dRepresentation,
												currentObject);
								}

								// I work with a plugin
								if (currentObject instanceof Plugin) {
									DDiagram diagram = (DDiagram) dRepresentation;
									DRepresentationQuery rep2descQuery = new DRepresentationQuery(diagram);
									DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
									String name = (result == null) ? diagram.getUid() : result.getName();
									String objectName = ((Plugin) currentObject)
											.getId();
									String diagramName = objectName
											+ " Features and Plugins";

									String extensionsAndExtensionPointsName = objectName
											+ " Plug-in Extensions and Extension Points";
									if (name.equalsIgnoreCase(diagramName))
										populateEntitiesDiagram(
												_currentSession,
												(DDiagram) dRepresentation,
												currentObject);
									else if (name
											.equalsIgnoreCase(extensionsAndExtensionPointsName)) {
										populateEntitiesDiagram(
												_currentSession,
												(DDiagram) dRepresentation,
												currentObject);
									}
								}

								// I work with an extension
								if (currentObject instanceof Extension) {
									DDiagram diagram = (DDiagram) dRepresentation;
									DRepresentationQuery rep2descQuery = new DRepresentationQuery(diagram);
									DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
									String name = (result == null) ? diagram.getUid() : result.getName();
									String objectName = IntrospectionServices
											.getLabelForGivenExtension((Extension) currentObject);
									String diagramName = objectName
											+ " Extension Schema";
									if (name.equalsIgnoreCase(diagramName))
										populateEntitiesDiagram(
												_currentSession,
												(DDiagram) dRepresentation,
												currentObject);
								}

								// I work with an EP
								if (currentObject instanceof ExtensionPoint) {
									DDiagram diagram = (DDiagram) dRepresentation;
									DRepresentationQuery rep2descQuery = new DRepresentationQuery(diagram);
									DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
									String name = (result == null) ? diagram.getUid() : result.getName();
									String objectName = ((ExtensionPoint) currentObject)
											.getId();
									String diagramName = objectName
											+ " Extension Schema";
									if (name.equalsIgnoreCase(diagramName))
										populateEntitiesDiagram(
												_currentSession,
												(DDiagram) dRepresentation,
												currentObject);
								}
							}

						// Refresh representation.
						refreshRepresentation(_currentSession, dRepresentation);

						cleanUselessObjects(_currentSession,
								(DDiagram) dRepresentation);

						// Layout diagram content
						if (dRepresentation instanceof DDiagram)
							arrangeAll(_currentSession,
									(DDiagram) dRepresentation);
					}
				}

				// Save session
				_currentSession.save(monitor);
			}
		}
	}
}
