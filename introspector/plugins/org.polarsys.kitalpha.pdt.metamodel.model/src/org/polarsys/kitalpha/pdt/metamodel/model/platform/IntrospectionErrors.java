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
 * A representation of the model object '<em><b>Introspection Errors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors#getIntrospectionErrors <em>Introspection Errors</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIntrospectionErrors()
 * @model
 * @generated
 */

public interface IntrospectionErrors extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Introspection Errors</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introspection Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introspection Errors</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIntrospectionErrors_IntrospectionErrors()
	 * @model containment="true"
	 * @generated
	 */

	EList<IntrospectionError> getIntrospectionErrors();





} // IntrospectionErrors
