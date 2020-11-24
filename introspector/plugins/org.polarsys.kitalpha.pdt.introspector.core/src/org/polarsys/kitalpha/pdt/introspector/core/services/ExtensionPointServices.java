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

import java.util.Arrays;
import java.util.HashMap;

import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.ischema.ISchema;
import org.eclipse.pde.internal.core.ischema.ISchemaAttribute;
import org.eclipse.pde.internal.core.ischema.ISchemaCompositor;
import org.eclipse.pde.internal.core.ischema.ISchemaElement;
import org.eclipse.pde.internal.core.ischema.ISchemaObject;
import org.eclipse.pde.internal.core.schema.SchemaComplexType;
import org.eclipse.pde.internal.core.schema.SchemaRegistry;
import org.eclipse.pde.internal.core.schema.SchemaRootElement;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference;

/**
 * Class that create and set all element contained by an extension point
 * 
 * 
 * @author Xavier DECOOL
 *
 */
@SuppressWarnings("restriction")
public class ExtensionPointServices {

	/**
	 * Public method that call other privates methods used to create extension
	 * point's elements
	 * 
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param currentExtensionPoint
	 *            : Eclipse's side extension point
	 * @param extensionPoint
	 *            : Metamodel's side extension point
	 */
	public static void createSchemaElements(IntrospectionContext introContext,
			IExtensionPoint currentExtensionPoint, ExtensionPoint extensionPoint) {

		// Get back extension point ID
		String extensionPointID = currentExtensionPoint.getUniqueIdentifier();
		// Find in the extension point's hash map which extension point is
		// refered by extension point ID key
		extensionPoint = introContext.getExtensionPointId_ExtensionPoint().get(
				extensionPointID);
		SchemaRegistry schemaRegistry = PDECore.getDefault()
				.getSchemaRegistry();
		// Eclipse's side current plugin schema
		ISchema currentPluginSchema = schemaRegistry
				.getSchema(extensionPointID);

		// If current plugin has a schema
		if (currentPluginSchema != null) {
			// Create a new hach map of schema element
			HashMap<ISchemaElement, SchemaElement> schemaElementHashMap = new HashMap<ISchemaElement, SchemaElement>();
			createSchemaElements(introContext, extensionPoint,
					currentPluginSchema, schemaElementHashMap);
		}
		else{
			
			//je n'ai pas reussi à recupérer le schema de l'extension point en question 
			String message="Cannot find any schema element related to this extension point";
			String detail="Cannot find any schema element related to this extension point.";
			
			
			
			// je lève une erreur
			Helpers.createErrorForModelElement(extensionPoint, introContext, message, detail);
		}
	}

	/**
	 * Method that create extension point's schema element
	 * 
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param extensionPoint
	 *            : Metamodel's side extension point
	 * @param currentPluginSchema
	 *            : Eclipse's side schema of received plugin
	 * @param schemaElementHashMap
	 *            : Hash Map of schema element
	 */
	private static void createSchemaElements(IntrospectionContext introContext,
			ExtensionPoint extensionPoint, ISchema currentPluginSchema,
			HashMap<ISchemaElement, SchemaElement> schemaElementHashMap) {
		ISchemaElement[] eclipseSchemaElements = currentPluginSchema
				.getResolvedElements();
		EList<SchemaElement> schemaElements = extensionPoint
				.getSchemaElements();
		schemaElementHashMap = introContext
				.getEclipseSchemaElement_SchemaElement();
		PlatformFactory platformFactory = PlatformFactory.eINSTANCE;
		for (ISchemaElement iSchemaElement : eclipseSchemaElements) {
			ISchemaAttribute[] schemaAttributes = iSchemaElement
					.getAttributes();

			// Create schema element
			SchemaElement schemaElement = platformFactory.createSchemaElement();

			/*
			 * Work on Schema Element and Attribute
			 */
			setUpSchemaElementAttribute(platformFactory, schemaElement,
					schemaAttributes, schemaElements);

			schemaElement.setName(iSchemaElement.getName());
			schemaElements.add(schemaElement);
			if (iSchemaElement instanceof SchemaRootElement) {
				extensionPoint.setExtensionSchemaElement(schemaElement);
			}
			introContext.addSchemaElement(iSchemaElement, schemaElement);

		}
		/*
		 * Here i have all my schema elements, now i check which contains a
		 * complex compositor
		 */
		for (ISchemaElement iSchemaElement : eclipseSchemaElements) {
			setUpComplexCompositor(introContext, platformFactory,
					iSchemaElement);
		}
//		for (SchemaElement schemaElement : schemaElements) {
//			EList<EObject> list =;
//			EList<ConfigurationElementAttribute> attributes = schemaElement.getAttributes();
//			schemaElement.getComplexCompositor();
//		}
		
	}

	private static void setUpComplexCompositor(
			IntrospectionContext introContext, PlatformFactory platformFactory,
			ISchemaElement iSchemaElement) {
		// If the schema element is type of complex
		if (iSchemaElement.getType() instanceof SchemaComplexType) {

			// Get the type
			SchemaComplexType sct = (SchemaComplexType) iSchemaElement
					.getType();
			// and the compositor
			ISchemaCompositor compositor = sct.getCompositor();

			// If i have a compositor
			if (compositor != null) {
				SchemaElement currentSchemaElement = introContext
						.getEclipseSchemaElement_SchemaElement().get(
								iSchemaElement);
				// Create it
				ComplexCompositor complexCompositor = platformFactory
						.createComplexCompositor();

				/*
				 * Set up Cardinality and kind
				 */
				setUpComplexCompositorCardinalityAndKind(compositor,
						complexCompositor);

				/*
				 * Set Up ComplexCompositorChildren
				 */
				setUpComplexCompositorChildren(introContext, compositor,
						complexCompositor);
				ISchemaObject[] children = compositor.getChildren();
				if (children.length != 0) {
					for (ISchemaObject iSchemaObject : children) {
						setUpComplexCompositorSchemaElementReference(
								introContext, complexCompositor, iSchemaObject);
					}

				}
				// Add my complete complex compositor to my current schema
				// element
				currentSchemaElement.setComplexCompositor(complexCompositor);
			}
		}
	}

	/**
	 * Method that set up schema element reference contained by a complex
	 * compositor
	 * 
	 * @param introContext
	 *            : Class where are stocked Hash Maps to reuse objects
	 * @param complexCompositor
	 *            : Received complex compositor
	 * @param iSchemaObject
	 *            : Child of my complex compositor
	 */
	private static void setUpComplexCompositorSchemaElementReference(
			IntrospectionContext introContext,
			ComplexCompositor complexCompositor, ISchemaObject iSchemaObject) {
		if (iSchemaObject instanceof org.eclipse.pde.internal.core.schema.SchemaElementReference) {
			SchemaElementReference schemaElementReference = PlatformFactory.eINSTANCE
					.createSchemaElementReference();
			ISchemaElement currentReferencedSchemaElement = ((org.eclipse.pde.internal.core.schema.SchemaElementReference) iSchemaObject)
					.getReferencedElement();

			if (currentReferencedSchemaElement != null) {
				schemaElementReference.setUnbounded(false);
				int maxOccurs = ((org.eclipse.pde.internal.core.schema.SchemaElementReference) iSchemaObject)
						.getMaxOccurs();
				schemaElementReference
						.setMinCard(currentReferencedSchemaElement
								.getMinOccurs());
				if (maxOccurs == Integer.MAX_VALUE) {
					// System.out.println("je suis ici :" +
					// iSchemaObject.getName());
					schemaElementReference.setUnbounded(true);
					schemaElementReference.setMaxCard(maxOccurs);
				} else
					schemaElementReference.setMaxCard(maxOccurs);
				HashMap<ISchemaElement, SchemaElement> eclipseSchemaElement_SchemaElement = introContext
						.getEclipseSchemaElement_SchemaElement();
				SchemaElement referencedSchemaElement = eclipseSchemaElement_SchemaElement
						.get(currentReferencedSchemaElement);
				schemaElementReference.setReference(referencedSchemaElement);
				schemaElementReference.setName(currentReferencedSchemaElement
						.getName());
				complexCompositor.getElementReferences().add(
						schemaElementReference);
			}
		}
	}

	/**
	 * @param introContext
	 * @param currentComplexCompositor2
	 * @param complexSchemaElement
	 */
	private static void setUpComplexCompositorChildren(
			IntrospectionContext introContext,
			ISchemaCompositor currentComplexCompositor2,
			ComplexCompositor complexCompositor) {

		/*
		 * ComplexCompositorChildren
		 */
		if (currentComplexCompositor2 != null) {
			ISchemaObject[] children = currentComplexCompositor2.getChildren();

			if (children.length != 0) {
				for (ISchemaObject schemaObject : children) {
					if (schemaObject instanceof ISchemaCompositor) {
						ComplexCompositor complexCompositorChild = PlatformFactory.eINSTANCE
								.createComplexCompositor();
						ISchemaCompositor currentComplexCompositor = (ISchemaCompositor) schemaObject;
						setUpComplexCompositorCardinalityAndKind(
								currentComplexCompositor,
								complexCompositorChild);
						complexCompositor.getComplexCompositorChildren().add(
								complexCompositorChild);
						setUpComplexCompositorChildren(introContext,
								currentComplexCompositor,
								complexCompositorChild);
					}
				}
			}
		}
	}

	/**
	 * Method that set up cardinality and kind of a complex compositor
	 * 
	 * @param currentComplexCompositor
	 *            : Eclipse's side schema element
	 * @param complexCompositor
	 *            : Complex compositor which needs to be set
	 */
	private static void setUpComplexCompositorCardinalityAndKind(
			ISchemaCompositor currentComplexCompositor,
			ComplexCompositor complexCompositor) {
		// Get min and max cardinality of the received schema element
		int complexCompositorMinCard = currentComplexCompositor.getMinOccurs();
		int complexCompositorMaxCard = currentComplexCompositor.getMaxOccurs();
		// System.out.println("ep : " + iSchemaElement.getName() +
		// " max card : "
		// + complexCompositorMaxCard);
		complexCompositor.setUnbounded(false);

		// Set cardinality
		if (complexCompositorMaxCard == Integer.MAX_VALUE) {
			complexCompositor.setUnbounded(true);
			complexCompositor.setMaxCard(complexCompositorMaxCard);
		} else
			complexCompositor.setMaxCard(complexCompositorMaxCard);
		complexCompositor.setMinCard(complexCompositorMinCard);
		int kind = 0;

		// If schema type has a compositor
		if (currentComplexCompositor != null) {
			// Set kind
			kind = currentComplexCompositor.getKind();
		}
		if (currentComplexCompositor != null) {
			// If kind is type of choice or sequence
			if (kind == 1 || kind == 2) {
				// Set it to his real kind
				switch (kind) {
				case 1:
					complexCompositor
							.setComplexCompositorKind(ComplexCompositorKind.CHOICE);
					break;
				case 2:
					complexCompositor
							.setComplexCompositorKind(ComplexCompositorKind.SEQUENCE);
					break;
				default:
					break;
				}

			}
		}
	}

	/**
	 * Method that create and set up configured schema element attributes
	 * 
	 * @param platformFactory
	 * @param schemaElement
	 *            : Extension point contributed schema element
	 * @param schemaAttributes
	 *            : List of attributes (Eclipse's side)
	 * @param schemaElements
	 *            : List of schema elements
	 */
	private static void setUpSchemaElementAttribute(
			PlatformFactory platformFactory, SchemaElement schemaElement,
			ISchemaAttribute[] schemaAttributes,
			EList<SchemaElement> schemaElements) {

		// Recursive creation of configuration element attributes
		for (ISchemaAttribute iSchemaAttribute : schemaAttributes) {
			ConfigurationElementAttribute configurationElementAttribute = platformFactory
					.createConfigurationElementAttribute();

			// Set the name
			configurationElementAttribute.setName(iSchemaAttribute.getName());

			// get the type of iSchemaAttribute
			int currentSchemaAttributeType = iSchemaAttribute.getKind();
			// Get the type's name
			String typeName = iSchemaAttribute.getType().getName();

			// Search for the kind of this configuration element attribute
			ConfigurationElementAttributeKind kind = getKindForThisSetting(
					typeName, currentSchemaAttributeType);

			// Set the type
			configurationElementAttribute.setType(kind);
			if (iSchemaAttribute.getBasedOn() != null) {

				// Search for the base on (extends and implements)
				String basedOn = iSchemaAttribute.getBasedOn();

				// Separate extends and implements and stock it into a table of
				// string
				String[] splitResult = basedOn.split(":");

				// if table contains 2 String extends and implements exists
				if (splitResult.length == 2) {
					// Set extends and implements
					String _extends = splitResult[0];
					String _implements = splitResult[1];

					// if extends and implements exists
					if ((_extends.length() > 0) && (_implements.length() > 0))
						// set based on "extends : extends value ; implements :
						// implements value
						configurationElementAttribute.setBasedOn("extends : "
								+ _extends + " ; implements : " + _implements);
					else
						// we only have implements
						configurationElementAttribute
								.setBasedOn("implements : " + _implements);
				}
				// else we only have extends
				else if ((splitResult.length == 1) && (basedOn.contains(":"))) {
					String _extends = basedOn;
					configurationElementAttribute.setBasedOn("extends : "
							+ _extends);
				}
				// else we have implements
				else if ((splitResult.length == 1)) {
					String _implements = basedOn;
					configurationElementAttribute.setBasedOn("implements : "
							+ _implements);
				}
			}

			configurationElementAttribute.setTranslatable(iSchemaAttribute
					.isTranslatable());
			// Finally, add configured attribute into received schema element
			schemaElement.getAttributes().add(configurationElementAttribute);

		}
	}

	/**
	 * Method that get kind of current attribute
	 * 
	 * @param typeName
	 *            : Name of the attribute type
	 * @param currentSchemaAttributeType
	 *            : Type of the attribute
	 * @return ConfigurationElementAttributeKind
	 */
	private static ConfigurationElementAttributeKind getKindForThisSetting(
			String typeName, int currentSchemaAttributeType) {

		// If we have a string
		if (typeName.equals("string")) {
			switch (currentSchemaAttributeType) {
			case 1:
				return ConfigurationElementAttributeKind.JAVA;

			case 0:
				return ConfigurationElementAttributeKind.STRING;

			case 3:
				return ConfigurationElementAttributeKind.IDENTIFIER;

			case 2:
				return ConfigurationElementAttributeKind.RESOURCE;

			default:
				return null;
			}
		}

		// If we have a boolean
		if (typeName.equals("boolean")) {
			switch (currentSchemaAttributeType) {
			case 0:
				return ConfigurationElementAttributeKind.BOOLEAN;
			default:
				return null;
			}
		}

		// If we have an integer
		if (typeName.equals("int")) {
			switch (currentSchemaAttributeType) {

			case 0:
				return ConfigurationElementAttributeKind.INTEGER;

			default:
				return null;
			}
		}

		// If we have a anyURI
		if (typeName.equals("anyURI")) {
			return ConfigurationElementAttributeKind.RESOURCE;
		}

		return null;
	}

	public static void sortExtensionPoints(EList<ExtensionPoint> extensionPoints) {
		ExtensionPoint[] extensionPointArray = (ExtensionPoint[]) extensionPoints
				.toArray();
		org.polarsys.kitalpha.pdt.introspector.core.comparators.ExtensionPointsComparator ExtensionPointsComparator = new org.polarsys.kitalpha.pdt.introspector.core.comparators.ExtensionPointsComparator();
		Arrays.sort(extensionPointArray, ExtensionPointsComparator);
		extensionPoints.clear();
		for (ExtensionPoint extensionPoint : extensionPointArray) {
			extensionPoints.add(extensionPoint);
		}
	}
	
	// public static void
	// sortComplexCompositorAndSchemaElementAttributes(EList<EObject> objects){
	// EObject[] objectsArray = (EObject[]) objects
	// .toArray();
	// objects.clear();
	// EObject object;
	// object = objectsArray[0];
	// objectsArray[0] = objectsArray[objectsArray.length];
	// objectsArray[objectsArray.length] = object;
	// }
}
