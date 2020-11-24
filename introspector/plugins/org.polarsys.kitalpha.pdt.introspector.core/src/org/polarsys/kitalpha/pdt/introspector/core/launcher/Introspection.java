/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
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

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.exceptions.IntrospectionExceptions;
import org.polarsys.kitalpha.pdt.introspector.core.internal.rules.Activator;
import org.polarsys.kitalpha.pdt.introspector.core.messages.Messages;
import org.polarsys.kitalpha.pdt.introspector.core.services.PlatformServices;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceUtils;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * Class that ask eclipse to instrospect himself and know how it is composed
 * 
 * @author Xavier DECOOL
 * 
 */
public class Introspection implements IActionDelegate, ITaskProduction {

	// used for normal launch
	private static String modelPath;
	public static final IntrospectionContext introContext = new IntrospectionContext();
	private static IFolder folder;

	// used for fcore launcher
	private IPath path;
	private String projectName;
	private String outputFolder;
	private EclipseModel result = null;

	public static EclipseModel launchIntrospectionUsingSpecificContext() {
		EclipseModel myEclipseModel = PlatformFactory.eINSTANCE
				.createEclipseModel();
		try {
			myEclipseModel = Introspector.introspect(myEclipseModel, null,
					introContext, null);
		} catch (IntrospectionExceptions e) {

			IStatus errorStatus = new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					Messages.ErrorPlatformInterospectionInvocation, e);
			StatusManager.getManager().handle(errorStatus);

		}
		return myEclipseModel;

	}

	public static IntrospectionContext getIntroContextInstance() {
		return introContext;
	}

	// Setting up context for generate a workspace model
	public static void setUpContextRelativeToAutoDeliveryAndLaunchIntrospection() {

		introContext.setActivateIncrementalIntrospection(false);
		introContext.setCreatePackages(false);
		introContext.setStoreIntrospectionIssues(false);
		introContext
				.setIntrospectionPerimeter(Messages.WorkspaceOnlyIntrospectionPerimeter);

	}

	public static void setUpContextAccordingToPreferences() {
		// Retrieve preferences and store them in introcontext
		// --------------------------------------------------------------------------

		// Retrieve preferences ---->

		// Introspection Perimeter
		String introspectionPerimeter = IntrospectorPreferenceUtils
				.getIntrospectionPerimeter();
		introContext.setIntrospectionPerimeter(introspectionPerimeter);

		// Incremental introspection
		boolean activateIncrementalIntrospection = IntrospectorPreferenceUtils
				.getActivateIncrementalIntrospection();
		introContext
				.setActivateIncrementalIntrospection(activateIncrementalIntrospection);

		String incrementalIntrospection = IntrospectorPreferenceUtils
				.getIncrementalIntrospection();
		introContext.setIncrementalIntrospection(incrementalIntrospection);

		// Advanced Settings
		boolean createPackages = IntrospectorPreferenceUtils
				.getCreatePackageSetting();
		introContext.setCreatePackages(createPackages);

		boolean storeIntrospectionIssue = IntrospectorPreferenceUtils
				.getStoreIntrospectionIssue();
		introContext.setStoreIntrospectionIssues(storeIntrospectionIssue);

		boolean qualifierMatch = IntrospectorPreferenceUtils
				.getQualifierMatch();
		introContext.setQualifierMatch(qualifierMatch);

		// criterias
		SearchCriteria criteria = IntrospectorPreferenceUtils.getCriteria();
		introContext.setCriteria(criteria);
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {

		// Opening the progress monitor dialog
		ProgressMonitorDialog pd = new ProgressMonitorDialog(null);
		try {
			pd.run(true, true, new IRunnableWithProgress() {

				// Creation of a progress monitor
				public void run(IProgressMonitor monitor) {

					// Start introspection
					startIntrospection(monitor, folder, true);
				}
			});
		}

		// and catch few other exceptions
		catch (InvocationTargetException e) {

			IStatus errorStatus = new Status(IStatus.ERROR,
					Activator.PLUGIN_ID,
					Messages.ErrorPlatformInterospectionInvocation, e);
			StatusManager.getManager().handle(errorStatus);

		} catch (InterruptedException e) {

			IStatus warningStatus = new Status(IStatus.WARNING,
					Activator.PLUGIN_ID,
					Messages.WarningPlatformIntrospectionException, e);
			StatusManager.getManager().handle(warningStatus);

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action
	 * .IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();

			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			IPath location = root.getLocation();

			while (iterator.hasNext()) {
				Object obj = iterator.next();
				if (obj instanceof IFolder) {
					folder = (IFolder) obj;
					IPath fullPath = folder.getFullPath();
					File file = new File(location.toString()
							+ fullPath.toString());
					modelPath = file.getAbsolutePath();
				}
			}
		}
	}

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// setting the context
		projectName = productionContext.getInputValue("projectName", //$NON-NLS-1$
				String.class);
		outputFolder = productionContext.getInputValue("outputFolder", //$NON-NLS-1$
				String.class);
		path = new Path(projectName + "/" + outputFolder); //$NON-NLS-1$
		folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
		if (!folder.exists()) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				String message = NLS.bind(
						Messages.FolderDoesNotExist_Creation_Information,
						folder.getLocation());
				IStatus infoStatus = new Status(IStatus.INFO,
						Activator.PLUGIN_ID, message);
				StatusManager.getManager().handle(infoStatus);
			}
		}
		modelPath = folder.getLocation().toString();
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		startIntrospection(monitor, folder, true);

	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		if (!monitor.isCanceled()) {
			ResourceSet resourceSet = introContext.getResourceSet();
			PlatformServices.savePlatformModel(result, modelPath, resourceSet,
					introContext);

			// finally reset introcontext...
			introContext.reset();
		}
	}

	public static void startIntrospection(IProgressMonitor monitor,
			IFolder destinationFolder, boolean usePreferences) {

		EclipseModel myEclipseModel = PlatformFactory.eINSTANCE
				.createEclipseModel();
		String modelName = introContext.getModelName();
		if(!modelName.isEmpty())
			myEclipseModel.setName(modelName);
		else
			myEclipseModel.setName("Eclipse Model");
		if (usePreferences)
			setUpContextAccordingToPreferences();
		folder = destinationFolder;

		EclipseModel result = null;
		try {
			result = Introspector.introspect(myEclipseModel, monitor,
					introContext, folder);
		}

		catch (IntrospectionExceptions e) {

			IStatus warningStatus = new Status(IStatus.WARNING,
					Activator.PLUGIN_ID,
					Messages.WarningPlatformIntrospectionException, e);
			StatusManager.getManager().handle(warningStatus);
			introContext.reset();
		}

		// Save the created introspection model
		if (!monitor.isCanceled()) {
			ResourceSet resourceSet = introContext.getResourceSet();
			modelPath = folder.getLocation().toString();
			PlatformServices.savePlatformModel(result, modelPath, resourceSet,
					introContext);

			// finally reset introcontext...
			introContext.reset();
		}
	}

}
