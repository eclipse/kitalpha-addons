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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class PackagesHelpers {

	public static String getPackagePage(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentPackage,
			String projectName, String folderName, int indentationIndice) {

		StringBuffer buffer = new StringBuffer();

		String imageFileName = LabelProviderHelper.getImageFileName(
				currentPackage, projectName, folderName);

		String text = Helpers.getLabel(currentPackage);

		buffer.append("<h" + indentationIndice + ">");
		buffer.append("<img src=\"../icon/");
		buffer.append(imageFileName);
		buffer.append("\" alt=\"\"/>");
		buffer.append(" " + text);
		buffer.append("</h" + indentationIndice + ">");

		buffer.append(getPackageContents(currentPackage, projectName,
				folderName, (indentationIndice + 1)));

		return buffer.toString();
	}

	private static String getPackageContents(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentPackage,
			String projectName, String folderName, int indentationIndice) {

		StringBuffer buffer = new StringBuffer();

		EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> subPackages = null;
		EList<Plugin> plugins = null;
		EList<Feature> features = null;

		// packages
		if (currentPackage.getSubPackages() != null) {
			subPackages = currentPackage.getSubPackages();
		}

		// features
		if (currentPackage.getFeatures() != null) {
			features = currentPackage.getFeatures();
		}

		// plugins
		if (currentPackage.getPlugins() != null) {
			plugins = currentPackage.getPlugins();
		}

		if ((plugins != null) || (features != null) || (subPackages != null))
			buffer.append("<h" + indentationIndice + ">" + "Contents" + "</h"
					+ indentationIndice + ">");

		// i create the content of sub-packages
		if (subPackages != null)
			buffer.append(getSubPackagesContent(currentPackage, projectName,
					folderName, (indentationIndice + 1), subPackages));

		// i create content of features
		if (features != null)
			buffer.append(getContainedFeaturesContent(currentPackage,
					projectName, folderName, (indentationIndice + 1), features));

		// i create content of plugins
		if (plugins != null)
			buffer.append(getContainedPluginsContent(currentPackage,
					projectName, folderName, (indentationIndice + 1), plugins));

		return buffer.toString();
	}

	private static String getContainedPluginsContent(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentPackage,
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

	private static String getContainedFeaturesContent(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentPackage,
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

	private static String getSubPackagesContent(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentPackage,
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
