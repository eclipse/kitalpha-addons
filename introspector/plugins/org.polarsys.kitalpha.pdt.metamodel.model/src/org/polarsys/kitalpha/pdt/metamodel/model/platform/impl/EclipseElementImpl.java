/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.EclipseElementImpl#getEclipseElementIntrospectionErrors <em>Eclipse Element Introspection Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclipseElementImpl extends EObjectImpl implements EclipseElement {

	/**
	 * The cached value of the '{@link #getEclipseElementIntrospectionErrors() <em>Eclipse Element Introspection Errors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclipseElementIntrospectionErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<IntrospectionError> eclipseElementIntrospectionErrors;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.ECLIPSE_ELEMENT;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<IntrospectionError> getEclipseElementIntrospectionErrors() {

		if (eclipseElementIntrospectionErrors == null) {
			eclipseElementIntrospectionErrors = new EObjectWithInverseResolvingEList<IntrospectionError>(IntrospectionError.class, this, PlatformPackage.ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS, PlatformPackage.INTROSPECTION_ERROR__TARGET);
		}
		return eclipseElementIntrospectionErrors;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEclipseElementIntrospectionErrors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS:
				return ((InternalEList<?>)getEclipseElementIntrospectionErrors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS:
				return getEclipseElementIntrospectionErrors();
		}
		return super.eGet(featureID, resolve, coreType);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.ECLIPSE_ELEMENT__ECLIPSE_ELEMENT_INTROSPECTION_ERRORS:
				return eclipseElementIntrospectionErrors != null && !eclipseElementIntrospectionErrors.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //EclipseElementImpl
