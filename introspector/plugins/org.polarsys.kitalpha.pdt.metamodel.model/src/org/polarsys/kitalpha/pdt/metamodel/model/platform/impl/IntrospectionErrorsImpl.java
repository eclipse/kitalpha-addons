/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionErrors;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Introspection Errors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IntrospectionErrorsImpl#getIntrospectionErrors <em>Introspection Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntrospectionErrorsImpl extends NamedElementImpl implements IntrospectionErrors {

	/**
	 * The cached value of the '{@link #getIntrospectionErrors() <em>Introspection Errors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntrospectionErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<IntrospectionError> introspectionErrors;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntrospectionErrorsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.INTROSPECTION_ERRORS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<IntrospectionError> getIntrospectionErrors() {

		if (introspectionErrors == null) {
			introspectionErrors = new EObjectContainmentEList<IntrospectionError>(IntrospectionError.class, this, PlatformPackage.INTROSPECTION_ERRORS__INTROSPECTION_ERRORS);
		}
		return introspectionErrors;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.INTROSPECTION_ERRORS__INTROSPECTION_ERRORS:
				return ((InternalEList<?>)getIntrospectionErrors()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.INTROSPECTION_ERRORS__INTROSPECTION_ERRORS:
				return getIntrospectionErrors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.INTROSPECTION_ERRORS__INTROSPECTION_ERRORS:
				getIntrospectionErrors().clear();
				getIntrospectionErrors().addAll((Collection<? extends IntrospectionError>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatformPackage.INTROSPECTION_ERRORS__INTROSPECTION_ERRORS:
				getIntrospectionErrors().clear();
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.INTROSPECTION_ERRORS__INTROSPECTION_ERRORS:
				return introspectionErrors != null && !introspectionErrors.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //IntrospectionErrorsImpl
