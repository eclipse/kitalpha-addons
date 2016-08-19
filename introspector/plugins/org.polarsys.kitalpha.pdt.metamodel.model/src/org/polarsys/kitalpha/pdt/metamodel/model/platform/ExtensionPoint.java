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
 * A representation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getSchemaElements <em>Schema Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getExtensionSchemaElement <em>Extension Schema Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExtensionPoint()
 * @model
 * @generated
 */

public interface ExtensionPoint extends IdentifiedElement {





	/**
	 * Returns the value of the '<em><b>Schema Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Elements</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExtensionPoint_SchemaElements()
	 * @model containment="true"
	 * @generated
	 */

	EList<SchemaElement> getSchemaElements();







	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getExtensionPoint <em>Extension Point</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributors</em>' reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExtensionPoint_Contributors()
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getExtensionPoint
	 * @model opposite="extensionPoint"
	 * @generated
	 */

	EList<Extension> getContributors();







	/**
	 * Returns the value of the '<em><b>Extension Schema Element</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Schema Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Schema Element</em>' reference.
	 * @see #setExtensionSchemaElement(SchemaElement)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExtensionPoint_ExtensionSchemaElement()
	 * @model
	 * @generated
	 */

	SchemaElement getExtensionSchemaElement();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getExtensionSchemaElement <em>Extension Schema Element</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Schema Element</em>' reference.
	 * @see #getExtensionSchemaElement()
	 * @generated
	 */

	void setExtensionSchemaElement(SchemaElement value);





} // ExtensionPoint
