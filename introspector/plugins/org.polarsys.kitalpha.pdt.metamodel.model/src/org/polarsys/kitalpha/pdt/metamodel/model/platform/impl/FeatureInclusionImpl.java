/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureInclusion;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeatureInclusionImpl#getIncludedFeature <em>Included Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureInclusionImpl extends VersionnedElementImpl implements FeatureInclusion {

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;




	/**
	 * The cached value of the '{@link #getIncludedFeature() <em>Included Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature includedFeature;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureInclusionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.FEATURE_INCLUSION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isOptional() {

		return optional;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOptional(boolean newOptional) {

		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE_INCLUSION__OPTIONAL, oldOptional, optional));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Feature getIncludedFeature() {

		if (includedFeature != null && includedFeature.eIsProxy()) {
			InternalEObject oldIncludedFeature = (InternalEObject)includedFeature;
			includedFeature = (Feature)eResolveProxy(oldIncludedFeature);
			if (includedFeature != oldIncludedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.FEATURE_INCLUSION__INCLUDED_FEATURE, oldIncludedFeature, includedFeature));
			}
		}
		return includedFeature;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Feature basicGetIncludedFeature() {

		return includedFeature;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIncludedFeature(Feature newIncludedFeature) {

		Feature oldIncludedFeature = includedFeature;
		includedFeature = newIncludedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.FEATURE_INCLUSION__INCLUDED_FEATURE, oldIncludedFeature, includedFeature));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.FEATURE_INCLUSION__OPTIONAL:
				return isOptional();
			case PlatformPackage.FEATURE_INCLUSION__INCLUDED_FEATURE:
				if (resolve) return getIncludedFeature();
				return basicGetIncludedFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.FEATURE_INCLUSION__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case PlatformPackage.FEATURE_INCLUSION__INCLUDED_FEATURE:
				setIncludedFeature((Feature)newValue);
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
			case PlatformPackage.FEATURE_INCLUSION__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case PlatformPackage.FEATURE_INCLUSION__INCLUDED_FEATURE:
				setIncludedFeature((Feature)null);
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
			case PlatformPackage.FEATURE_INCLUSION__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case PlatformPackage.FEATURE_INCLUSION__INCLUDED_FEATURE:
				return includedFeature != null;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}


} //FeatureInclusionImpl
