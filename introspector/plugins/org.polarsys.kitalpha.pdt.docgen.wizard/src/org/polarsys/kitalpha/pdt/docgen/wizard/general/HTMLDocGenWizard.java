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
package org.polarsys.kitalpha.pdt.docgen.wizard.general;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.wizard.Wizard;
import org.polarsys.kitalpha.pdt.docgen.wizard.actions.HTMLDocLoaderAndLauncher;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class HTMLDocGenWizard extends Wizard {

	private IFile selection;
	private String modelPath;
	private String projectName;
	private String cssDestinationFolder = "/css";
	private String cssSourceFolder = "platform:/plugin/org.polarsys.kitalpha.pdt.docgen/CSS";


	// constructeur
	public HTMLDocGenWizard(IFile selection) {
		super();
		this.selection = selection;
		this.setWindowTitle("HTML documentation generation");
		this.setNeedsProgressMonitor(false);
	}

	@Override
	public boolean performFinish() {

		projectName = selection.getProject().getName();
		modelPath = projectName + "/"
				+ selection.getProjectRelativePath().toString();
		HTMLDocGenContext context = HTMLDocGenContext.INSTANCE;
		//Logger.getLogger().info("J'ai cliqué sur perform finish");

		// if i store my result in the current folder
		if (context.currentRepositoryIsChecked()) {
			context.setProjectName(projectName);
			// i set my output folder name
			IContainer currentFolder = selection.getParent();
			if (currentFolder instanceof IFolder) {
				// my model is contained by a folder
				context.setOutputFolderName(((IFolder) currentFolder).getName());
			}
		}

		context.setCSSSourceFolder(cssSourceFolder);
		context.setCSSOutputFolder(cssDestinationFolder);
		context.setModelPath(modelPath);
		context.setPlatformModelURI(URI.createPlatformResourceURI(modelPath,
				true));

		HTMLDocLoaderAndLauncher HTMLlauncher = new HTMLDocLoaderAndLauncher();

		// here i give parameters that coming from my wizard
		HTMLlauncher.launchActivity();
		
		return true;
	}
}
