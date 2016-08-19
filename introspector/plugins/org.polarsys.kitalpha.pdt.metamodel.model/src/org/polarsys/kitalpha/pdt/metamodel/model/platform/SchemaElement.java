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
 * A representation of the model object '<em><b>Schema Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement#getComplexCompositor <em>Complex Compositor</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getSchemaElement()
 * @model
 * @generated
 */

public interface SchemaElement extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getSchemaElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */

	EList<ConfigurationElementAttribute> getAttributes();







	/**
	 * Returns the value of the '<em><b>Complex Compositor</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Compositor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Compositor</em>' containment reference.
	 * @see #setComplexCompositor(ComplexCompositor)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getSchemaElement_ComplexCompositor()
	 * @model containment="true"
	 * @generated
	 */

	ComplexCompositor getComplexCompositor();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement#getComplexCompositor <em>Complex Compositor</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Compositor</em>' containment reference.
	 * @see #getComplexCompositor()
	 * @generated
	 */

	void setComplexCompositor(ComplexCompositor value);





} // SchemaElement
