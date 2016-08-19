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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureDependenciesImpl#getFeatureDependencies <em>Feature Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureDependenciesImpl extends EObjectImpl implements FeatureDependencies {

	/**
	 * The cached value of the '{@link #getFeatureDependencies() <em>Feature Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureDependency> featureDependencies;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureDependenciesImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.FEATURE_DEPENDENCIES;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<FeatureDependency> getFeatureDependencies() {

		if (featureDependencies == null) {
			featureDependencies = new EObjectContainmentEList<FeatureDependency>(FeatureDependency.class, this, PlatformPackage.FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES);
		}
		return featureDependencies;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES:
				return ((InternalEList<?>)getFeatureDependencies()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES:
				return getFeatureDependencies();
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
			case PlatformPackage.FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES:
				getFeatureDependencies().clear();
				getFeatureDependencies().addAll((Collection<? extends FeatureDependency>)newValue);
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
			case PlatformPackage.FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES:
				getFeatureDependencies().clear();
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
			case PlatformPackage.FEATURE_DEPENDENCIES__FEATURE_DEPENDENCIES:
				return featureDependencies != null && !featureDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //FeatureDependenciesImpl
