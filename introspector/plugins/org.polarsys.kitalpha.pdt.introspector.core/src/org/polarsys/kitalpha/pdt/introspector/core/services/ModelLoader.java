/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.introspector.core.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.internal.rules.Activator;
import org.polarsys.kitalpha.pdt.introspector.core.messages.Messages;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceMessages;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Package;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ModelLoader {

	public IntrospectionContext introContext;

	public ModelLoader(IntrospectionContext context) {
		this.introContext = context;
	}

	/**
	 * @param feature
	 */
	private void loadFeature(Feature feature) {
		String featureId = feature.getId();
		String featureVersion = feature.getVersion();

		Version version = new Version(featureVersion);
		String qualifier = version.getQualifier();
		int qualifierSize = qualifier.length();

		String featureIdAndVersion = featureId
				+ IntrospectionContext.ID_VERSION_SEPARATOR + featureVersion;

		featureIdAndVersion = Helpers.controlVersionLabel(featureIdAndVersion,
				introContext.isQualifierMatch(), qualifierSize);

		introContext.addFeature_fromOtherModels(featureIdAndVersion, feature);
	}

	private void loadModel(EclipseModel rootElement, IProgressMonitor monitor) {
		// iterer sur les repositories
		EList<Repository> repositories = rootElement.getRepositories();
		if (repositories != null) {
			for (Repository repository : repositories) {
				loadRepositoryContent(repository, introContext, monitor);
			}
		}
	}

	private void loadPackageContent(Package currentPackage,
			IntrospectionContext context) {
		// plugins
		EList<Plugin> plugins = currentPackage.getPlugins();
		if (plugins != null) {
			for (Plugin plugin : plugins) {
				loadPlugin(plugin);
			}
		}

		// features
		EList<Feature> features = currentPackage.getFeatures();
		if (features != null) {
			for (Feature feature : features) {
				loadFeature(feature);
			}
		}

		// packages => recursivement
		EList<Package> subPackages = currentPackage.getSubPackages();

		// j'ai des packages fils => j'itere recursivement dessus
		if (subPackages != null) {
			for (Package currPackage : subPackages) {
				loadPackageContent(currPackage, introContext);
			}
		}
		// sinon je suis arrivé au dernier, j'ai dejà fait le travail pour ses
		// plugins/features
	}

	/**
	 * @param plugin
	 */
	private void loadPlugin(Plugin plugin) {
		String pluginId = plugin.getId();
		String pluginVersion = plugin.getVersion();
		List<ExtensionPoint> extensionPoints = new ArrayList<ExtensionPoint>();

		Version version = new Version(pluginVersion);
		String qualifier = version.getQualifier();
		int qualifierSize = qualifier.length();

		String pluginIdAndVersion = pluginId
				+ IntrospectionContext.ID_VERSION_SEPARATOR + pluginVersion;
		pluginIdAndVersion = Helpers.controlVersionLabel(pluginIdAndVersion,
				introContext.isQualifierMatch(), qualifierSize);
		if ((plugin.getExtensionPoints().getExtensionPoints() != null) || (!plugin.getExtensionPoints().getExtensionPoints().isEmpty())) {
			extensionPoints = plugin.getExtensionPoints().getExtensionPoints();
			for (ExtensionPoint extensionPoint : extensionPoints) {
				introContext.addExtensionPoint(extensionPoint.getId(),
						extensionPoint);
			}
		}

		introContext.addPlugin_fromOtherModels(pluginIdAndVersion, plugin);

	}

	private void loadRepositoryContent(Repository repository,
			IntrospectionContext context, IProgressMonitor monitor) {

		// repository
		HashMap<String, Repository> repositoryHashMap = introContext
				.getRepositoryHashMap();

		RepositoryKind repositoryKind = repository.getRepositoryKind();

		switch (repositoryKind) {
		case PLATFORM:
			repository.setName(IntrospectionContext.PLATFORM_KEY);
			break;
		case WORKSPACE:
			repository.setName(IntrospectionContext.WORKSPACE_KEY);
		default:
			break;
		}

		String repoName = repository.getName();
		if (!repositoryHashMap.containsValue(repository))
			repositoryHashMap.put(repoName, repository);

		// plugins & extension points
		EList<Plugin> plugins = repository.getPlugins();
		if (plugins != null) {
			for (Plugin plugin : plugins) {
				loadPlugin(plugin);
			}
		}

		// features
		EList<Feature> features = repository.getFeatures();
		if (features != null) {
			for (Feature feature : features) {
				loadFeature(feature);
			}
		}

		// packages => boucle + appel de loadPackageContent
		EList<Package> packages = repository.getPackages();
		if (packages != null) {
			for (Package currentPackage : packages) {
				loadPackageContent(currentPackage, introContext);
			}
		}
	}

	public void loadOtherModels(ModelLoader modelLoader,
			List<URI> modelsToLoad, IProgressMonitor monitor, IFolder folder) {

		List<EclipseModel> eclipseExistingModels = new ArrayList<EclipseModel>();

		boolean reallyIgnoreQualifier = introContext.isQualifierMatch();

		// on charge les modeles
		for (URI modelURI : modelsToLoad) {
			if (monitor.isCanceled()) {
				return;
			}

			monitor.subTask("Browsing " + modelURI.toString());

			Resource resource = introContext.getResourceSet().getResource(
					modelURI, true);
			//FIXME Why set the model uri? The resource has already the model uri
			resource.setURI(modelURI);

			EList<EObject> contents = resource.getContents();

			//FIXME A resource can hold many roots as EcipseModel, don't suppose the first
			//is the right one
			if (contents.size() == 1) {

				//FIXME handle the case where root element isn't an EclipseModel
				if (contents.get(0) instanceof EclipseModel) {
					EclipseModel rootElement = (EclipseModel) contents.get(0);
					eclipseExistingModels.add(rootElement);

					if (rootElement.isQualifierIgnored()) {
						reallyIgnoreQualifier = true;
					}
				}
			}
			monitor.worked(1);
		}

		introContext.setQualifierMatch(reallyIgnoreQualifier);

		for (EclipseModel rootElement : eclipseExistingModels) {
			loadModel(rootElement, monitor);
		}

	}

	private void checkContent(IContainer container, List<URI> modelsToLoad) {

		// declaration of the temp table of things fond in resources
		IResource[] tempResources = null;

		try {

			tempResources = container.members();

		} catch (CoreException e) {

			IStatus errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.bind(Messages.ErrorResourcesMembers, container.getName()), e);
			StatusManager.getManager().handle(errorStatus);

		}

		// Check if we've found resources
		if (tempResources != null) {

			// Go through the different ressources found
			for (IResource member : tempResources) {

				if (member instanceof IContainer) {

					IContainer containerTemp = (IContainer) member;
					checkContent(containerTemp, modelsToLoad);

				} else if (member instanceof IFile) {
					IFile fileTemp = (IFile) member;
					String fileName = fileTemp.getName();

					// Check if it's an introspection model
					if (fileName.endsWith(".platform")) {

						// add the uri of the file modelsToLoad
						URI uri = URI.createPlatformResourceURI(container
								.getProject().getName()
								+ "/"
								+ fileTemp.getProjectRelativePath().toString(),
								true);
						modelsToLoad.add(uri);

					}

				}

			}

		}

	}

	public void findExistingModelsToReuse(List<URI> modelsToLoad,
			IFolder folder, SearchCriteria criteria) {

		// ---------------------------------------------------------------------------------
		// Case Incremental Introspection reuse 'modelreuse:/' models
		// ---------------------------------------------------------------------------------

		if (introContext
				.getIncrementalIntrospection()
				.equals(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ReuseFromResourceReuse)) {
			modelsToLoad.addAll(ModelReuseHelper
					.findModelsURIAccordingToCriteria(criteria));
		}

		// ---------------------------------------------------------------------------------
		// Case introspection models from the whole workspace shall be reused
		// ---------------------------------------------------------------------------------

		else if (introContext
				.getIncrementalIntrospection()
				.equals(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_ReuseFromWorkspace)) {

			// Get the workspace
			IWorkspace workspace = ResourcesPlugin.getWorkspace();

			// Get to the root of the workspace
			IWorkspaceRoot root = workspace.getRoot();

			// Reference existing projects in the workspace
			IProject[] workspaceProjects = root.getProjects();

			for (IProject project : workspaceProjects) {

				if (project.isOpen())
					checkContent(project, modelsToLoad);

			}

		}

		// ---------------------------------------------------------------------------------
		// In case we only want to consider models from current folder
		// ---------------------------------------------------------------------------------
		else {
			IResource[] members = null;
			try {
				members = folder.members();
			} catch (CoreException e) {
				IStatus errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.bind(Messages.ErrorResourcesMembers, folder.getName()), e);
				StatusManager.getManager().handle(errorStatus);
			}

			if (members != null) {
				for (IResource member : members) {
					if (member instanceof IFile) {
						IFile file = (IFile) member;
						String fileName = file.getName();

						// Check if it's an introspection model
						if (fileName.endsWith(".platform")) {

							URI uri = URI.createPlatformResourceURI(file
									.getProject().getName()
									+ "/"
									+ file.getProjectRelativePath().toString(),
									true);
							modelsToLoad.add(uri);

						}

					}
				}
			}
		}
		// ---------------------------------------------------------------------------------

	}
}
