/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement#getEclipseElementIntrospectionErrors <em>Eclipse Element Introspection Errors</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getEclipseElement()
 * @model
 * @generated
 */

public interface EclipseElement extends EObject {





	/**
	 * Returns the value of the '<em><b>Eclipse Element Introspection Errors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getTarget <em>Target</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclipse Element Introspection Errors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclipse Element Introspection Errors</em>' reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getEclipseElement_EclipseElementIntrospectionErrors()
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getTarget
	 * @model opposite="target" changeable="false" derived="true"
	 * @generated
	 */

	EList<IntrospectionError> getEclipseElementIntrospectionErrors();





} // EclipseElement
