/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Element Attribute Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeInstanceImpl#getAttributeDefinition <em>Attribute Definition</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeInstanceImpl#getContainedValue <em>Contained Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationElementAttributeInstanceImpl extends ConfigurationElementAttributeImpl implements ConfigurationElementAttributeInstance {

	/**
	 * The cached value of the '{@link #getAttributeDefinition() <em>Attribute Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDefinition()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationElementAttribute attributeDefinition;




	/**
	 * The cached value of the '{@link #getContainedValue() <em>Contained Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractValue containedValue;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationElementAttributeInstanceImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ConfigurationElementAttribute getAttributeDefinition() {

		if (attributeDefinition != null && attributeDefinition.eIsProxy()) {
			InternalEObject oldAttributeDefinition = (InternalEObject)attributeDefinition;
			attributeDefinition = (ConfigurationElementAttribute)eResolveProxy(oldAttributeDefinition);
			if (attributeDefinition != oldAttributeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION, oldAttributeDefinition, attributeDefinition));
			}
		}
		return attributeDefinition;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ConfigurationElementAttribute basicGetAttributeDefinition() {

		return attributeDefinition;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAttributeDefinition(ConfigurationElementAttribute newAttributeDefinition) {

		ConfigurationElementAttribute oldAttributeDefinition = attributeDefinition;
		attributeDefinition = newAttributeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION, oldAttributeDefinition, attributeDefinition));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractValue getContainedValue() {

		return containedValue;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetContainedValue(AbstractValue newContainedValue, NotificationChain msgs) {

		AbstractValue oldContainedValue = containedValue;
		containedValue = newContainedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE, oldContainedValue, newContainedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setContainedValue(AbstractValue newContainedValue) {

		if (newContainedValue != containedValue) {
			NotificationChain msgs = null;
			if (containedValue != null)
				msgs = ((InternalEObject)containedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE, null, msgs);
			if (newContainedValue != null)
				msgs = ((InternalEObject)newContainedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE, null, msgs);
			msgs = basicSetContainedValue(newContainedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE, newContainedValue, newContainedValue));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE:
				return basicSetContainedValue(null, msgs);
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
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION:
				if (resolve) return getAttributeDefinition();
				return basicGetAttributeDefinition();
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE:
				return getContainedValue();
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
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION:
				setAttributeDefinition((ConfigurationElementAttribute)newValue);
				return;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE:
				setContainedValue((AbstractValue)newValue);
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
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION:
				setAttributeDefinition((ConfigurationElementAttribute)null);
				return;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE:
				setContainedValue((AbstractValue)null);
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
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__ATTRIBUTE_DEFINITION:
				return attributeDefinition != null;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE_INSTANCE__CONTAINED_VALUE:
				return containedValue != null;
		}
		return super.eIsSet(featureID);
	}



} //ConfigurationElementAttributeInstanceImpl
