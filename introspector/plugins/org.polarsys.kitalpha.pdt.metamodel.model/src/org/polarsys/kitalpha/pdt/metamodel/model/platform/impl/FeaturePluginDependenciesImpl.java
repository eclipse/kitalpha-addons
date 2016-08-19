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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeaturePluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Plugin Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.FeaturePluginDependenciesImpl#getPluginDependencies <em>Plugin Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturePluginDependenciesImpl extends EObjectImpl implements FeaturePluginDependencies {

	/**
	 * The cached value of the '{@link #getPluginDependencies() <em>Plugin Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureToPluginDependency> pluginDependencies;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePluginDependenciesImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.FEATURE_PLUGIN_DEPENDENCIES;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<FeatureToPluginDependency> getPluginDependencies() {

		if (pluginDependencies == null) {
			pluginDependencies = new EObjectContainmentEList<FeatureToPluginDependency>(FeatureToPluginDependency.class, this, PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES);
		}
		return pluginDependencies;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
				return ((InternalEList<?>)getPluginDependencies()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
				return getPluginDependencies();
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
			case PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
				getPluginDependencies().clear();
				getPluginDependencies().addAll((Collection<? extends FeatureToPluginDependency>)newValue);
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
			case PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
				getPluginDependencies().clear();
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
			case PlatformPackage.FEATURE_PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
				return pluginDependencies != null && !pluginDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //FeaturePluginDependenciesImpl
