package org.polarsys.kitalpha.pdt.introspector.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.launcher.Introspection;
import org.polarsys.kitalpha.pdt.introspector.internal.ui.Activator;
import org.polarsys.kitalpha.pdt.introspector.preferences.utils.IntrospectorPreferenceUtils;
import org.polarsys.kitalpha.pdt.introspector.ui.wizard.pages.IntrospectionWizardFirstPage;

/**
 * 
 * @author Xavier DECOOL
 * 
 */
public class IntrospectorWizard extends Wizard implements INewWizard {

	private IFolder selection;
	private IntrospectionContext introContext = Introspection
			.getIntroContextInstance();
	private IntrospectionWizardFirstPage firstPage; 

	// constructeur
	public IntrospectorWizard(IFolder selection) {
		super();
		this.selection = selection;
		this.setWindowTitle("Eclipse Introspection");
		this.setNeedsProgressMonitor(false);
	}

	@Override
	public boolean performFinish() {
		
		//retrieve the first page for check values and store it into context/preferences
		firstPage = (IntrospectionWizardFirstPage) this.getStartingPage();
		introContext.setModelName(firstPage.getModelName());
		introContext.setFilterRegEx(firstPage
				.getSpecifiedFilterRegex());
		final boolean overridePreferences = firstPage
				.preferencesHaveBeenOverriden();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				setUpIntrospectionParameters(overridePreferences, monitor);
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InvocationTargetException e) {
			Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error during perform finish", e));
		} catch (InterruptedException e) {
			Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error during perform finish", e));
		}
		return true;
	}

	private void setUpIncrementalIntrospectionType(boolean overridePreferences) {
		String incrementalIntrospectionType = firstPage
				.getIncrementalIntrospectionType();
		switch (incrementalIntrospectionType) {
		case "sameFolder":
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIncrementalIntrospectionType("reuseFromFolder");
			else
				introContext.setIncrementalIntrospection("reuseFromFolder");
			break;
		case "sameWorkspace":
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIncrementalIntrospectionType("reuseFromWorkspace");
			else
				introContext.setIncrementalIntrospection("reuseFromWorkspace");
			break;
		case "modelreuse":
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIncrementalIntrospectionType("reuseFromResourceReuse");
			else
				introContext
						.setIncrementalIntrospection("reuseFromResourceReuse");
			introContext
					.setCriteria(firstPage.getCriteria());
			break;
		default:
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIncrementalIntrospectionType("reuseFromWorkspace");
			else
				introContext.setIncrementalIntrospection("reuseFromWorkspace");
			break;
		}
	}
	
	private void setUpIntrospectionParameters(
			final boolean overridePreferences, IProgressMonitor monitor) {
		if (overridePreferences) {
			setUpIntrospectionPerimeter(true);
			// incremental introspeciton
			if (firstPage.isIncremental()) {
				IntrospectorPreferenceUtils
						.setIncrementalIntrospectionStatut(true);
			} else
				IntrospectorPreferenceUtils
						.setIncrementalIntrospectionStatut(false);

			// set incremental type
			setUpIncrementalIntrospectionType(true);

			IntrospectorPreferenceUtils
					.setCreatePackageSetting(firstPage
							.createPackages());
			IntrospectorPreferenceUtils
					.setIntrospectionIssuesStorageStatut(firstPage
							.storeIntrospectionIssues());
			IntrospectorPreferenceUtils
					.setQualifierMatchingSetting(firstPage
							.ignoreQualifier());
			IntrospectorPreferenceUtils.setCriteria(firstPage.getCriteria());
			// then launch introspection
			Introspection.startIntrospection(monitor, selection, overridePreferences);
		}

		else {
			// set du context
			// Introspection Perimeter
			introContext
					.setIntrospectionPerimeter(firstPage
							.getIntrospectionPerimeter());
			setUpIntrospectionPerimeter(false);

			// Incremental introspection
			introContext
					.setActivateIncrementalIntrospection(firstPage
							.isIncremental());
			setUpIncrementalIntrospectionType(false);

			// Advanced Settings
			introContext.setCreatePackages(firstPage
					.createPackages());
			introContext
					.setStoreIntrospectionIssues(firstPage
							.storeIntrospectionIssues());
			introContext.setQualifierMatch(firstPage
					.ignoreQualifier());
			introContext.setCriteria(firstPage.getCriteria());
			// then launch introspection
			Introspection.startIntrospection(monitor, selection, overridePreferences);
		}
	}

	private void setUpIntrospectionPerimeter(boolean overridePreferences) {

		// introspection perimeter
		String introspectionPerimeter = firstPage
				.getIntrospectionPerimeter();
		switch (introspectionPerimeter) {
		case "platform":
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIntrospectionPerimeter("platformOnly");
			else
				introContext.setIntrospectionPerimeter("platformOnly");
			break;
		case "workspace":
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIntrospectionPerimeter("workspaceOnly");
			else
				introContext.setIntrospectionPerimeter("workspaceOnly");
			break;
		case "both":
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIntrospectionPerimeter("platformAndWorkspace");
			else
				introContext.setIntrospectionPerimeter("platformAndWorkspace");
			break;
		default:
			if (overridePreferences)
				IntrospectorPreferenceUtils
						.setIntrospectionPerimeter("platformOnly");
			else
				introContext.setIntrospectionPerimeter("platformOnly");
			break;
		}
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		Display display = workbench.getDisplay();
		WizardDialog wizardDialog = new WizardDialog(display.getActiveShell(),
				this);
		wizardDialog.open();
	}

}
