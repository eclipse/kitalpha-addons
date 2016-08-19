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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.SchemaElementImpl#getComplexCompositor <em>Complex Compositor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaElementImpl extends NamedElementImpl implements SchemaElement {

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationElementAttribute> attributes;




	/**
	 * The cached value of the '{@link #getComplexCompositor() <em>Complex Compositor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexCompositor()
	 * @generated
	 * @ordered
	 */
	protected ComplexCompositor complexCompositor;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaElementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.SCHEMA_ELEMENT;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ConfigurationElementAttribute> getAttributes() {

		if (attributes == null) {
			attributes = new EObjectContainmentEList<ConfigurationElementAttribute>(ConfigurationElementAttribute.class, this, PlatformPackage.SCHEMA_ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ComplexCompositor getComplexCompositor() {

		return complexCompositor;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetComplexCompositor(ComplexCompositor newComplexCompositor, NotificationChain msgs) {

		ComplexCompositor oldComplexCompositor = complexCompositor;
		complexCompositor = newComplexCompositor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR, oldComplexCompositor, newComplexCompositor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setComplexCompositor(ComplexCompositor newComplexCompositor) {

		if (newComplexCompositor != complexCompositor) {
			NotificationChain msgs = null;
			if (complexCompositor != null)
				msgs = ((InternalEObject)complexCompositor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR, null, msgs);
			if (newComplexCompositor != null)
				msgs = ((InternalEObject)newComplexCompositor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR, null, msgs);
			msgs = basicSetComplexCompositor(newComplexCompositor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR, newComplexCompositor, newComplexCompositor));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.SCHEMA_ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR:
				return basicSetComplexCompositor(null, msgs);
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
			case PlatformPackage.SCHEMA_ELEMENT__ATTRIBUTES:
				return getAttributes();
			case PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR:
				return getComplexCompositor();
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
			case PlatformPackage.SCHEMA_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ConfigurationElementAttribute>)newValue);
				return;
			case PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR:
				setComplexCompositor((ComplexCompositor)newValue);
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
			case PlatformPackage.SCHEMA_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR:
				setComplexCompositor((ComplexCompositor)null);
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
			case PlatformPackage.SCHEMA_ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case PlatformPackage.SCHEMA_ELEMENT__COMPLEX_COMPOSITOR:
				return complexCompositor != null;
		}
		return super.eIsSet(featureID);
	}



} //SchemaElementImpl
