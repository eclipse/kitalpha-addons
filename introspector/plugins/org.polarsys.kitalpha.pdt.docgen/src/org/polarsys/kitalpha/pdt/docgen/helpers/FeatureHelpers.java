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

	public static String getFeaturePage(Feature feature, String projectName,
			String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

		String imageFileName = LabelProviderHelper.getImageFileName(feature,
				projectName, folderName);

		// Get feature's id
		String text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers
				.getLabel(feature);

		buffer.append("<h" + indentationIndice + ">");
		buffer.append("<img src=\"../icon/");
		buffer.append(imageFileName);
		buffer.append("\" alt=\"\"/>");
		buffer.append(" " + text);
		buffer.append("</h" + indentationIndice + ">");

		buffer.append(getFeatureIdAndMetadataTable(feature, projectName,
				folderName, indentationIndice + 1));

		buffer.append(getFeatureDetailsContent(feature, projectName,
				folderName, indentationIndice + 1));

		return buffer.toString();
	}

	private static String getFeatureIdAndMetadataTable(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

		buffer.append("<h" + indentationIndice + ">");
		buffer.append("Identification & Metadata");
		buffer.append("</h" + indentationIndice + ">");

		// Feature's information
		String featureID = feature.getId();
		String featureVersion = feature.getVersion();
		String featureDescription = feature.getFeatureDescription();
		String featureProvider = feature.getProvider();
		String featureCopyright = feature.getCopyrightNotice();
		String licenseAgreement = feature.getLicenseAgreement();
		String sitesToVisit = feature.getSitesToVisit();

		// Then i create my table
		buffer.append("<table align=\"center\">");
		buffer.append("<thead>");

		// 1st line : head
		buffer.append("<tr>");
		buffer.append("<th> Field </th>");
		buffer.append("<th> Value </th>");
		buffer.append("</tr>");
		buffer.append("</thead>");
		buffer.append("<tbody>");

		// 2nd line : id
		buffer.append("<tr>");
		buffer.append("<td>Identifier</td>");
		buffer.append("<td>" + featureID + "</td>");
		buffer.append("</tr>");

		// 3rd line : version
		buffer.append("<tr>");
		buffer.append("<td>Version</td>");
		buffer.append("<td>" + featureVersion + "</td>");
		buffer.append("</tr>");

		// 4rd line : Description
		buffer.append("<tr>");
		buffer.append("<td>Description</td>");
		buffer.append("<td>" + featureDescription + "</td>");
		buffer.append("</tr>");

		// 5rd line : Provider
		buffer.append("<tr>");
		buffer.append("<td>Provider</td>");
		buffer.append("<td>" + featureProvider + "</td>");
		buffer.append("</tr>");

		// 6rd line : Copyright notice
		buffer.append("<tr>");
		buffer.append("<td>Copyright Notice</td>");
		buffer.append("<td>" + featureCopyright + "</td>");
		buffer.append("</tr>");

		// 7rd line : licence agreement
		buffer.append("<tr>");
		buffer.append("<td>License Agreement</td>");
		buffer.append("<td>" + licenseAgreement + "</td>");
		buffer.append("</tr>");

		// 8rd line : sites to visit
		buffer.append("<tr>");
		buffer.append("<td>Sites to visit</td>");
		buffer.append("<td>" + sitesToVisit + "</td>");
		buffer.append("</tr>");

		buffer.append("</tbody>");
		buffer.append("</table>");
		return buffer.toString();
	}

	private static String getFeatureDetailsContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

		if ((feature.getFeatureDependencies() != null)
				|| (feature.getPluginDependencies() != null)
				|| (feature.getFeatureInclusions() != null)
				|| (feature.getIncludedPlugins() != null)) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append("Details");
			buffer.append("</h" + indentationIndice + ">");
		}

		// Sub menu for dependencies
		if ((feature.getFeatureDependencies() != null)
				|| (feature.getPluginDependencies() != null)) {
			buffer.append("<h" + (indentationIndice + 1) + ">");
			buffer.append("Dependencies");
			buffer.append("</h" + (indentationIndice + 1) + ">");
		}

		// feature dependencies
		if (feature.getFeatureDependencies() != null)
			buffer.append(getFeatureDependenciesContent(feature, projectName,
					folderName, indentationIndice + 2));

		// plugin dependencies
		if (feature.getPluginDependencies() != null)
			buffer.append(getFeaturePluginDependenciesContent(feature,
					projectName, folderName, indentationIndice + 2));

		// Sub-menu for inclusions
		if ((feature.getFeatureInclusions() != null)
				|| (feature.getIncludedPlugins() != null)) {
			buffer.append("<h" + (indentationIndice + 1) + ">");
			buffer.append("Inclusions");
			buffer.append("</h" + (indentationIndice + 1) + ">");
		}

		// Included features
		if (feature.getFeatureInclusions() != null)
			buffer.append(getIncludedFeaturesContent(feature, projectName,
					folderName, indentationIndice + 2));

		// Included plugins
		if (feature.getIncludedPlugins() != null)
			buffer.append(getIncludedPluginsContent(feature, projectName,
					folderName, indentationIndice + 2));

		return buffer.toString();
	}

	private static String getIncludedPluginsContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();
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
			element = "(" + includedPluginsNumber + " element)";
		} else if (includedPluginsNumber > 1) {
			title = "Included Plugins ";
			element = "(" + includedPluginsNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		// Then i create my list
		if (includedPlugins.size() > 0) {
			// included plugins
			buffer.append("<ul style=\"list-style-type:none\">");
			for (Plugin includedPlugin : includedPlugins) {
				Plugin target = includedPlugin;
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						includedPlugin, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(includedPlugin)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static Object getIncludedFeaturesContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();
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
			element = "(" + includedFeaturesNumber + " element)";
		} else if (includedFeaturesNumber > 1) {
			title = "Included Features ";
			element = "(" + includedFeaturesNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		// The i create my list
		if (featureInclusions.size() > 0) {
			// feature inclusions
			buffer.append("<ul style=\"list-style-type:none\">");
			for (FeatureInclusion featureInclusion : featureInclusions) {
				Feature target = featureInclusion.getIncludedFeature();
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						featureInclusion, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(featureInclusion)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getFeatureDependenciesContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

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
			element = "(" + featureDependenciesNumber + " element)";
		} else if (featureDependenciesNumber > 1) {
			title = "Feature Dependencies ";
			element = "(" + featureDependenciesNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		// feature dependances
		if (featureDependencies.size() > 0) {
			buffer.append("<ul style=\"list-style-type:none\">");
			for (FeatureDependency featureDependency : featureDependencies) {
				Feature target = featureDependency.getTarget();
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						featureDependency, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(featureDependency)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getFeaturePluginDependenciesContent(Feature feature,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

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
			element = "(" + pluginDependenciesNumber + " element)";
		} else if (pluginDependenciesNumber > 1) {
			title = "Plugin Dependencies ";
			element = "(" + pluginDependenciesNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		if (featurePluginDependencies.size() > 0) {
			// plugin dependencies
			buffer.append("<ul style=\"list-style-type:none\">");
			for (FeatureToPluginDependency featurePluginDependency : featurePluginDependencies) {
				Plugin target = featurePluginDependency.getTarget();
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						featurePluginDependency, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(target, LabelProviderHelper
								.getText(featurePluginDependency)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

}
