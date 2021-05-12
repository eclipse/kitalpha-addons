/*******************************************************************************
 * Copyright (c) 2016, 2021 Thales Global Services S.A.S.
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
	
	private PackagesHelpers() {}

	public static String getPackagePage(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentPackage,
			String projectName, String folderName, int indentationIndice) {

		StringBuilder stringBuilder = new StringBuilder();

		String imageFileName = LabelProviderHelper.getImageFileName(
				currentPackage, projectName, folderName);

		String text = Helpers.getLabel(currentPackage);

		stringBuilder.append("<h" + indentationIndice + ">");
		stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
		stringBuilder.append(imageFileName);
		stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
		stringBuilder.append(" " + text);
		stringBuilder.append("</h" + indentationIndice + ">");

		stringBuilder.append(getPackageContents(currentPackage, projectName,
				folderName, (indentationIndice + 1)));

		return stringBuilder.toString();
	}

	private static String getPackageContents(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentPackage,
			String projectName, String folderName, int indentationIndice) {

		StringBuilder stringBuilder = new StringBuilder();

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
			stringBuilder.append("<h" + indentationIndice + ">" + "Contents" + "</h"
					+ indentationIndice + ">");

		// i create the content of sub-packages
		if (subPackages != null)
			stringBuilder.append(getSubPackagesContent(projectName, folderName, (indentationIndice + 1), subPackages));

		// i create content of features
		if (features != null)
			stringBuilder
					.append(getContainedFeaturesContent(projectName, folderName, (indentationIndice + 1), features));

		// i create content of plugins
		if (plugins != null)
			stringBuilder.append(getContainedPluginsContent(projectName, folderName, (indentationIndice + 1), plugins));

		return stringBuilder.toString();
	}

	private static String getContainedPluginsContent(String projectName, String folderName, int indentationIndice,
			EList<Plugin> plugins) {

		StringBuilder stringBuilder = new StringBuilder();
		int pluginsNumber = 0;

		String title = "";
		String element = "";

		if (plugins != null) {
			pluginsNumber = plugins.size();
		}
		if (pluginsNumber == 1) {
			title = "Contained plugin ";
			element = "(" + pluginsNumber + Constants.ELEMENT;
		} else if (pluginsNumber > 1) {
			title = "Contained plugins ";
			element = "(" + pluginsNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		if (pluginsNumber > 0) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (Plugin plugin : plugins) {
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(plugin,
						projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(plugin,
								LabelProviderHelper.getText(plugin)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static String getContainedFeaturesContent(String projectName, String folderName, int indentationIndice,
			EList<Feature> features) {

		StringBuilder stringBuilder = new StringBuilder();
		int featuresNumber = 0;

		String title = "";
		String element = "";

		if (features != null) {
			featuresNumber = features.size();
		}
		if (featuresNumber == 1) {
			title = "Contained feature ";
			element = "(" + featuresNumber + Constants.ELEMENT;
		} else if (featuresNumber > 1) {
			title = "Contained features ";
			element = "(" + featuresNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		if (featuresNumber > 0) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (Feature feature : features) {
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						feature, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(feature,
								LabelProviderHelper.getText(feature)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static String getSubPackagesContent(String projectName, String folderName, int indentationIndice,
			EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> subPackages) {

		StringBuilder stringBuilder = new StringBuilder();
		int subPackagesNumber = 0;

		String title = "";
		String element = "";

		if (subPackages != null) {
			subPackagesNumber = subPackages.size();
		}
		if (subPackagesNumber == 1) {
			title = "Contained package ";
			element = "(" + subPackagesNumber + Constants.ELEMENT;
		} else if (subPackagesNumber > 1) {
			title = "Contained packages ";
			element = "(" + subPackagesNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		if (subPackagesNumber > 0) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_DISC_OPEN);
			for (org.polarsys.kitalpha.pdt.metamodel.model.platform.Package currentSubPackage : subPackages) {
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						currentSubPackage, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(currentSubPackage,
								LabelProviderHelper.getText(currentSubPackage)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}
}
