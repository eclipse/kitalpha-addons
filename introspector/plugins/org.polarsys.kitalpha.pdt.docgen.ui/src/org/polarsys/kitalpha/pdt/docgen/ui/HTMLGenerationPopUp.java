/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
