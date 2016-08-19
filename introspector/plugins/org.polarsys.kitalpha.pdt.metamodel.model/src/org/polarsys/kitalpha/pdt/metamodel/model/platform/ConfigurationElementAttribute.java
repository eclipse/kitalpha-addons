/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Element Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfigurationElementAttribute()
 * @model
 * @generated
 */

public interface ConfigurationElementAttribute extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind
	 * @see #setType(ConfigurationElementAttributeKind)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfigurationElementAttribute_Type()
	 * @model
	 * @generated
	 */

	ConfigurationElementAttributeKind getType();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getType <em>Type</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind
	 * @see #getType()
	 * @generated
	 */

	void setType(ConfigurationElementAttributeKind value);







	/**
	 * Returns the value of the '<em><b>Based On</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' attribute.
	 * @see #setBasedOn(String)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfigurationElementAttribute_BasedOn()
	 * @model
	 * @generated
	 */

	String getBasedOn();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#getBasedOn <em>Based On</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' attribute.
	 * @see #getBasedOn()
	 * @generated
	 */

	void setBasedOn(String value);







	/**
	 * Returns the value of the '<em><b>Translatable</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translatable</em>' attribute.
	 * @see #setTranslatable(boolean)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getConfigurationElementAttribute_Translatable()
	 * @model required="true"
	 * @generated
	 */

	boolean isTranslatable();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute#isTranslatable <em>Translatable</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translatable</em>' attribute.
	 * @see #isTranslatable()
	 * @generated
	 */

	void setTranslatable(boolean value);





} // ConfigurationElementAttribute
