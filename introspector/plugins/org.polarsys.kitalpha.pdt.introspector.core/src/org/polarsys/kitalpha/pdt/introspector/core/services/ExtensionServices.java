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
package org.polarsys.kitalpha.pdt.introspector.core.services;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue;

/**
 * Services for create all attributes included into Extensions (Configured
 * schema element, attributes)
 * 
 * 
 * @author Xavier DECOOL
 *
 */
public class ExtensionServices {

	/**
	 * Public method that creates configured schema elements
	 * 
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param currentIExtension
	 *            : Received eclipse's extension
	 * @param extensionPoint
	 *            : Extension point used to find wich schema element is linked
	 *            to our current extention's configured schema element
	 * @param extension
	 *            : Metamodel side extension
	 */
	public static void createConfiguredSchemaElements(
			IntrospectionContext introContext, IExtension currentIExtension,
			ExtensionPoint extensionPoint, Extension extension) {

		// Find if the received extension contribute to an extension point
		ExtensionPoint contributedExtensionPoint = extension
				.getExtensionPoint();

		// Get the current IExtension's configuration elements
		IConfigurationElement[] configurationElements = currentIExtension
				.getConfigurationElements();

		// Get extension point's schema element
		EList<SchemaElement> extPointElements = extensionPoint
				.getSchemaElements();

		PlatformFactory platformFactory = PlatformFactory.eINSTANCE;

		// I iterate on each configuration elements
		for (IConfigurationElement currentIConfigurationElement : configurationElements) {

			ConfiguredSchemaElement configuredSchemaElement = platformFactory
					.createConfiguredSchemaElement();

			String name = currentIConfigurationElement.getName();

			// Set name
			configuredSchemaElement.setName(name);

			// And set linked schema element, based on the extension point

			SchemaElement extensionSchemaElement = extensionPoint
					.getExtensionSchemaElement();
			if (extensionSchemaElement != null)
				configuredSchemaElement
						.setSchemaElement(extensionSchemaElement);
			else {
				String message="The extension "+extension.getId()+" cannot retrieve the extension shema element on "+extensionPoint.getId();
				Helpers.createErrorForModelElement(extension, introContext, message, message);
				
			}

			if (extPointElements != null) {
				for (SchemaElement schemaElement : extPointElements) {

					// if my schema element has the same name than my
					// currentIConfigurationElement
					if (schemaElement.getName().equals(
							currentIConfigurationElement.getName())) {
						// Then I call method used for create schema element
						// attribute
						createSchemaElementAttributesInstance(introContext,
								configuredSchemaElement,
								currentIConfigurationElement, schemaElement);
					}
				}
			}
			else{
				
				String message="The extension "+extension.getId()+" cannot retrieve the necessary ressources from the related extension point's shema element";
				
				Helpers.createErrorForModelElement(extension, introContext, message, message);

			}

			// I add my configured schema element to my extension
			extension.getConfiguredSchemaElement().add(configuredSchemaElement);

			// And i check if it has children
			createSchemaElementChildren(introContext,
					currentIConfigurationElement, configuredSchemaElement,
					extPointElements);

			// creation of the link beetween extension point's schema element
			// and extension's schema element
			linkToExtensionPointSchemaElement(contributedExtensionPoint,
					configuredSchemaElement);
		}
	}

	/**
	 * Method that set the link between extension point's schema element and
	 * extension's configured schema element
	 * 
	 * @param contributedExtensionPoint
	 *            : The extension point contributed
	 * @param configuredSchemaElement
	 *            : Configured schema element to link
	 */
	private static void linkToExtensionPointSchemaElement(
			ExtensionPoint contributedExtensionPoint,
			ConfiguredSchemaElement configuredSchemaElement) {

		// Get back contributed extension point's schema elements
		EList<SchemaElement> contribuedExtensionPointSchemaElement = contributedExtensionPoint
				.getSchemaElements();

		for (SchemaElement contributedExtPointSchemaElement : contribuedExtensionPointSchemaElement) {
			// Test if current extentesion point schema element has the same
			// name than received configured schema element
			if (contributedExtPointSchemaElement.getName().equalsIgnoreCase(
					configuredSchemaElement.getName())) {
				// if it's true, i make the link between both
				configuredSchemaElement
						.setSchemaElement(contributedExtPointSchemaElement);
			}
		}
	}

	/**
	 * Method that recursively add schema element children into configured
	 * schema element
	 * 
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param iConfigurationElement
	 *            : Ecplise's side configuration element
	 * @param configuredSchemaElement
	 *            : Received configured schema element to check if it has
	 *            children
	 * @param extPointElements
	 *            : List of schema elements contained by all extension points
	 */
	private static void createSchemaElementChildren(
			IntrospectionContext introContext,
			IConfigurationElement iConfigurationElement,
			ConfiguredSchemaElement configuredSchemaElement,
			EList<SchemaElement> extPointElements) {

		PlatformFactory platformFactory = PlatformFactory.eINSTANCE;

		// I get back configuration element children
		IConfigurationElement[] configurationElementsChildren = iConfigurationElement
				.getChildren();

		// Check if i have children
		if (configurationElementsChildren.length != 0) {

			for (IConfigurationElement currentIConfigurationElement : configurationElementsChildren) {
				// i create metamodel's configured schema element children
				ConfiguredSchemaElement configuredSchemaElementChild = platformFactory
						.createConfiguredSchemaElement();

				SchemaElement currentSchemaElementChild = null;

				// iterate on extension point's schema element
				for (SchemaElement schemaElement : extPointElements) {
					if (schemaElement.getName().equals(
							currentIConfigurationElement.getName())) {
						currentSchemaElementChild = schemaElement;
						// call that create configured schema element attribute
						// instance for extension's schema element
						createSchemaElementAttributesInstance(introContext,
								configuredSchemaElementChild,
								currentIConfigurationElement,
								currentSchemaElementChild);
					}
				}

				// Set the name
				configuredSchemaElementChild
						.setName(currentIConfigurationElement.getName());
				// Set the contributed schema element
				configuredSchemaElementChild
						.setSchemaElement(currentSchemaElementChild);
				// Add the contributed schema element
				configuredSchemaElement.getChildren().add(
						configuredSchemaElementChild);

				// recursive call of the method, to check if my current child
				// has children too
				createSchemaElementChildren(introContext,
						currentIConfigurationElement,
						configuredSchemaElementChild, extPointElements);
			}
		}
	}

	/**
	 * Method that create attributes of a configured schema element
	 * 
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param configuredSchemaElementChild
	 *            : Configured schema element that contains attributes
	 * @param currentConfigurationElement
	 *            : Eclipse's side configuration element
	 * @param currentSchemaElementChild
	 *            : extension point's schema element
	 */
	private static void createSchemaElementAttributesInstance(
			IntrospectionContext introContext,
			ConfiguredSchemaElement configuredSchemaElementChild,
			IConfigurationElement currentConfigurationElement,
			SchemaElement currentSchemaElementChild) {

		// Get attribute names of current configuration element
		String[] names = currentConfigurationElement.getAttributeNames();
		PlatformFactory platformFactory = PlatformFactory.eINSTANCE;

		// Get attributes of current schema element child
		EList<ConfigurationElementAttribute> extensionPointSideAttributes = currentSchemaElementChild
				.getAttributes();

		// if i have attributes on the current configuration element
		if (names.length != 0) {
			for (String attributeName : names) {
				ConfigurationElementAttribute currentEPSideAttribute = null;
				// and attributes on received schema element
				for (ConfigurationElementAttribute configurationElementAttribute : extensionPointSideAttributes) {
					// test on names
					if (configurationElementAttribute.getName().equals(
							attributeName)) {
						currentEPSideAttribute = configurationElementAttribute;
						break;
					}
				}

				ConfigurationElementAttributeInstance attributeInstance;
				attributeInstance = platformFactory
						.createConfigurationElementAttributeInstance();
				if (currentEPSideAttribute != null) {
					String attributeValue = currentConfigurationElement
							.getAttribute(attributeName);
					// Check the type of current EPSideAttribute
					ConfigurationElementAttributeKind type = currentEPSideAttribute
							.getType();
					// Set the name of attribute instance extension's side
					attributeInstance.setName(attributeName);
					// Set the type of attribute instance extension's side
					attributeInstance.setType(type);
					attributeInstance
							.setAttributeDefinition(currentEPSideAttribute);
					// switch on the type to define which kind of attribute
					// value it is
					switch (type) {
					case BOOLEAN:
						BooleanValue bval = platformFactory
								.createBooleanValue();
						bval.setValue(Boolean.parseBoolean(attributeValue));
						attributeInstance.setContainedValue(bval);
						break;

					case JAVA:
						JavaClassValue jval = platformFactory
								.createJavaClassValue();
						jval.setClassName(currentConfigurationElement
								.getAttribute(attributeName));
						attributeInstance.setContainedValue(jval);
						break;

					default:
						StringValue val = platformFactory.createStringValue();
						val.setValue(attributeValue);
						attributeInstance.setContainedValue(val);
						break;
					}
				}
				// add the attribute instance to configured schema element child
				configuredSchemaElementChild.getConfigurationElements().add(
						attributeInstance);
			}
		}
	}

}
