/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Element Attribute Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getAttributeDefinition <em>Attribute Definition</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getContainedValue <em>Contained Value</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfigurationElementAttributeInstance()
 * @model
 * @generated
 */

public interface ConfigurationElementAttributeInstance extends ConfigurationElementAttribute {





	/**
	 * Returns the value of the '<em><b>Attribute Definition</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Definition</em>' reference.
	 * @see #setAttributeDefinition(ConfigurationElementAttribute)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfigurationElementAttributeInstance_AttributeDefinition()
	 * @model required="true"
	 * @generated
	 */

	ConfigurationElementAttribute getAttributeDefinition();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getAttributeDefinition <em>Attribute Definition</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Definition</em>' reference.
	 * @see #getAttributeDefinition()
	 * @generated
	 */

	void setAttributeDefinition(ConfigurationElementAttribute value);







	/**
	 * Returns the value of the '<em><b>Contained Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Value</em>' containment reference.
	 * @see #setContainedValue(AbstractValue)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfigurationElementAttributeInstance_ContainedValue()
	 * @model containment="true" required="true"
	 * @generated
	 */

	AbstractValue getContainedValue();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance#getContainedValue <em>Contained Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Value</em>' containment reference.
	 * @see #getContainedValue()
	 * @generated
	 */

	void setContainedValue(AbstractValue value);





} // ConfigurationElementAttributeInstance
