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
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getConfiguredSchemaElement <em>Configured Schema Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExtension()
 * @model
 * @generated
 */

public interface Extension extends IdentifiedElement {





	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getContributors <em>Contributors</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' reference.
	 * @see #setExtensionPoint(ExtensionPoint)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExtension_ExtensionPoint()
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint#getContributors
	 * @model opposite="contributors" required="true"
	 * @generated
	 */

	ExtensionPoint getExtensionPoint();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension#getExtensionPoint <em>Extension Point</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Point</em>' reference.
	 * @see #getExtensionPoint()
	 * @generated
	 */

	void setExtensionPoint(ExtensionPoint value);







	/**
	 * Returns the value of the '<em><b>Configured Schema Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured Schema Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Schema Element</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getExtension_ConfiguredSchemaElement()
	 * @model containment="true"
	 * @generated
	 */

	EList<ConfiguredSchemaElement> getConfiguredSchemaElement();





} // Extension
