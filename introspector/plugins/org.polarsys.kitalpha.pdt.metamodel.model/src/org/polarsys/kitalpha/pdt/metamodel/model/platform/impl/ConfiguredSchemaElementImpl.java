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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeInstance;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfiguredSchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configured Schema Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfiguredSchemaElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfiguredSchemaElementImpl#getSchemaElement <em>Schema Element</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ConfiguredSchemaElementImpl#getConfigurationElements <em>Configuration Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfiguredSchemaElementImpl extends NamedElementImpl implements ConfiguredSchemaElement {

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguredSchemaElement> children;




	/**
	 * The cached value of the '{@link #getSchemaElement() <em>Schema Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaElement()
	 * @generated
	 * @ordered
	 */
	protected SchemaElement schemaElement;




	/**
	 * The cached value of the '{@link #getConfigurationElements() <em>Configuration Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationElementAttributeInstance> configurationElements;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguredSchemaElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.CONFIGURED_SCHEMA_ELEMENT;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ConfiguredSchemaElement> getChildren() {

		if (children == null) {
			children = new EObjectContainmentEList<ConfiguredSchemaElement>(ConfiguredSchemaElement.class, this, PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CHILDREN);
		}
		return children;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SchemaElement getSchemaElement() {

		if (schemaElement != null && schemaElement.eIsProxy()) {
			InternalEObject oldSchemaElement = (InternalEObject)schemaElement;
			schemaElement = (SchemaElement)eResolveProxy(oldSchemaElement);
			if (schemaElement != oldSchemaElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT, oldSchemaElement, schemaElement));
			}
		}
		return schemaElement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SchemaElement basicGetSchemaElement() {

		return schemaElement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSchemaElement(SchemaElement newSchemaElement) {

		SchemaElement oldSchemaElement = schemaElement;
		schemaElement = newSchemaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT, oldSchemaElement, schemaElement));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ConfigurationElementAttributeInstance> getConfigurationElements() {

		if (configurationElements == null) {
			configurationElements = new EObjectContainmentEList<ConfigurationElementAttributeInstance>(ConfigurationElementAttributeInstance.class, this, PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS);
		}
		return configurationElements;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS:
				return ((InternalEList<?>)getConfigurationElements()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CHILDREN:
				return getChildren();
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT:
				if (resolve) return getSchemaElement();
				return basicGetSchemaElement();
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS:
				return getConfigurationElements();
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
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ConfiguredSchemaElement>)newValue);
				return;
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT:
				setSchemaElement((SchemaElement)newValue);
				return;
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS:
				getConfigurationElements().clear();
				getConfigurationElements().addAll((Collection<? extends ConfigurationElementAttributeInstance>)newValue);
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
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CHILDREN:
				getChildren().clear();
				return;
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT:
				setSchemaElement((SchemaElement)null);
				return;
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS:
				getConfigurationElements().clear();
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
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__SCHEMA_ELEMENT:
				return schemaElement != null;
			case PlatformPackage.CONFIGURED_SCHEMA_ELEMENT__CONFIGURATION_ELEMENTS:
				return configurationElements != null && !configurationElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //ConfiguredSchemaElementImpl
