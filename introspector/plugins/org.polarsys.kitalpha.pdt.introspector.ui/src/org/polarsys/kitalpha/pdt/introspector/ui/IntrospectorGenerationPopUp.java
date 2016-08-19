package org.polarsys.kitalpha.pdt.introspector.ui;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.pdt.introspector.ui.wizard.IntrospectorWizard;
import org.polarsys.kitalpha.pdt.introspector.ui.wizard.pages.IntrospectionWizardFirstPage;

public class IntrospectorGenerationPopUp implements IObjectActionDelegate {

	IStructuredSelection selection;
	public IWizardPage firstPage;

	@Override
	public void run(IAction action) {

		// creation and opening of my wizard
		IFolder selectedFolder = (IFolder) selection.getFirstElement();
		IntrospectorWizard wizard = new IntrospectorWizard(selectedFolder);
		firstPage = new IntrospectionWizardFirstPage(selectedFolder);
		wizard.addPage(firstPage);
		wizard.setNeedsProgressMonitor(true);
		wizard.init(PlatformUI.getWorkbench(), null);
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
