/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Element Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfigurationElementAttributeImpl#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationElementAttributeImpl extends NamedElementImpl implements ConfigurationElementAttribute {

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConfigurationElementAttributeKind TYPE_EDEFAULT = ConfigurationElementAttributeKind.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationElementAttributeKind type = TYPE_EDEFAULT;




	/**
	 * The default value of the '{@link #getBasedOn() <em>Based On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected static final String BASED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected String basedOn = BASED_ON_EDEFAULT;




	/**
	 * The default value of the '{@link #isTranslatable() <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTranslatable() <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslatable()
	 * @generated
	 * @ordered
	 */
	protected boolean translatable = TRANSLATABLE_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationElementAttributeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.CONFIGURATION_ELEMENT_ATTRIBUTE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ConfigurationElementAttributeKind getType() {

		return type;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setType(ConfigurationElementAttributeKind newType) {

		ConfigurationElementAttributeKind oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE, oldType, type));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getBasedOn() {

		return basedOn;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBasedOn(String newBasedOn) {

		String oldBasedOn = basedOn;
		basedOn = newBasedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON, oldBasedOn, basedOn));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isTranslatable() {

		return translatable;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTranslatable(boolean newTranslatable) {

		boolean oldTranslatable = translatable;
		translatable = newTranslatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE, oldTranslatable, translatable));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE:
				return getType();
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON:
				return getBasedOn();
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE:
				return isTranslatable();
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
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE:
				setType((ConfigurationElementAttributeKind)newValue);
				return;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON:
				setBasedOn((String)newValue);
				return;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE:
				setTranslatable((Boolean)newValue);
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
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON:
				setBasedOn(BASED_ON_EDEFAULT);
				return;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE:
				setTranslatable(TRANSLATABLE_EDEFAULT);
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
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON:
				return BASED_ON_EDEFAULT == null ? basedOn != null : !BASED_ON_EDEFAULT.equals(basedOn);
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE:
				return translatable != TRANSLATABLE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", basedOn: ");
		result.append(basedOn);
		result.append(", translatable: ");
		result.append(translatable);
		result.append(')');
		return result.toString();
	}


} //ConfigurationElementAttributeImpl
