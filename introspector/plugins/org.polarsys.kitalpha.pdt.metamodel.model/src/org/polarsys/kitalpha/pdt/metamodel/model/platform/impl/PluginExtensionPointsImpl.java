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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Extension Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginExtensionPointsImpl#getExtensionPoints <em>Extension Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginExtensionPointsImpl extends EObjectImpl implements PluginExtensionPoints {

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionPoints;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginExtensionPointsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLUGIN_EXTENSION_POINTS;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ExtensionPoint> getExtensionPoints() {

		if (extensionPoints == null) {
			extensionPoints = new EObjectContainmentEList<ExtensionPoint>(ExtensionPoint.class, this, PlatformPackage.PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS);
		}
		return extensionPoints;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS:
				return ((InternalEList<?>)getExtensionPoints()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS:
				return getExtensionPoints();
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
			case PlatformPackage.PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS:
				getExtensionPoints().clear();
				getExtensionPoints().addAll((Collection<? extends ExtensionPoint>)newValue);
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
			case PlatformPackage.PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS:
				getExtensionPoints().clear();
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
			case PlatformPackage.PLUGIN_EXTENSION_POINTS__EXTENSION_POINTS:
				return extensionPoints != null && !extensionPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //PluginExtensionPointsImpl
