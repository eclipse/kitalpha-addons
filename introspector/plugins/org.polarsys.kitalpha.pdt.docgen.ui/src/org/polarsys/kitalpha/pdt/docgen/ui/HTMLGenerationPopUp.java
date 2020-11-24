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
package org.polarsys.kitalpha.pdt.docgen.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.pdt.docgen.wizard.general.HTMLDocGenWizard;
import org.polarsys.kitalpha.pdt.docgen.wizard.pages.HTMLDocGenWizardFirstPage;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class HTMLGenerationPopUp implements IObjectActionDelegate {

	IStructuredSelection selection;
	private Shell shell;
	public IWizardPage firstPage;

	@Override
	public void run(IAction action) {
		
		
		//creation and opening of my wizard
		IFile selectedFile = (IFile) selection.getFirstElement();
		HTMLDocGenWizard wizard = new HTMLDocGenWizard(selectedFile);
		firstPage = new HTMLDocGenWizardFirstPage(selectedFile);
		wizard.addPage(firstPage);
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);
		wizardDialog.open();

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}



}
