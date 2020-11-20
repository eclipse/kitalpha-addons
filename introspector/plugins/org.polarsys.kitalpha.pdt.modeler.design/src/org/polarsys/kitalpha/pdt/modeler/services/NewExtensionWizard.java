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
package org.polarsys.kitalpha.pdt.modeler.services;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class NewExtensionWizard extends Wizard implements INewWizard {

	private ISelection selection;
	private NewExtensionWizardPage extensionWizardPage;
	private NewExtensionElementWizardPage extensionElementWizardPage;

	public NewExtensionWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("New Extension ...");
		setTitleBarColor(new org.eclipse.swt.graphics.RGB(45, 45, 45));
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {
		return false;
	}

	public void addPages() {
		extensionWizardPage = new NewExtensionWizardPage(selection);
		addPage(extensionWizardPage);
		if (extensionWizardPage.isPageComplete()) {
			extensionElementWizardPage = new NewExtensionElementWizardPage(
					selection);
			extensionElementWizardPage.setExtensionName(extensionWizardPage
					.getTextName());
			addPage(extensionElementWizardPage);
		}
	}
}
