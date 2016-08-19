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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Extension;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionPointImpl#getSchemaElements <em>Schema Elements</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionPointImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ExtensionPointImpl#getExtensionSchemaElement <em>Extension Schema Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionPointImpl extends IdentifiedElementImpl implements ExtensionPoint {

	/**
	 * The cached value of the '{@link #getSchemaElements() <em>Schema Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaElement> schemaElements;




	/**
	 * The cached value of the '{@link #getContributors() <em>Contributors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> contributors;




	/**
	 * The cached value of the '{@link #getExtensionSchemaElement() <em>Extension Schema Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionSchemaElement()
	 * @generated
	 * @ordered
	 */
	protected SchemaElement extensionSchemaElement;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionPointImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.EXTENSION_POINT;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<SchemaElement> getSchemaElements() {

		if (schemaElements == null) {
			schemaElements = new EObjectContainmentEList<SchemaElement>(SchemaElement.class, this, PlatformPackage.EXTENSION_POINT__SCHEMA_ELEMENTS);
		}
		return schemaElements;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Extension> getContributors() {

		if (contributors == null) {
			contributors = new EObjectWithInverseResolvingEList<Extension>(Extension.class, this, PlatformPackage.EXTENSION_POINT__CONTRIBUTORS, PlatformPackage.EXTENSION__EXTENSION_POINT);
		}
		return contributors;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SchemaElement getExtensionSchemaElement() {

		if (extensionSchemaElement != null && extensionSchemaElement.eIsProxy()) {
			InternalEObject oldExtensionSchemaElement = (InternalEObject)extensionSchemaElement;
			extensionSchemaElement = (SchemaElement)eResolveProxy(oldExtensionSchemaElement);
			if (extensionSchemaElement != oldExtensionSchemaElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT, oldExtensionSchemaElement, extensionSchemaElement));
			}
		}
		return extensionSchemaElement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public SchemaElement basicGetExtensionSchemaElement() {

		return extensionSchemaElement;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtensionSchemaElement(SchemaElement newExtensionSchemaElement) {

		SchemaElement oldExtensionSchemaElement = extensionSchemaElement;
		extensionSchemaElement = newExtensionSchemaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT, oldExtensionSchemaElement, extensionSchemaElement));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.EXTENSION_POINT__CONTRIBUTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributors()).basicAdd(otherEnd, msgs);
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
			case PlatformPackage.EXTENSION_POINT__SCHEMA_ELEMENTS:
				return ((InternalEList<?>)getSchemaElements()).basicRemove(otherEnd, msgs);
			case PlatformPackage.EXTENSION_POINT__CONTRIBUTORS:
				return ((InternalEList<?>)getContributors()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.EXTENSION_POINT__SCHEMA_ELEMENTS:
				return getSchemaElements();
			case PlatformPackage.EXTENSION_POINT__CONTRIBUTORS:
				return getContributors();
			case PlatformPackage.EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT:
				if (resolve) return getExtensionSchemaElement();
				return basicGetExtensionSchemaElement();
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
			case PlatformPackage.EXTENSION_POINT__SCHEMA_ELEMENTS:
				getSchemaElements().clear();
				getSchemaElements().addAll((Collection<? extends SchemaElement>)newValue);
				return;
			case PlatformPackage.EXTENSION_POINT__CONTRIBUTORS:
				getContributors().clear();
				getContributors().addAll((Collection<? extends Extension>)newValue);
				return;
			case PlatformPackage.EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT:
				setExtensionSchemaElement((SchemaElement)newValue);
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
			case PlatformPackage.EXTENSION_POINT__SCHEMA_ELEMENTS:
				getSchemaElements().clear();
				return;
			case PlatformPackage.EXTENSION_POINT__CONTRIBUTORS:
				getContributors().clear();
				return;
			case PlatformPackage.EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT:
				setExtensionSchemaElement((SchemaElement)null);
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
			case PlatformPackage.EXTENSION_POINT__SCHEMA_ELEMENTS:
				return schemaElements != null && !schemaElements.isEmpty();
			case PlatformPackage.EXTENSION_POINT__CONTRIBUTORS:
				return contributors != null && !contributors.isEmpty();
			case PlatformPackage.EXTENSION_POINT__EXTENSION_SCHEMA_ELEMENT:
				return extensionSchemaElement != null;
		}
		return super.eIsSet(featureID);
	}



} //ExtensionPointImpl
