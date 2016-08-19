/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Introspection Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getDetails <em>Details</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIntrospectionError()
 * @model
 * @generated
 */

public interface IntrospectionError extends EObject {





	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIntrospectionError_Summary()
	 * @model required="true"
	 * @generated
	 */

	String getSummary();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getSummary <em>Summary</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */

	void setSummary(String value);







	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIntrospectionError_Details()
	 * @model required="true"
	 * @generated
	 */

	String getDetails();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getDetails <em>Details</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */

	void setDetails(String value);







	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement#getEclipseElementIntrospectionErrors <em>Eclipse Element Introspection Errors</em>}'.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EclipseElement)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getIntrospectionError_Target()
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement#getEclipseElementIntrospectionErrors
	 * @model opposite="eclipseElementIntrospectionErrors" required="true"
	 * @generated
	 */

	EclipseElement getTarget();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError#getTarget <em>Target</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */

	void setTarget(EclipseElement value);





} // IntrospectionError
