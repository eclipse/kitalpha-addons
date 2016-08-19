/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionImpl#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionImpl#getConfiguredSchemaElement <em>Configured Schema Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends IdentifiedElementImpl implements Extension {

	/**
	 * The cached value of the '{@link #getExtensionPoint() <em>Extension Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected ExtensionPoint extensionPoint;




	/**
	 * The cached value of the '{@link #getConfiguredSchemaElement() <em>Configured Schema Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredSchemaElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguredSchemaElement> configuredSchemaElement;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.EXTENSION;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ExtensionPoint getExtensionPoint() {

		if (extensionPoint != null && extensionPoint.eIsProxy()) {
			InternalEObject oldExtensionPoint = (InternalEObject)extensionPoint;
			extensionPoint = (ExtensionPoint)eResolveProxy(oldExtensionPoint);
			if (extensionPoint != oldExtensionPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.EXTENSION__EXTENSION_POINT, oldExtensionPoint, extensionPoint));
			}
		}
		return extensionPoint;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ExtensionPoint basicGetExtensionPoint() {

		return extensionPoint;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExtensionPoint(ExtensionPoint newExtensionPoint, NotificationChain msgs) {

		ExtensionPoint oldExtensionPoint = extensionPoint;
		extensionPoint = newExtensionPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.EXTENSION__EXTENSION_POINT, oldExtensionPoint, newExtensionPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtensionPoint(ExtensionPoint newExtensionPoint) {

		if (newExtensionPoint != extensionPoint) {
			NotificationChain msgs = null;
			if (extensionPoint != null)
				msgs = ((InternalEObject)extensionPoint).eInverseRemove(this, PlatformPackage.EXTENSION_POINT__CONTRIBUTORS, ExtensionPoint.class, msgs);
			if (newExtensionPoint != null)
				msgs = ((InternalEObject)newExtensionPoint).eInverseAdd(this, PlatformPackage.EXTENSION_POINT__CONTRIBUTORS, ExtensionPoint.class, msgs);
			msgs = basicSetExtensionPoint(newExtensionPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.EXTENSION__EXTENSION_POINT, newExtensionPoint, newExtensionPoint));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ConfiguredSchemaElement> getConfiguredSchemaElement() {

		if (configuredSchemaElement == null) {
			configuredSchemaElement = new EObjectContainmentEList<ConfiguredSchemaElement>(ConfiguredSchemaElement.class, this, PlatformPackage.EXTENSION__CONFIGURED_SCHEMA_ELEMENT);
		}
		return configuredSchemaElement;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.EXTENSION__EXTENSION_POINT:
				if (extensionPoint != null)
					msgs = ((InternalEObject)extensionPoint).eInverseRemove(this, PlatformPackage.EXTENSION_POINT__CONTRIBUTORS, ExtensionPoint.class, msgs);
				return basicSetExtensionPoint((ExtensionPoint)otherEnd, msgs);
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
			case PlatformPackage.EXTENSION__EXTENSION_POINT:
				return basicSetExtensionPoint(null, msgs);
			case PlatformPackage.EXTENSION__CONFIGURED_SCHEMA_ELEMENT:
				return ((InternalEList<?>)getConfiguredSchemaElement()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.EXTENSION__EXTENSION_POINT:
				if (resolve) return getExtensionPoint();
				return basicGetExtensionPoint();
			case PlatformPackage.EXTENSION__CONFIGURED_SCHEMA_ELEMENT:
				return getConfiguredSchemaElement();
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
			case PlatformPackage.EXTENSION__EXTENSION_POINT:
				setExtensionPoint((ExtensionPoint)newValue);
				return;
			case PlatformPackage.EXTENSION__CONFIGURED_SCHEMA_ELEMENT:
				getConfiguredSchemaElement().clear();
				getConfiguredSchemaElement().addAll((Collection<? extends ConfiguredSchemaElement>)newValue);
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
			case PlatformPackage.EXTENSION__EXTENSION_POINT:
				setExtensionPoint((ExtensionPoint)null);
				return;
			case PlatformPackage.EXTENSION__CONFIGURED_SCHEMA_ELEMENT:
				getConfiguredSchemaElement().clear();
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
			case PlatformPackage.EXTENSION__EXTENSION_POINT:
				return extensionPoint != null;
			case PlatformPackage.EXTENSION__CONFIGURED_SCHEMA_ELEMENT:
				return configuredSchemaElement != null && !configuredSchemaElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //ExtensionImpl
