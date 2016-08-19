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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginDependenciesImpl#getPluginDependencies <em>Plugin Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginDependenciesImpl extends EObjectImpl implements PluginDependencies {

	/**
	 * The cached value of the '{@link #getPluginDependencies() <em>Plugin Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<PluginDependency> pluginDependencies;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginDependenciesImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLUGIN_DEPENDENCIES;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<PluginDependency> getPluginDependencies() {

		if (pluginDependencies == null) {
			pluginDependencies = new EObjectContainmentEList<PluginDependency>(PluginDependency.class, this, PlatformPackage.PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES);
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
			case PlatformPackage.PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
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
			case PlatformPackage.PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
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
			case PlatformPackage.PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
				getPluginDependencies().clear();
				getPluginDependencies().addAll((Collection<? extends PluginDependency>)newValue);
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
			case PlatformPackage.PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
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
			case PlatformPackage.PLUGIN_DEPENDENCIES__PLUGIN_DEPENDENCIES:
				return pluginDependencies != null && !pluginDependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //PluginDependenciesImpl
