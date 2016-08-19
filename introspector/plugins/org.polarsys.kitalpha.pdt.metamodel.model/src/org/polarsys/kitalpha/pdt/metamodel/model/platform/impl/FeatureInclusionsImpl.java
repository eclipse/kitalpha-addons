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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusions;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Inclusions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionsImpl#getFeatureInclusions <em>Feature Inclusions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureInclusionsImpl extends EObjectImpl implements FeatureInclusions {

	/**
	 * The cached value of the '{@link #getFeatureInclusions() <em>Feature Inclusions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureInclusions()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureInclusion> featureInclusions;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureInclusionsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.FEATURE_INCLUSIONS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<FeatureInclusion> getFeatureInclusions() {

		if (featureInclusions == null) {
			featureInclusions = new EObjectContainmentEList<FeatureInclusion>(FeatureInclusion.class, this, PlatformPackage.FEATURE_INCLUSIONS__FEATURE_INCLUSIONS);
		}
		return featureInclusions;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.FEATURE_INCLUSIONS__FEATURE_INCLUSIONS:
				return ((InternalEList<?>)getFeatureInclusions()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.FEATURE_INCLUSIONS__FEATURE_INCLUSIONS:
				return getFeatureInclusions();
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
			case PlatformPackage.FEATURE_INCLUSIONS__FEATURE_INCLUSIONS:
				getFeatureInclusions().clear();
				getFeatureInclusions().addAll((Collection<? extends FeatureInclusion>)newValue);
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
			case PlatformPackage.FEATURE_INCLUSIONS__FEATURE_INCLUSIONS:
				getFeatureInclusions().clear();
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
			case PlatformPackage.FEATURE_INCLUSIONS__FEATURE_INCLUSIONS:
				return featureInclusions != null && !featureInclusions.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //FeatureInclusionsImpl
