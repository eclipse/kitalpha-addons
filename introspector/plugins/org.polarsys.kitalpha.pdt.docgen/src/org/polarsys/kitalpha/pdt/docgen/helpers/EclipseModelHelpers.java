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
package org.polarsys.kitalpha.pdt.docgen.helpers;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class EclipseModelHelpers {
	
	private EclipseModelHelpers() {}
	
	public static String getEclipseModelName(EclipseModel currentModel){
		return currentModel.getName();
	}
	
	public static int getReferencedEclipseModelsCount(){
		
		//TODO retourner le nombre de model lié au model courant pour créer autant d'index helper 
		// int count = 0;
		// Resource eResource = currentModel.eResource();
		// ResourceSet resourceSet = eResource.getResourceSet();
		// EList<Resource> resources = resourceSet.getResources();
		return 0;
	}
	
	public static String getEclipseModelPage(EclipseModel currentModel,
			String projectName, String folderName, int indentationIndice) {

		StringBuilder stringBuilder = new StringBuilder();

		// get package's icon
		String imageFileName = LabelProviderHelper.getImageFileName(
				currentModel, projectName, folderName);

		String text = Helpers.getLabel(currentModel);

		// starting page's creation
		stringBuilder.append("<h" + indentationIndice + ">");
		stringBuilder.append("<img src=\"../icon/");
		stringBuilder.append(imageFileName);
		stringBuilder.append("\" alt=\"\"/>");
		stringBuilder.append(" " + text);
		stringBuilder.append("</h" + indentationIndice + ">");

		stringBuilder.append(getEclipseModelContents(currentModel, projectName,
				folderName, (indentationIndice + 1)));

		return stringBuilder.toString();
	}

	private static String getEclipseModelContents(EclipseModel currentModel,
			String projectName, String folderName, int indentationIndice) {

		StringBuilder stringBuilder = new StringBuilder();
		EList<Repository> repositories = null;

		if (currentModel.getRepositories() != null) {
			repositories = currentModel.getRepositories();
		}

		if (repositories != null) {
			stringBuilder.append(
					getContainedRepositoriesContent(projectName, folderName, (indentationIndice + 1), repositories));
		}

		return stringBuilder.toString();
	}

	private static String getContainedRepositoriesContent(String projectName, String folderName,
			int indentationIndice, EList<Repository> repositories) {

		StringBuilder stringBuilder = new StringBuilder();
		int repoNumber = 0;

		String title = "";
		String element = "";

		if (repositories != null) {
			repoNumber = repositories.size();
		}
		if (repoNumber == 1) {
			title = "Contained repository ";
			element = "(" + repoNumber + " element)";
		} else if (repoNumber > 1) {
			title = "Contained repositories ";
			element = "(" + repoNumber + " elements)";
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		// now i creat sub-packages' list
		if (repoNumber > 0) {
			stringBuilder.append("<ul style=\"list-style-type:disc\">");
			for (Repository repository : repositories) {
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						repository, projectName, folderName);
				stringBuilder.append("<img src=\"../icon/");
				stringBuilder.append(imageName);
				stringBuilder.append("\" alt=\"\"/>");
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(repository,
								LabelProviderHelper.getText(repository)));
				stringBuilder.append("</li>");
			}
			stringBuilder.append("</ul>");
		}

		return stringBuilder.toString();
	}
}
