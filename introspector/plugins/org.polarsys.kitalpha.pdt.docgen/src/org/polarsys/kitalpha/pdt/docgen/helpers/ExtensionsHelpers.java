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
	
	public static HashMap<String, DRepresentation> extensionDiagrams = new HashMap<String, DRepresentation>();

	public static HashMap<String, String> extensionsPages = new HashMap<String, String>();

	public static void addExtensionPage(String key, String currentExtensionPage) {
		if (!extensionsPages.containsKey(key))
			extensionsPages.put(key, currentExtensionPage);
	}
	
	public static void addExtensionDiagrams(String key, DRepresentation currentExtensionDiagram){
		if(!extensionDiagrams.containsKey(key))
			extensionDiagrams.put(key, currentExtensionDiagram);
	}

	public static String getExtensionsPage(Extension extension, String projectName,
			String folderName, int indentationIndice) {

		// I get all i need for my table
		StringBuffer buffer = new StringBuffer();
		EList<ConfiguredSchemaElement> configuredSchemaElements = null;
		Set<ConfiguredSchemaElement> allConfiguredSchemaElements = new HashSet<ConfiguredSchemaElement>();

		
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
		buffer.append("<h" + indentationIndice + ">");
		buffer.append("<img src=\"../icon/");
		buffer.append(imageFileName);
		buffer.append("\" alt=\"\"/>");
		buffer.append(" " + text);
		buffer.append("</h" + indentationIndice + ">");

		// Starting my list of cse
		buffer.append(getSchemaElementsContent(extension, projectName,
				folderName, allConfiguredSchemaElements,
				(indentationIndice + 1)));

		buffer.append(getSchemaElementsDetails(extension, projectName,
				folderName, allConfiguredSchemaElements,
				(indentationIndice + 1)));
		return buffer.toString();
	}

	

	private static String getSchemaElementsDetails(Extension extension,
			String projectName, String folderName,
			Set<ConfiguredSchemaElement> allConfiguredSchemaElements,
			int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

		if (allConfiguredSchemaElements != null) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append("Details");
			buffer.append("</h" + indentationIndice + ">");
			for (ConfiguredSchemaElement configuredSchemaElement : allConfiguredSchemaElements) {
				buffer.append(getEachCSEContent(configuredSchemaElement,
						projectName, folderName, indentationIndice + 1));
			}
		}

		return buffer.toString();
	}

	private static String getEachCSEContent(
			ConfiguredSchemaElement configuredSchemaElement,
			String projectName, String folderName, int indentationIndice) {

		EList<ConfigurationElementAttributeInstance> attributes = configuredSchemaElement
				.getConfigurationElements();
		StringBuffer buffer = new StringBuffer();
		String text = Helpers.getLabel(configuredSchemaElement);
		buffer.append("<h" + indentationIndice + ">" + text + "</h"
				+ indentationIndice + ">");

		if (attributes != null) {
			buffer.append("<ul style=\"list-style-type:disc\">");
			for (ConfigurationElementAttributeInstance attribute : attributes) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						attribute, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" " + Helpers.getLabel(attribute) + " --> ");

				AbstractValue containedValue = attribute.getContainedValue();
				if (containedValue instanceof BooleanValue)
					buffer.append(((BooleanValue) containedValue).isValue());
				else if (containedValue instanceof StringValue)
					buffer.append(((StringValue) containedValue).getValue());
				else if (containedValue instanceof JavaClassValue)
					buffer.append(((JavaClassValue) containedValue)
							.getClassName());
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}

	private static String getSchemaElementsContent(Extension extension,
			String projectName, String folderName,
			Set<ConfiguredSchemaElement> allConfiguredSchemaElements,
			int indentationIndice) {
		StringBuffer buffer = new StringBuffer();

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
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		// schema elements
		if (configuredSchemaElementsNumber > 0) {
			buffer.append("<ul style=\"list-style-type:none\">");
			for (ConfiguredSchemaElement configuredSchemaElement : allConfiguredSchemaElements) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						configuredSchemaElement, projectName, folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(" " + Helpers.getLabel(configuredSchemaElement));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
		}
		return buffer.toString();

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
