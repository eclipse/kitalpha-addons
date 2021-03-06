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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference;


/**
 * 
 * @author Xavier DECOOL
 *
 */
public class ExtensionPointsHelpers {
	
	private ExtensionPointsHelpers() {}

	protected static final HashMap<String, String> extensionPointsPages = new HashMap<>();
	protected static final HashMap<String, DRepresentation> extensionPointsDiagrams = new HashMap<>();
	
	/**
	 * Add an extension point's page 
	 **/

	public static void addExtensionPointPage(String key, String currentExtensionPage) {
		extensionPointsPages.computeIfAbsent(key, k -> currentExtensionPage);
	}
	
	/**
	 * Add an extension point's diagram 
	 **/
	public static void addExtensionPointsDiagrams(String key, DRepresentation currentExtensionDiagram){
		extensionPointsDiagrams.computeIfAbsent(key, k -> currentExtensionDiagram);
	}
	
	
	/**
	 * Get an extension point's page 
	 **/
	public static String getExtensionPointsPage(ExtensionPoint extensionPoint,
			String projectName, String folderName, int indentationIndice) {
		StringBuilder buffer = new StringBuilder();

		String text = "";
		EObject pluginFolder = extensionPoint.eContainer();
		EObject plugin = pluginFolder.eContainer();
		Plugin attachedPlugin = null;
		if (plugin instanceof Plugin) {
			attachedPlugin = (Plugin) plugin;
		}

		EList<SchemaElement> schemaElements = null;
		if (extensionPoint.getSchemaElements() != null)
			schemaElements = extensionPoint.getSchemaElements();

		// I get my extension point's icon
		String imageFileName = LabelProviderHelper.getImageFileName(
				extensionPoint, projectName, folderName);

		// I get text of my EP
		if (attachedPlugin != null)
			text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers
					.getLabel(extensionPoint)
					+ " --> "
					+ Helpers.getTypeHyperLink(attachedPlugin,
							LabelProviderHelper.getText(attachedPlugin));

		buffer.append("<h" + indentationIndice + ">");
		buffer.append(Constants.IMG_SRC_ICON_OPEN);
		buffer.append(imageFileName);
		buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
		buffer.append(" " + text);
		buffer.append("</h" + indentationIndice + ">");
		buffer.append(getSchemaElementsContent(extensionPoint, projectName,
				folderName, (indentationIndice + 1)));
		for (SchemaElement schemaElement : schemaElements) {
			// Je cr�e mes tableaux pour chaque Schema elements
			buffer.append(getSchemaElementTable(schemaElement, projectName, folderName, indentationIndice + 1));
		}
		return buffer.toString();
	}
	
	/**
	 * Get an extension point's diagram 
	 * @return 
	 **/
	public static DRepresentation getExtensionPointsDiagram(String key){
		return extensionPointsDiagrams.get(key);
	}
	
	/**
	 * Get an extension point's page 
	 * @return 
	 **/
	public static String getExtensionPointsPage(String key) {
		return extensionPointsPages.get(key);
	}

	/**
	 * Return a schema element table
	 * **/
	private static String getSchemaElementTable(SchemaElement schemaElement, String projectName, String folderName,
			int indentationIndice) {
		StringBuilder buffer = new StringBuilder();

		String imageFileName = LabelProviderHelper.getImageFileName(
				schemaElement, projectName, folderName);

		ComplexCompositor complexCompositor = null;
		EList<ConfigurationElementAttribute> attributes = null;
		EList<SchemaElementReference> referencedSchemaElements = null;

		String text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers
				.getLabel(schemaElement);
		
		// Get composat of my schema element
		if (schemaElement.getComplexCompositor() != null) {
			complexCompositor = schemaElement.getComplexCompositor();
		}

		if (schemaElement.getAttributes() != null) {
			attributes = schemaElement.getAttributes();
		}

		if (complexCompositor != null) {
			referencedSchemaElements = complexCompositor.getElementReferences();
		}

		buffer.append("<h" + indentationIndice + ">");
		buffer.append(Constants.IMG_SRC_ICON_OPEN);
		buffer.append(imageFileName);
		buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
		buffer.append(" " + text);
		buffer.append("</h" + indentationIndice + ">");
		
		// And then i create my table
		buffer.append("<table align=\"center\">");
		buffer.append("<thead>");

		// 1st line : head
		buffer.append("<tr>");
		buffer.append("<th> Identification </th>");
		if (complexCompositor != null)
			buffer.append("<th> Complex Compositor </th>");
		if (attributes != null)
			buffer.append("<th> Attributes </th>");
		buffer.append("</tr>");
		buffer.append("</thead>");
		buffer.append("<tbody>");

		// 1st column : identification
		buffer.append("<td>");
		buffer.append(Constants.IMG_SRC_ICON_OPEN);
		buffer.append(imageFileName);
		buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
		buffer.append(" " + text);
		buffer.append(Constants.TD_CLOSE);

		// 2nd column : complex compositor
		if (complexCompositor != null) {
			buffer.append("<td>");
			buffer.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			buffer.append("<li>");
			String complexCompositorImage = LabelProviderHelper
					.getImageFileName(complexCompositor, projectName,
							folderName);
			buffer.append(Constants.IMG_SRC_ICON_OPEN);
			buffer.append(complexCompositorImage);
			buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
			String complex = getTextOfComplexCompositor(complexCompositor);
			buffer.append(" " + complex);
			referencedSchemaElements = complexCompositor.getElementReferences();
			buffer.append(Constants.LI_CLOSE);
		}

		// list of referenced schema element
		buffer.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
		if (referencedSchemaElements != null) {
			for (SchemaElementReference referencedSchemaElement : referencedSchemaElements) {
				buffer.append("<li>");
				String imageName2 = LabelProviderHelper.getImageFileName(
						referencedSchemaElement, projectName, folderName);
				buffer.append(Constants.IMG_SRC_ICON_OPEN);
				buffer.append(imageName2);
				buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				buffer.append(" "
						+ LabelProviderHelper.getText(referencedSchemaElement));
			}

		}
		buffer.append(Constants.LI_CLOSE);
		buffer.append("</ul>");
		buffer.append(Constants.TD_CLOSE);

		// 3rd column : attributes
		if (attributes != null) {
			buffer.append("<td>");
			buffer.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (ConfigurationElementAttribute configurationElementAttribute : attributes) {
				buffer.append("<li>");
				String attributeImage = LabelProviderHelper.getImageFileName(
						configurationElementAttribute, projectName, folderName);
				buffer.append(Constants.IMG_SRC_ICON_OPEN);
				buffer.append(attributeImage);
				buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				buffer.append(" "
						+ LabelProviderHelper
								.getText(configurationElementAttribute));
				buffer.append(Constants.LI_CLOSE);
			}
			buffer.append(Constants.TD_CLOSE);
			buffer.append("</tbody>");
			buffer.append("</table>");
		}
		return buffer.toString();
	}

	/**
	 * Return the page content's of a schema element 
	 **/
	private static String getSchemaElementsContent(
			ExtensionPoint extensionPoint, String projectName,
			String folderName, int indentationIndice) {
		StringBuilder buffer = new StringBuilder();
		EList<SchemaElement> schemaElements = null;
		if (extensionPoint.getSchemaElements() != null)
			schemaElements = extensionPoint.getSchemaElements();

		int schemaElementsNumber = 0;
		String title = "";
		String element = "";

		if (schemaElements != null) {
			schemaElementsNumber = schemaElements.size();
		}
		if (schemaElementsNumber == 1) {
			title = "Schema element ";
			element = "(" + schemaElementsNumber + " element)";
		} else if (schemaElementsNumber > 1) {
			title = "Schema elements ";
			element = "(" + schemaElementsNumber + " elements)";
		}

		if (!title.equals("")) {
			buffer.append("<h" + indentationIndice + ">");
			buffer.append(title + element);
			buffer.append("</h" + indentationIndice + ">");
		}

		// schema elements
		if (schemaElementsNumber > 0) {
			buffer.append(Constants.UL_STYLE_LIST_STYLE_TYPE_NONE_OPEN);
			for (SchemaElement schemaElement : schemaElements) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(
						schemaElement, projectName, folderName);
				buffer.append(Constants.IMG_SRC_ICON_OPEN);
				buffer.append(imageName);
				buffer.append(Constants.ALT_AFTER_IMGSRCICONOPEN_CLOSE);
				buffer.append(" "
						+ Helpers.getLabel(schemaElement));
				buffer.append(Constants.LI_CLOSE);
			}
			buffer.append("</ul>");
		}
		return buffer.toString();
	}
	
	private static String getTextOfComplexCompositor(ComplexCompositor object) {
		ComplexCompositor complexCompositor = (ComplexCompositor) object;
		String label = "";
		int complexCompCard = complexCompositor.getMaxCard();

		if (complexCompositor.getComplexCompositorKind().equals(
				ComplexCompositorKind.SEQUENCE)) {
			if (complexCompositor.isUnbounded())
				label = "Sequence [" + complexCompositor.getMinCard() + ";*]";
			else
				label = "Sequence [" + complexCompositor.getMinCard() + ";"
						+ complexCompCard + "]";

		} else {
			if (complexCompositor.isUnbounded())
				label = "Choice [" + complexCompositor.getMinCard() + ";*]";
			else
				label = "Choice [" + complexCompositor.getMinCard() + ";"
						+ complexCompCard + "]";
		}
		return label;
	}
}
