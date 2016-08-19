/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configured Schema Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getChildren <em>Children</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getSchemaElement <em>Schema Element</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getConfigurationElements <em>Configuration Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfiguredSchemaElement()
 * @model
 * @generated
 */

public interface ConfiguredSchemaElement extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfiguredSchemaElement_Children()
	 * @model containment="true"
	 * @generated
	 */

	EList<ConfiguredSchemaElement> getChildren();







	/**
	 * Returns the value of the '<em><b>Schema Element</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Element</em>' reference.
	 * @see #setSchemaElement(SchemaElement)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfiguredSchemaElement_SchemaElement()
	 * @model required="true"
	 * @generated
	 */

	SchemaElement getSchemaElement();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement#getSchemaElement <em>Schema Element</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Element</em>' reference.
	 * @see #getSchemaElement()
	 * @generated
	 */

	void setSchemaElement(SchemaElement value);







	/**
	 * Returns the value of the '<em><b>Configuration Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Elements</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfiguredSchemaElement_ConfigurationElements()
	 * @model containment="true"
	 * @generated
	 */

	EList<ConfigurationElementAttributeInstance> getConfigurationElements();





} // ConfiguredSchemaElement
