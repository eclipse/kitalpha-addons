/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IncludedPlugins;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included Plugins</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.IncludedPluginsImpl#getIncludedPlugins <em>Included Plugins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludedPluginsImpl extends EObjectImpl implements IncludedPlugins {

	/**
	 * The cached value of the '{@link #getIncludedPlugins() <em>Included Plugins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugin> includedPlugins;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedPluginsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.INCLUDED_PLUGINS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Plugin> getIncludedPlugins() {

		if (includedPlugins == null) {
			includedPlugins = new EObjectResolvingEList<Plugin>(Plugin.class, this, PlatformPackage.INCLUDED_PLUGINS__INCLUDED_PLUGINS);
		}
		return includedPlugins;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.INCLUDED_PLUGINS__INCLUDED_PLUGINS:
				return getIncludedPlugins();
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
			case PlatformPackage.INCLUDED_PLUGINS__INCLUDED_PLUGINS:
				getIncludedPlugins().clear();
				getIncludedPlugins().addAll((Collection<? extends Plugin>)newValue);
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
			case PlatformPackage.INCLUDED_PLUGINS__INCLUDED_PLUGINS:
				getIncludedPlugins().clear();
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
			case PlatformPackage.INCLUDED_PLUGINS__INCLUDED_PLUGINS:
				return includedPlugins != null && !includedPlugins.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //IncludedPluginsImpl
