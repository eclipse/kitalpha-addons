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
package org.polarsys.kitalpha.pdt.docgen.helpers;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
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

	// Fabrique la page destinée au plugins
	public static String getPluginPage(Plugin plugin, String projectName,
			String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

		// je recupere l'image de mon plugin
		String imageFileName = LabelProviderHelper.getImageFileName(plugin,
				projectName, folderName);

		// je recupere le texte de mon plugin
		String text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers
				.getLabel(plugin);

		buffer.append("<h" + indentationIndice + ">");
		buffer.append("<img src=\"../icon/");
		buffer.append(imageFileName);
		buffer.append("\" alt=\"\"/>");
		buffer.append(" " + text);
		buffer.append("</h" + indentationIndice + ">");
		buffer.append(getPluginGeneralInformationTable(plugin, projectName,
				folderName, indentationIndice + 1));
		buffer.append(getCapabilitiesContent(plugin, projectName, folderName,
				indentationIndice + 1));
		buffer.append(getPluginDependenciesContent(plugin, projectName,
				folderName, indentationIndice + 1));
		return buffer.toString();
	}

	private static String getPluginGeneralInformationTable(Plugin plugin,
			String projectName, String folderName, int identationIndice) {

		// je recupère tout ce dont j'ai besoin pour mon tableau
		StringBuffer buffer = new StringBuffer();

		buffer.append("<h" + identationIndice + ">");
		buffer.append("General Informations");
		buffer.append("</h" + identationIndice + ">");

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
		buffer.append("<td>" + pluginID + "</td>");
		buffer.append("</tr>");

		// 3rd line : version
		buffer.append("<tr>");
		buffer.append("<td>Version</td>");
		buffer.append("<td>" + pluginVersion + "</td>");
		buffer.append("</tr>");

		if (executionEnvironments != null) {
			// 4rd line : execution environments
			buffer.append("<tr>");
			buffer.append("<td>Execution Environment(s)</td>");
			buffer.append("<td>");
			buffer.append("<ul style=\"list-style-type:none\">");
			for (ExecutionEnvironment executionEnvironment : executionEnvironments) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						executionEnvironment, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" " + executionEnvironment.getId());
				buffer.append("</li>");
			}
			buffer.append("</ul>");
			buffer.append("</td>");
			buffer.append("</tr>");
		}
		buffer.append("</tbody>");
		buffer.append("</table>");
		return buffer.toString();
	}

	// Je crée le contenu de mon onglet capabilities

	private static String getCapabilitiesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

		if ((plugin.getExportedPackages() != null)
				|| (plugin.getExtensionPoints() != null)
				|| (plugin.getExtensions() != null)) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append("Capabilities");
			buffer.append("</h" + indentationIndice + ">");
		}

		// je recupere tous les menus dont j'ai besoin
		// les exported packages
		buffer.append(getExportedPackagesContent(plugin, projectName,
				folderName, indentationIndice + 1));

		// les extension points
		buffer.append(getExtensionPointsContent(plugin, projectName,
				folderName, indentationIndice + 1));

		// les extensions
		buffer.append(getExtensionsContent(plugin, projectName, folderName,
				indentationIndice + 1));
		return buffer.toString();
	}

	// je recupére les exported packages
	private static String getExportedPackagesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();
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
			element = "(" + packagesNumber + " element)";
		} else if (packagesNumber > 1) {
			title = "Exported Packages ";
			element = "(" + packagesNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		if (exportedPackages != null) {
			buffer.append("<ul style=\"list-style-type:none\">");
			for (ExportedPackage exportedPackage : exportedPackages) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						exportedPackage, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" " + exportedPackage.getId());
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getExtensionPointsContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {

		StringBuffer buffer = new StringBuffer();
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
			element = "(" + extensionPointsNumber + " element)";
		} else if (extensionPointsNumber > 1) {
			title = "Extension Points ";
			element = "(" + extensionPointsNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		if (pluginExtensionPointsList != null) {
			buffer.append("<ul style=\"list-style-type:none\">");
			for (ExtensionPoint extensionPoint : pluginExtensionPointsList) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						extensionPoint, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(extensionPoint,
								LabelProviderHelper.getText(extensionPoint)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getExtensionsContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {

		StringBuffer buffer = new StringBuffer();

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
			element = "(" + extensionsNumber + " element)";
		} else if (extensionsNumber > 1) {
			title = "Extension ";
			element = "(" + extensionsNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		if (pluginExtensionsList != null) {
			buffer.append("<ul style=\"list-style-type:none\">");
			for (Extension extension : pluginExtensionsList) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						extension, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(extension,
								LabelProviderHelper.getText(extension)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getPluginDependenciesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<h" + indentationIndice + ">");
		buffer.append("Dependencies");
		buffer.append("</h" + indentationIndice + ">");

		// creating outgoing
		buffer.append(getPluginOutgoingDependenciesContent(plugin, projectName,
				folderName, indentationIndice + 1));
		// creating incoming
		buffer.append(getPluginIncomingDependenciesContent(plugin, projectName,
				folderName, indentationIndice + 1));

		return buffer.toString();
	}

	private static String getPluginOutgoingDependenciesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {

		StringBuffer buffer = new StringBuffer();
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
			element = "(" + outgoinPluginDependenciesNumber + " element)";
		} else if (outgoinPluginDependenciesNumber > 1) {
			title = "Outgoing ";
			element = "(" + outgoinPluginDependenciesNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		// Plugin dependencies
		if (pluginDependenciesList.size() > 0) {
			buffer.append("<ul style=\"list-style-type:none\">");
			for (PluginDependency pluginDependency : pluginDependenciesList) {
				Plugin target = pluginDependency.getTarget();
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						pluginDependency, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" "
						+ Helpers.getTypeHyperLink(target,
								LabelProviderHelper.getText(pluginDependency)));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getPluginIncomingDependenciesContent(Plugin plugin,
			String projectName, String folderName, int indentationIndice) {
		
		StringBuffer buffer = new StringBuffer();
		int incomingPluginDependenciesNumber = 0;
		String title = "";
		String element = "";

		Collection<Setting> crossReferences = UsageCrossReferencer.find(plugin,
				plugin.eResource());

		if (crossReferences != null) {
			for (Setting setting : crossReferences) {
				EStructuralFeature eStructuralFeature = setting.getEStructuralFeature();
				if(eStructuralFeature.equals(
						PlatformPackage.eINSTANCE.getPluginDependency_Target())){
					incomingPluginDependenciesNumber++;
				}
			}
		}
		if (incomingPluginDependenciesNumber == 1) {
			title = "Ingoing ";
			element = "(" + incomingPluginDependenciesNumber + " element)";
		} else if (incomingPluginDependenciesNumber > 1) {
			title = "Ingoing ";
			element = "(" + incomingPluginDependenciesNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}
		// 9rd line : incoming dependencies

		if (crossReferences != null) {
			buffer.append("<ul style=\"list-style-type:none\">");
			for (Setting setting : crossReferences) {
				if (setting.getEStructuralFeature().equals(
						PlatformPackage.eINSTANCE.getPluginDependency_Target())) {
					PluginDependency dependency = (PluginDependency) setting
							.getEObject();
					Plugin dependant = (Plugin) (dependency.eContainer()
							.eContainer());
					if (dependant != null) {
						buffer.append("<li>");
						String imageName = LabelProviderHelper
								.getImageFileName(dependant, projectName,
										folderName);
						buffer.append("<img src=\"../icon/");
						buffer.append(imageName);
						buffer.append("\" alt=\"\"/>");
						buffer.append(" "
								+ Helpers.getTypeHyperLink(dependant,
										LabelProviderHelper.getText(dependant)));
						buffer.append("</li>");

					}
				}
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}
}
