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
package org.polarsys.kitalpha.pdt.introspector.core.launcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.pde.core.target.ITargetHandle;
import org.eclipse.pde.core.target.ITargetPlatformService;
import org.eclipse.pde.internal.core.target.TargetPlatformService;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.exceptions.IntrospectionExceptions;
import org.polarsys.kitalpha.pdt.introspector.core.internal.rules.Activator;
import org.polarsys.kitalpha.pdt.introspector.core.messages.Messages;
import org.polarsys.kitalpha.pdt.introspector.core.services.FeatureServices;
import org.polarsys.kitalpha.pdt.introspector.core.services.ModelLoader;
import org.polarsys.kitalpha.pdt.introspector.core.services.PackageServices;
import org.polarsys.kitalpha.pdt.introspector.core.services.PluginServices;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceMessages;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind;

/**
 * 
 * @author Xavier DECOOL
 *
 */
@SuppressWarnings("restriction")
public class Introspector {

	/*
	 * TODO: This method is complex, it is spaghetti plat. there are at least 7 "if else" instructions. Hard to maintain, to read.
	 * It would be good if you can design an API to do the underlying task separately.
	 * You must clearly specify what is workspace introspection, platform introspection, incremental introspection... what things are
	 * common to this...
	 * Second rules: Avoid uses of static methods
	 */
	public static EclipseModel introspect(EclipseModel myEclipseModel,
			IProgressMonitor monitor, IntrospectionContext introContext,
			IFolder folder) throws IntrospectionExceptions {

		// --------------------------------------------------------------------------
		// load other models, if wanted
		// --------------------------------------------------------------------------
		if (introContext.isActivateIncrementalIntrospection()) {

			ModelLoader modelLoader = new ModelLoader(introContext);
			List<URI> modelsToLoad = new ArrayList<URI>();

			// Go look for the models to reuse
			modelLoader.findExistingModelsToReuse(modelsToLoad, folder,
					introContext.getSettedCriteria());

			// Find how many existing models you have
			int progressTarget = modelsToLoad.size();

			// Launch of the introspection task of the progress monitor
			monitor.beginTask("Inspection of existing models",
					progressTarget);
			modelLoader.loadOtherModels(modelLoader, modelsToLoad, monitor,
					folder);
		}

		// ---------------------------------------------------------------------------

		// Get the name of the current product
		// ---------------------------------------------------------------------------
		String productName = null;
		
		/**
		 *FIXME getDefault() method should only used internally by PDE. Read the documentation
		 */
		ITargetPlatformService defaultPlatform = TargetPlatformService.getDefault();
		
		try {
			//FIXME productName may be null. This block can throws an exception which is catched. The
			//program will follow it execution after catch block without setting productName variable
			//which is used later
			ITargetHandle workspaceTargetHandle = defaultPlatform.getWorkspaceTargetHandle();
			productName= workspaceTargetHandle.getTargetDefinition().getName();
		} catch (CoreException e1) {
			IStatus errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.ErrorGenerationTargetHandler, e1);
			StatusManager.getManager().handle(errorStatus);
		}
		
		// ---------------------------------------------------------------------------
		// Declare ressources to introspect and
		// evaluate progressTarget : the number of object created (monitor)
		// ----------------------------------------------------------------------------

		/*
		 * We have 3 loops for the plugins We have 2 loops for the features
		 */
		final int progressTarget;

		// Case platform only
		if (introContext
				.getIntrospectionPerimeter()
				.equals(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PerimeterIsPlatformOnly)) {

			introContext.setVisitPlatform(true);
			introContext.setVisitWorkspace(false);

			/*
			 * creation of the plaform repository
			 */
			Repository myRepository;
			myRepository = PlatformFactory.eINSTANCE.createRepository();
			myRepository.setName(productName);
			myRepository.setRepositoryKind(RepositoryKind.PLATFORM);

			if (introContext.isCreatePackages())
				progressTarget = 3 * introContext.getPlatformFeatureNumber()
						+ 4 * introContext.getPlatformPluginNumber();
			else
				progressTarget = 2 * introContext.getPlatformFeatureNumber()
						+ 3 * introContext.getPlatformPluginNumber();

			introContext.addRepositoryToSave(IntrospectionContext.PLATFORM_KEY,
					myRepository);
		}

		// Case workspace only
		else if (introContext
				.getIntrospectionPerimeter()
				.equals(IntrospectorPreferenceMessages.IntrospectorPreferenceMessages_PerimeterIsWorkspaceOnly)) {

			introContext.setVisitPlatform(false);
			introContext.setVisitWorkspace(true);

			/*
			 * creation of the workspace repository
			 */
			Repository myRepository;
			myRepository = PlatformFactory.eINSTANCE.createRepository();
			myRepository.setName("workspace"); //$NON-NLS-1$
			myRepository.setRepositoryKind(RepositoryKind.WORKSPACE);

			if (introContext.isCreatePackages())
				progressTarget = 3 * introContext.getPlatformFeatureNumber()
						+ 4 * introContext.getWorkspacePluginNumber();
			else
				progressTarget = 2 * introContext.getPlatformFeatureNumber()
						+ 3 * introContext.getWorkspacePluginNumber();

			introContext.addRepositoryToSave(
					IntrospectionContext.WORKSPACE_KEY, myRepository);
		}

		// Case Workspace + platform
		else {

			introContext.setVisitPlatform(true);
			introContext.setVisitWorkspace(true);

			/*
			 * creation of repositories
			 */

			Repository platformRepo;
			platformRepo = PlatformFactory.eINSTANCE.createRepository();
			platformRepo.setName(productName);
			platformRepo.setRepositoryKind(RepositoryKind.PLATFORM);

			Repository workspaceRepo;
			workspaceRepo = PlatformFactory.eINSTANCE.createRepository();
			workspaceRepo.setName(IntrospectionContext.WORKSPACE_KEY);
			workspaceRepo.setRepositoryKind(RepositoryKind.WORKSPACE);

			if (introContext.isCreatePackages())
				progressTarget = 3 * introContext.getPlatformFeatureNumber()
						+ 4 * introContext.getPlatformPluginNumber() + 4
						* introContext.getWorkspacePluginNumber() + 3
						* introContext.getPlatformFeatureNumber();
			else
				progressTarget = 2 * introContext.getPlatformFeatureNumber()
						+ 3 * introContext.getPlatformPluginNumber() + 3
						* introContext.getWorkspacePluginNumber() + 2
						* introContext.getPlatformFeatureNumber();

			introContext.addRepositoryToSave(IntrospectionContext.PLATFORM_KEY,
					platformRepo);

			introContext.addRepositoryToSave(
					IntrospectionContext.WORKSPACE_KEY, workspaceRepo);
		}

		// ---------------------------------------------------------------------------

		// Create Model
		// ---------------------------------------------------------------------------

		// Launch of the introspection task of the progress monitor
		if (monitor != null)
			monitor.beginTask("Introspection ", progressTarget);

		// create plugins
		PluginServices.createPlugins(introContext, monitor, myEclipseModel);

		// create features
		FeatureServices.createFeatures(introContext, monitor);

		Collection<Repository> repositories = introContext
				.getRepositoryToSaveHashMap().values();

		for (Repository myRepository : repositories) {
			// Create packages
			EList<Plugin> plugins = myRepository.getPlugins();
			EList<Feature> features = myRepository.getFeatures();
			if (introContext.isCreatePackages())
				PackageServices.createPackages(introContext, monitor,
						myRepository);
			else {
				PackageServices.sortPlugins(plugins);
				PackageServices.sortFeatures(features);
			}
		}

		EList<Repository> eclipseModelRepositories = myEclipseModel
				.getRepositories();
		EList<IntrospectionErrors> introspectionErrors = myEclipseModel
				.getIntrospectionErrors();
		Collection<IntrospectionError> introErrors = introContext
				.getIntroError();
		IntrospectionErrors errorsFolder = null;
		if (!introErrors.isEmpty()) {
			errorsFolder = PlatformFactory.eINSTANCE
					.createIntrospectionErrors();
			errorsFolder.setName("Errors");
			for (IntrospectionError introError : introErrors) {
				errorsFolder.getIntrospectionErrors().add(introError);
			}
			introspectionErrors.add(errorsFolder);
		}

		Collection<Repository> values = introContext
				.getRepositoryToSaveHashMap().values();
		eclipseModelRepositories.addAll(values);

		// ---------------------------------------------------------------------------

		// Return the created model !
		return myEclipseModel;
	}

}
