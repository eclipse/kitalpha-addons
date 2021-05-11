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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironment;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class PluginHelpers {

	private PluginHelpers() {}

	// Fabrique la page destinée au plugins
	public static String getPluginPage(Plugin plugin, String projectName,
			String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		// je recupere l'image de mon plugin
		String imageFileName = LabelProviderHelper.getImageFileName(plugin,
				projectName, folderName);

		// je recupere le texte de mon plugin
		String text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers
				.getLabel(plugin);

		stringBuilder.append("<h" + indentationIndice + ">");
		stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
		stringBuilder.append(imageFileName);
		stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
		stringBuilder.append(" " + text);
		stringBuilder.append("</h" + indentationIndice + ">");
		stringBuilder.append(getPluginGeneralInformationTable(plugin, projectName,
				folderName, indentationIndice + 1));
		stringBuilder.append(getCapabilitiesContent(plugin, projectName, folderName,
				indentationIndice + 1));
		stringBuilder.append(getPluginDependenciesContent(plugin, projectName,
				folderName, indentationIndice + 1));
		return stringBuilder.toString();
	}

	private static String getPluginGeneralInformationTable(Plugin plugin,
			String projectName, String folderName, int identationIndice) {

		// je recupère tout ce dont j'ai besoin pour mon tableau
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("<h" + identationIndice + ">");
		stringBuilder.append("General Informations");
		stringBuilder.append("</h" + identationIndice + ">");

		// info sur mon plugin
		String pluginID = plugin.getId();
		String pluginVersion = plugin.getVersion();

		// executions environment
		ExecutionEnvironments executionEnvironmnentsFolder = plugin
				.getExecutionEnvironmnents();
		EList<ExecutionEnvironment> executionEnvironments = null;
		if (executionEnvironmnentsFolder != null) {
			executionEnvironments = executionEnvironmnentsFolder
					.getExecutionEnvironments();
		}

		// ensuite je crée mon tableau
		stringBuilder.append("<table align=\"center\">");
		stringBuilder.append("<thead>");

		// 1st line : head
		stringBuilder.append(Constants.TR_OPEN);
		stringBuilder.append("<th> Field </th>");
		stringBuilder.append("<th> Value </th>");
		stringBuilder.append(Constants.TR_CLOSE);
		stringBuilder.append("</thead>");
		stringBuilder.append("<tbody>");

		// 2nd line : id
		stringBuilder.append(Constants.TR_OPEN);
		stringBuilder.append("<td>Identifier</td>");
		stringBuilder.append(Constants.TD_OPEN + pluginID + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		// 3rd line : version
		stringBuilder.append(Constants.TR_OPEN);
		stringBuilder.append("<td>Version</td>");
		stringBuilder.append(Constants.TD_OPEN + pluginVersion + Constants.TD_CLOSE);
		stringBuilder.append(Constants.TR_CLOSE);

		if (executionEnvironments != null) {
			// 4rd line : execution environments
			stringBuilder.append(Constants.TR_OPEN);
			stringBuilder.append("<td>Execution Environment(s)</td>");
			stringBuilder.append(Constants.TD_OPEN);
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (ExecutionEnvironment executionEnvironment : executionEnvironments) {
				stringBuilder.append(Constants.LI_OPEN);
				String imageName = LabelProviderHelper.getImageFileName(
						executionEnvironment, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" " + executionEnvironment.getId());
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
			stringBuilder.append(Constants.TD_CLOSE);
			stringBuilder.append(Constants.TR_CLOSE);
		}
		stringBuilder.append("</tbody>");
		stringBuilder.append("</table>");
		return stringBuilder.toString();
	}

	// Je crée le contenu de mon onglet capabilities

	private static String getCapabilitiesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		if ((plugin.getExportedPackages() != null)
				|| (plugin.getExtensionPoints() != null)
				|| (plugin.getExtensions() != null)) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append("Capabilities");
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		// je recupere tous les menus dont j'ai besoin
		// les exported packages
		stringBuilder.append(getExportedPackagesContent(plugin, projectName,
				folderName, indentationIndice + 1));

		// les extension points
		stringBuilder.append(getExtensionPointsContent(plugin, projectName,
				folderName, indentationIndice + 1));

		// les extensions
		stringBuilder.append(getExtensionsContent(plugin, projectName, folderName,
				indentationIndice + 1));
		return stringBuilder.toString();
	}

	// je recupére les exported packages
	private static String getExportedPackagesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();
		// je recupère les infos dont j'ai besoin

		// exported packages
		ExportedPackages exportedPackagesFolder = plugin.getExportedPackages();
		EList<ExportedPackage> exportedPackages = null;
		int packagesNumber = 0;
		String title = "";
		String element = "";
		if (exportedPackagesFolder != null) {
			exportedPackages = exportedPackagesFolder.getExportedPackages();
		}
		if (exportedPackages != null) {
			packagesNumber = exportedPackages.size();
		}
		if (packagesNumber == 1) {
			title = "Exported Package ";
			element = "(" + packagesNumber + Constants.ELEMENT;
		} else if (packagesNumber > 1) {
			title = "Exported Packages ";
			element = "(" + packagesNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		if (exportedPackages != null) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (ExportedPackage exportedPackage : exportedPackages) {
				stringBuilder.append(Constants.LI_OPEN);
				String imageName = LabelProviderHelper.getImageFileName(
						exportedPackage, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" " + exportedPackage.getId());
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static String getExtensionPointsContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {

		StringBuilder stringBuilder = new StringBuilder();
		PluginExtensionPoints pluginExtensionPoints = plugin
				.getExtensionPoints();
		EList<ExtensionPoint> pluginExtensionPointsList = null;
		int extensionPointsNumber = 0;
		String title = "";
		String element = "";
		if (pluginExtensionPoints != null) {
			pluginExtensionPointsList = pluginExtensionPoints
					.getExtensionPoints();
		}
		if (pluginExtensionPointsList != null) {
			extensionPointsNumber = pluginExtensionPointsList.size();
		}
		if (extensionPointsNumber == 1) {
			title = "Extension Point ";
			element = "(" + extensionPointsNumber + Constants.ELEMENT;
		} else if (extensionPointsNumber > 1) {
			title = "Extension Points ";
			element = "(" + extensionPointsNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		if (pluginExtensionPointsList != null) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (ExtensionPoint extensionPoint : pluginExtensionPointsList) {
				stringBuilder.append(Constants.LI_OPEN);
				String imageName = LabelProviderHelper.getImageFileName(
						extensionPoint, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(extensionPoint,
								LabelProviderHelper.getText(extensionPoint)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static String getExtensionsContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {

		StringBuilder stringBuilder = new StringBuilder();

		PluginExtensions pluginExtensionsFolder = plugin.getExtensions();
		EList<Extension> pluginExtensionsList = null;
		if (pluginExtensionsFolder != null) {
			pluginExtensionsList = pluginExtensionsFolder.getExtensions();
		}

		int extensionsNumber = 0;
		String title = "";
		String element = "";

		if (pluginExtensionsList != null) {
			extensionsNumber = pluginExtensionsList.size();
		}
		if (extensionsNumber == 1) {
			title = "Extension ";
			element = "(" + extensionsNumber + Constants.ELEMENT;
		} else if (extensionsNumber > 1) {
			title = "Extension ";
			element = "(" + extensionsNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		if (pluginExtensionsList != null) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (Extension extension : pluginExtensionsList) {
				stringBuilder.append(Constants.LI_OPEN);
				String imageName = LabelProviderHelper.getImageFileName(
						extension, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" "
						+ Helpers.getTypeHyperLink(extension,
								LabelProviderHelper.getText(extension)));
				stringBuilder.append(Constants.LI_CLOSE);
			}
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}

	private static String getPluginDependenciesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<h" + indentationIndice + ">");
		stringBuilder.append("Dependencies");
		stringBuilder.append("</h" + indentationIndice + ">");

		// creating outgoing
		stringBuilder.append(getPluginOutgoingDependenciesContent(plugin, projectName,
				folderName, indentationIndice + 1));
		// creating incoming
		stringBuilder.append(getPluginIncomingDependenciesContent(plugin, projectName,
				folderName, indentationIndice + 1));

		return stringBuilder.toString();
	}

	private static String getPluginOutgoingDependenciesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {

		StringBuilder buffer = new StringBuilder();
		PluginDependencies pluginDependenciesFolder = plugin
				.getPluginDependencies();
		EList<PluginDependency> pluginDependenciesList = null;
		if (pluginDependenciesFolder != null) {
			pluginDependenciesList = pluginDependenciesFolder
					.getPluginDependencies();
		}
		int outgoinPluginDependenciesNumber = 0;
		String title = "";
		String element = "";

		if (pluginDependenciesList != null) {
			outgoinPluginDependenciesNumber = pluginDependenciesList.size();
		}
		if (outgoinPluginDependenciesNumber == 1) {
			title = "Outgoing ";
			element = "(" + outgoinPluginDependenciesNumber + Constants.ELEMENT;
		} else if (outgoinPluginDependenciesNumber > 1) {
			title = "Outgoing ";
			element = "(" + outgoinPluginDependenciesNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		// Plugin dependencies
		if (pluginDependenciesList!=null && !pluginDependenciesList.isEmpty()) {
			buffer.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (PluginDependency pluginDependency : pluginDependenciesList) {
				Plugin target = pluginDependency.getTarget();
				buffer.append(Constants.LI_OPEN);
				String imageName = LabelProviderHelper.getImageFileName(
						pluginDependency, projectName, folderName);
				buffer.append(Constants.IMG_SRC_ICON_OPEN);
				buffer.append(imageName);
				buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				buffer.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(pluginDependency)));
				buffer.append(Constants.LI_CLOSE);
			}
			buffer.append(Constants.UL_CLOSE);
		}
		return buffer.toString();
	}

	private static String getPluginIncomingDependenciesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		
		StringBuilder stringBuilder = new StringBuilder();
		int incomingPluginDependenciesNumber = 0;
		String title = "";
		String element = "";

		Collection<Setting> crossReferences = UsageCrossReferencer.find(plugin,
				plugin.eResource());

		if (crossReferences != null) {
			incomingPluginDependenciesNumber += crossReferences.stream().map(Setting::getEStructuralFeature)
					.filter(sF -> sF.equals(PlatformPackage.eINSTANCE.getPluginDependency_Target())).count();
		}
		if (incomingPluginDependenciesNumber == 1) {
			title = "Ingoing ";
			element = "(" + incomingPluginDependenciesNumber + Constants.ELEMENT;
		} else if (incomingPluginDependenciesNumber > 1) {
			title = "Ingoing ";
			element = "(" + incomingPluginDependenciesNumber + Constants.ELEMENTS;
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}
		// 9rd line : incoming dependencies

		if (crossReferences != null) {
			stringBuilder.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			crossReferences.stream()
				.filter(setting -> setting.getEStructuralFeature().equals(PlatformPackage.eINSTANCE.getPluginDependency_Target()))
				.forEach(setting -> {
					PluginDependency dependency = (PluginDependency) setting
							.getEObject();
					Plugin dependant = (Plugin) (dependency.eContainer()
							.eContainer());
					if (dependant != null) {
						stringBuilder.append(Constants.LI_OPEN);
						String imageName = LabelProviderHelper
								.getImageFileName(dependant, projectName,
										folderName);
						stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
						stringBuilder.append(imageName);
						stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
						stringBuilder.append(" "
								+ Helpers.getTypeHyperLink(dependant,
										LabelProviderHelper.getText(dependant)));
						stringBuilder.append(Constants.LI_CLOSE);
	
					}
				});
			stringBuilder.append(Constants.UL_CLOSE);
		}
		return stringBuilder.toString();
	}
}
