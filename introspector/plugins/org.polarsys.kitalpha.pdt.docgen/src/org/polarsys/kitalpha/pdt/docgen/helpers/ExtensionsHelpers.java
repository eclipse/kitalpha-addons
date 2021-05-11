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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ExtensionsHelpers {
	
	private ExtensionsHelpers() {}
	
	protected static final HashMap<String, DRepresentation> extensionDiagrams = new HashMap<>();

	protected static final HashMap<String, String> extensionsPages = new HashMap<>();

	public static void addExtensionPage(String key, String currentExtensionPage) {
		extensionsPages.computeIfAbsent(key, k -> currentExtensionPage);
	}
	
	public static void addExtensionDiagrams(String key, DRepresentation currentExtensionDiagram){
		extensionDiagrams.computeIfAbsent(key, k -> currentExtensionDiagram);
	}
	
	/**
	 * Get an extension's page
	 * @param key
	 * @return
	 */
	public static String getExtensionPage(String key) {
		return extensionsPages.get(key);
	}
	
	/**
	 * Get an extension's diagram
	 * @param key
	 * @return
	 */
	public static DRepresentation getExtensionDiagram(String key){
		return extensionDiagrams.get(key);
	}

	public static String getExtensionsPage(Extension extension, String projectName,
			String folderName, int indentationIndice) {

		// I get all i need for my table
		StringBuilder stringBuilder = new StringBuilder();
		EList<ConfiguredSchemaElement> configuredSchemaElements = null;
		Set<ConfiguredSchemaElement> allConfiguredSchemaElements = new HashSet<>();

		
		String imageFileName = LabelProviderHelper.getImageFileName(extension,
				projectName, folderName);

		// Header's label
		String text = Helpers.getLabel(extension)
				+ " --> "
				+ Helpers.getTypeHyperLink(extension.getExtensionPoint(),
						LabelProviderHelper.getText(extension
								.getExtensionPoint()));

		if (extension.getConfiguredSchemaElement() != null) {
			configuredSchemaElements = extension.getConfiguredSchemaElement();
		}

		if (configuredSchemaElements != null) {
			// i get all my configured schema elements
			getAllConfiguredSchemaElement(configuredSchemaElements,
					allConfiguredSchemaElements);
		}

		// Then i start my page's creation
		stringBuilder.append("<h" + indentationIndice + ">");
		stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
		stringBuilder.append(imageFileName);
		stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
		stringBuilder.append(" " + text);
		stringBuilder.append("</h" + indentationIndice + ">");

		// Starting my list of cse
		stringBuilder.append(getSchemaElementsContent(projectName, folderName, allConfiguredSchemaElements,
				(indentationIndice + 1)));

		stringBuilder.append(getSchemaElementsDetails(projectName, folderName, allConfiguredSchemaElements,
				(indentationIndice + 1)));
		return stringBuilder.toString();
	}

	

	private static String getSchemaElementsDetails(String projectName, String folderName,
			Set<ConfiguredSchemaElement> allConfiguredSchemaElements, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		if (allConfiguredSchemaElements != null) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append("Details");
			stringBuilder.append("</h" + indentationIndice + ">");
			for (ConfiguredSchemaElement configuredSchemaElement : allConfiguredSchemaElements) {
				stringBuilder.append(getEachCSEContent(configuredSchemaElement,
						projectName, folderName, indentationIndice + 1));
			}
		}

		return stringBuilder.toString();
	}

	private static String getEachCSEContent(
			ConfiguredSchemaElement configuredSchemaElement,
			String projectName, String folderName, int indentationIndice) {

		EList<ConfigurationElementAttributeInstance> attributes = configuredSchemaElement
				.getConfigurationElements();
		StringBuilder stringBuilder = new StringBuilder();
		String text = Helpers.getLabel(configuredSchemaElement);
		stringBuilder.append("<h" + indentationIndice + ">" + text + "</h"
				+ indentationIndice + ">");

		if (attributes != null) {
			stringBuilder.append("<ul style=\"list-style-type:disc\">");
			for (ConfigurationElementAttributeInstance attribute : attributes) {
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						attribute, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" " + Helpers.getLabel(attribute) + " --> ");

				AbstractValue containedValue = attribute.getContainedValue();
				if (containedValue instanceof BooleanValue)
					stringBuilder.append(((BooleanValue) containedValue).isValue());
				else if (containedValue instanceof StringValue)
					stringBuilder.append(((StringValue) containedValue).getValue());
				else if (containedValue instanceof JavaClassValue)
					stringBuilder.append(((JavaClassValue) containedValue)
							.getClassName());
				stringBuilder.append("</li>");
			}
			stringBuilder.append("</ul>");
		}
		return stringBuilder.toString();
	}

	private static String getSchemaElementsContent(String projectName, String folderName,
			Set<ConfiguredSchemaElement> allConfiguredSchemaElements, int indentationIndice) {
		StringBuilder stringBuilder = new StringBuilder();

		int configuredSchemaElementsNumber = 0;

		String title = "";
		String element = "";

		if (allConfiguredSchemaElements != null) {
			configuredSchemaElementsNumber = allConfiguredSchemaElements.size();
		}
		if (configuredSchemaElementsNumber == 1) {
			title = "Configured Schema element ";
			element = "(" + configuredSchemaElementsNumber + " element)";
		} else if (configuredSchemaElementsNumber > 1) {
			title = "Configured Schema elements ";
			element = "(" + configuredSchemaElementsNumber + " elements)";
		}

		if (!title.equals("")) {
			stringBuilder.append("<h" + indentationIndice + ">");
			stringBuilder.append(title + element);
			stringBuilder.append("</h" + indentationIndice + ">");
		}

		// schema elements
		if (configuredSchemaElementsNumber > 0) {
			stringBuilder.append("<ul style=\"list-style-type:none\">");
			for (ConfiguredSchemaElement configuredSchemaElement : allConfiguredSchemaElements) {
				stringBuilder.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						configuredSchemaElement, projectName, folderName);
				stringBuilder.append(Constants.IMG_SRC_ICON_OPEN);
				stringBuilder.append(imageName);
				stringBuilder.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				stringBuilder.append(" " + Helpers.getLabel(configuredSchemaElement));
				stringBuilder.append("</li>");
			}
			stringBuilder.append("</ul>");
		}
		return stringBuilder.toString();

	}

	private static void getAllConfiguredSchemaElement(
			EList<ConfiguredSchemaElement> configuredSchemaElements,
			Set<ConfiguredSchemaElement> result) {

		EList<ConfiguredSchemaElement> children = null;
		for (ConfiguredSchemaElement configuredSchemaElement : configuredSchemaElements) {
			result.add(configuredSchemaElement);
			if (configuredSchemaElement.getChildren() != null) {
				children = configuredSchemaElement.getChildren();
				getAllConfiguredSchemaElement(children, result);
			}
		}
	}
}
