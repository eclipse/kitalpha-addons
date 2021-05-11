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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class FeatureHelpers {

	private FeatureHelpers() {}
	
	public static String getFeaturePage(Feature feature, String projectName,
			String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		String imageFileName = LabelProviderHelper.getImageFileName(feature,
				projectName, folderName);

		// Get feature's id
		String text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers
				.getLabel(feature);

		stringBuilder.append("<h" + indentationIndice + ">");
		stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
		stringBuilder.append(imageFileName);
		stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
		stringBuilder.append(" " + text);
		stringBuilder.append("</h" + indentationIndice + ">");

		stringBuilder.append(getFeatureIdAndMetadataTable(feature, indentationIndice + 1));

		stringBuilder.append(getFeatureDetailsContent(feature, projectName,
				folderName, indentationIndice + 1));

		return stringBuilder.toString();
	}

	private static String getFeatureIdAndMetadataTable(Feature feature, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("<h" + indentationIndice + ">");
		stringBuilder.append("Identification & Metadata");
		stringBuilder.append("</h" + indentationIndice + ">");

		// Feature's information
		String featureID = feature.getId();
		String featureVersion = feature.getVersion();
		String featureDescription = feature.getFeatureDescription();
		String featureProvider = feature.getProvider();
		String featureCopyright = feature.getCopyrightNotice();
		String licenseAgreement = feature.getLicenseAgreement();
		String sitesToVisit = feature.getSitesToVisit();

		// Then i create my table
		stringBuilder.append("<table align=\"center\">");
		stringBuilder.append("<thead>");

		// 1st line : head
		stringBuilder.append("<tr>");
		stringBuilder.append("<th> Field </th>");
		stringBuilder.append("<th> Value </th>");
		stringBuilder.append(Constants.TR_CLOSE);
		stringBuilder.append("</thead>");
		stringBuilder.append("<tbody>");

		// 2nd line : id
		stringBuilder.append("<tr>");
		stringBuilder.append("<td>Identifier</td>");
		stringBuilder.append("<td>" + featureID + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		// 3rd line : version
		stringBuilder.append("<tr>");
		stringBuilder.append("<td>Version</td>");
		stringBuilder.append("<td>" + featureVersion + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		// 4rd line : Description
		stringBuilder.append("<tr>");
		stringBuilder.append("<td>Description</td>");
		stringBuilder.append("<td>" + featureDescription + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		// 5rd line : Provider
		stringBuilder.append("<tr>");
		stringBuilder.append("<td>Provider</td>");
		stringBuilder.append("<td>" + featureProvider + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		// 6rd line : Copyright notice
		stringBuilder.append("<tr>");
		stringBuilder.append("<td>Copyright Notice</td>");
		stringBuilder.append("<td>" + featureCopyright + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		// 7rd line : licence agreement
		stringBuilder.append("<tr>");
		stringBuilder.append("<td>License Agreement</td>");
		stringBuilder.append("<td>" + licenseAgreement + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		// 8rd line : sites to visit
		stringBuilder.append("<tr>");
		stringBuilder.append("<td>Sites to visit</td>");
		stringBuilder.append("<td>" + sitesToVisit + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		stringBuilder.append("</tbody>");
		stringBuilder.append("</table>");
		return stringBuilder.toString();
	}

	private static String getFeatureDetailsContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		if ((feature.getFeatureDependencies() != null)
				|| (feature.getPluginDependencies() != null)
				|| (feature.getFeatureInclusions() != null)
				|| (feature.getIncludedPlugins() != null)) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append("Details");
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		// Sub menu for dependencies
		if ((feature.getFeatureDependencies() != null)
				|| (feature.getPluginDependencies() != null)) {
			stringBuilder.append("<h" + (indentationIndice + 1) + ">");
			stringBuilder.append("Dependencies");
			stringBuilder.append("</h" + (indentationIndice + 1) + ">");
		}

		// feature dependencies
		if (feature.getFeatureDependencies() != null)
			stringBuilder.append(getFeatureDependenciesContent(feature, projectName,
					folderName, indentationIndice + 2));

		// plugin dependencies
		if (feature.getPluginDependencies() != null)
			stringBuilder.append(getFeaturePluginDependenciesContent(feature,
					projectName, folderName, indentationIndice + 2));

		// Sub-menu for inclusions
		if ((feature.getFeatureInclusions() != null)
				|| (feature.getIncludedPlugins() != null)) {
			stringBuilder.append("<h" + (indentationIndice + 1) + ">");
			stringBuilder.append("Inclusions");
			stringBuilder.append("</h" + (indentationIndice + 1) + ">");
		}

		// Included features
		if (feature.getFeatureInclusions() != null)
			stringBuilder.append(getIncludedFeaturesContent(feature, projectName,
					folderName, indentationIndice + 2));

		// Included plugins
		if (feature.getIncludedPlugins() != null)
			stringBuilder.append(getIncludedPluginsContent(feature, projectName,
					folderName, indentationIndice + 2));

		return stringBuilder.toString();
	}

	private static String getIncludedPluginsContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();
		int includedPluginsNumber = 0;
		String title = "";
		String element = "";

		// included plugins
		IncludedPlugins includedPluginsFolder = feature.getIncludedPlugins();
		EList<Plugin> includedPlugins = null;
		if (includedPluginsFolder != null) {
			includedPlugins = includedPluginsFolder.getIncludedPlugins();
		}
		if (includedPlugins != null)
			includedPluginsNumber = includedPlugins.size();

		if (includedPluginsNumber == 1) {
			title = "Included Plugin ";
			element = "(" + includedPluginsNumber + Constants.ELEMENT;
		} else if (includedPluginsNumber > 1) {
			title = "Included Plugins ";
			element = "(" + includedPluginsNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		// Then i create my list
		if (includedPlugins != null && !includedPlugins.isEmpty()) {
			// included plugins
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (Plugin includedPlugin : includedPlugins) {
				Plugin target = includedPlugin;
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						includedPlugin, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(includedPlugin)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static Object getIncludedFeaturesContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();
		int includedFeaturesNumber = 0;
		String title = "";
		String element = "";

		// feature inclusions
		FeatureInclusions featureInclusionsFolder = feature
				.getFeatureInclusions();
		EList<FeatureInclusion> featureInclusions = null;
		if (featureInclusionsFolder != null) {
			featureInclusions = featureInclusionsFolder.getFeatureInclusions();
		}
		if (featureInclusions != null)
			includedFeaturesNumber = featureInclusions.size();
		if (includedFeaturesNumber == 1) {
			title = "Included Feature ";
			element = "(" + includedFeaturesNumber + Constants.ELEMENT;
		} else if (includedFeaturesNumber > 1) {
			title = "Included Features ";
			element = "(" + includedFeaturesNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		// The i create my list
		if (featureInclusions != null && !featureInclusions.isEmpty()) {
			// feature inclusions
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (FeatureInclusion featureInclusion : featureInclusions) {
				Feature target = featureInclusion.getIncludedFeature();
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						featureInclusion, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(featureInclusion)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static String getFeatureDependenciesContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		int featureDependenciesNumber = 0;
		String title = "";
		String element = "";

		// feature dependencies
		FeatureDependencies featureDependenciesFolder = feature
				.getFeatureDependencies();
		EList<FeatureDependency> featureDependencies = null;
		if (featureDependenciesFolder != null) {
			featureDependencies = featureDependenciesFolder
					.getFeatureDependencies();
		}
		if (featureDependencies != null) {
			featureDependenciesNumber = featureDependencies.size();
		}
		if (featureDependenciesNumber == 1) {
			title = "Feature Dependency ";
			element = "(" + featureDependenciesNumber + Constants.ELEMENT;
		} else if (featureDependenciesNumber > 1) {
			title = "Feature Dependencies ";
			element = "(" + featureDependenciesNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		// feature dependances
		if (featureDependencies != null && !featureDependencies.isEmpty()) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (FeatureDependency featureDependency : featureDependencies) {
				Feature target = featureDependency.getTarget();
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						featureDependency, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(featureDependency)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static String getFeaturePluginDependenciesContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		int pluginDependenciesNumber = 0;
		String title = "";
		String element = "";
		FeaturePluginDependencies featurePluginDependenciesFolder = feature
				.getPluginDependencies();
		EList<FeatureToPluginDependency> featurePluginDependencies = null;
		if (featurePluginDependenciesFolder != null) {
			featurePluginDependencies = featurePluginDependenciesFolder
					.getPluginDependencies();
		}
		if (featurePluginDependencies != null) {
			pluginDependenciesNumber = featurePluginDependencies.size();
		}

		if (pluginDependenciesNumber == 1) {
			title = "Plugin Dependency ";
			element = "(" + pluginDependenciesNumber + Constants.ELEMENT;
		} else if (pluginDependenciesNumber > 1) {
			title = "Plugin Dependencies ";
			element = "(" + pluginDependenciesNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		if (featurePluginDependencies != null && !featurePluginDependencies.isEmpty()) {
			// plugin dependencies
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (FeatureToPluginDependency featurePluginDependency : featurePluginDependencies) {
				Plugin target = featurePluginDependency.getTarget();
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						featurePluginDependency, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(target, LabelProviderHelper
								.getText(featurePluginDependency)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

}
