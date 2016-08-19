/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getSchemaElementReference()
 * @model
 * @generated
 */

public interface SchemaElementReference extends Cardinality, NamedElement {





	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(SchemaElement)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getSchemaElementReference_Reference()
	 * @model required="true"
	 * @generated
	 */

	SchemaElement getReference();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference#getReference <em>Reference</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */

	void setReference(SchemaElement value);





} // SchemaElementReference
