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
 * A representation of the model object '<em><b>Eclipse Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#getIntrospectionErrors <em>Introspection Errors</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#isQualifierIgnored <em>Qualifier Ignored</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getEclipseModel()
 * @model
 * @generated
 */

public interface EclipseModel extends NamedElement {





	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getEclipseModel_Repositories()
	 * @model containment="true"
	 * @generated
	 */

	EList<Repository> getRepositories();







	/**
	 * Returns the value of the '<em><b>Introspection Errors</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introspection Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introspection Errors</em>' containment reference list.
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getEclipseModel_IntrospectionErrors()
	 * @model containment="true"
	 * @generated
	 */

	EList<IntrospectionErrors> getIntrospectionErrors();







	/**
	 * Returns the value of the '<em><b>Qualifier Ignored</b></em>' attribute.
	 * The default value is <code>"false"</code>.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier Ignored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier Ignored</em>' attribute.
	 * @see #setQualifierIgnored(boolean)
	 * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage#getEclipseModel_QualifierIgnored()
	 * @model default="false" required="true"
	 * @generated
	 */

	boolean isQualifierIgnored();




	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel#isQualifierIgnored <em>Qualifier Ignored</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier Ignored</em>' attribute.
	 * @see #isQualifierIgnored()
	 * @generated
	 */

	void setQualifierIgnored(boolean value);





} // EclipseModel
