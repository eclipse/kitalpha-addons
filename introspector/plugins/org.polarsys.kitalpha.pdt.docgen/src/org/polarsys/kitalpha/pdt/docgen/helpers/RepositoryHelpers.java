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
package org.polarsys.kitalpha.pdt.docgen.helpers;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class RepositoryHelpers {
	public static String getRepositoryPage(Repository currentRepo,
			String projectName, String folderName, int indentationIndice) {

		StringBuffer buffer = new StringBuffer();

		String imageFileName = LabelProviderHelper.getImageFileName(
				currentRepo, projectName, folderName);

		String text = Helpers.getLabel(currentRepo) + " : "
				+ currentRepo.getRepositoryKind().toString();

		//starting page's creation
		buffer.append("<h" + indentationIndice + ">");
		buffer.append("<img src=\"../icon/");
		buffer.append(imageFileName);
		buffer.append("\" alt=\"\"/>");
		buffer.append(" " + text);
		buffer.append("</h" + indentationIndice + ">");

		buffer.append(getRepositoryContents(currentRepo, projectName,
				folderName, (indentationIndice + 1)));

		return buffer.toString();

	}

	private static String getRepositoryContents(Repository currentRepo,
			String projectName, String folderName, int indentationIndice) {

		StringBuffer buffer = new StringBuffer();
		EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> subPackages = null;
		EList<Plugin> plugins = null;
		EList<Feature> features = null;

		// packages
		if (currentRepo.getPackages() != null) {
			subPackages = currentRepo.getPackages();
		}

		// features
		if (currentRepo.getFeatures() != null) {
			features = currentRepo.getFeatures();
		}

		// plugins
		if (currentRepo.getPlugins() != null) {
			plugins = currentRepo.getPlugins();
		}

		if ((plugins != null) || (features != null) || (subPackages != null))
			buffer.append("<h" + indentationIndice + ">" + "Contents" + "</h"
					+ indentationIndice + ">");

		// Creating content of sub-packages
		if (subPackages != null)
			buffer.append(getSubPackagesContent(currentRepo, projectName,
					folderName, (indentationIndice + 1), subPackages));

		// Creating content of features
		if (features != null)
			buffer.append(getContainedFeaturesContent(currentRepo, projectName,
					folderName, (indentationIndice + 1), features));

		// Creating content of plugins
		if (plugins != null)
			buffer.append(getContainedPluginsContent(currentRepo, projectName,
					folderName, (indentationIndice + 1), plugins));

		return buffer.toString();
	}

	private static String getContainedPluginsContent(Repository currentRepo,
			String projectName, String folderName, int indentationIndice,
			EList<Plugin> plugins) {

		StringBuffer buffer = new StringBuffer();
		int pluginsNumber = 0;

		String title = "";
		String element = "";

		if (plugins != null) {
			pluginsNumber = plugins.size();
		}
		if (pluginsNumber == 1) {
			title = "Contained plugin ";
			element = "(" + pluginsNumber + " element)";
		} else if (pluginsNumber > 1) {
			title = "Contained plugins ";
			element = "(" + pluginsNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		if (pluginsNumber > 0) {
			buffer.append("<ul style=\"list-style-type:disc\">");
			for (Plugin plugin : plugins) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(plugin,
						projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(plugin,
								LabelProviderHelper.getText(plugin)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getContainedFeaturesContent(Repository currentRepo,
			String projectName, String folderName, int indentationIndice,
			EList<Feature> features) {

		StringBuffer buffer = new StringBuffer();
		int featuresNumber = 0;

		String title = "";
		String element = "";

		if (features != null) {
			featuresNumber = features.size();
		}
		if (featuresNumber == 1) {
			title = "Contained feature ";
			element = "(" + featuresNumber + " element)";
		} else if (featuresNumber > 1) {
			title = "Contained features ";
			element = "(" + featuresNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		if (featuresNumber > 0) {
			buffer.append("<ul style=\"list-style-type:disc\">");
			for (Feature feature : features) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						feature, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(feature,
								LabelProviderHelper.getText(feature)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getSubPackagesContent(Repository currentRepo,
			String projectName, String folderName, int indentationIndice,
			EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> subPackages) {

		StringBuffer buffer = new StringBuffer();
		int subPackagesNumber = 0;

		String title = "";
		String element = "";

		if (subPackages != null) {
			subPackagesNumber = subPackages.size();
		}
		if (subPackagesNumber == 1) {
			title = "Contained package ";
			element = "(" + subPackagesNumber + " element)";
		} else if (subPackagesNumber > 1) {
			title = "Contained packages ";
			element = "(" + subPackagesNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		if (subPackagesNumber > 0) {
			buffer.append("<ul style=\"list-style-type:disc\">");
			for (org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentSubPackage : subPackages) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						currentSubPackage, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(currentSubPackage,
								LabelProviderHelper.getText(currentSubPackage)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}
}
