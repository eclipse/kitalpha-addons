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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Compositor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ComplexCompositorImpl#getComplexCompositorKind <em>Complex Compositor Kind</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ComplexCompositorImpl#getComplexCompositorChildren <em>Complex Compositor Children</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.ComplexCompositorImpl#getElementReferences <em>Element References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexCompositorImpl extends CardinalityImpl implements ComplexCompositor {

	/**
	 * The default value of the '{@link #getComplexCompositorKind() <em>Complex Compositor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexCompositorKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComplexCompositorKind COMPLEX_COMPOSITOR_KIND_EDEFAULT = ComplexCompositorKind.SEQUENCE;

	/**
	 * The cached value of the '{@link #getComplexCompositorKind() <em>Complex Compositor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexCompositorKind()
	 * @generated
	 * @ordered
	 */
	protected ComplexCompositorKind complexCompositorKind = COMPLEX_COMPOSITOR_KIND_EDEFAULT;




	/**
	 * The cached value of the '{@link #getComplexCompositorChildren() <em>Complex Compositor Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexCompositorChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexCompositor> complexCompositorChildren;




	/**
	 * The cached value of the '{@link #getElementReferences() <em>Element References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaElementReference> elementReferences;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexCompositorImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.COMPLEX_COMPOSITOR;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ComplexCompositorKind getComplexCompositorKind() {

		return complexCompositorKind;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setComplexCompositorKind(ComplexCompositorKind newComplexCompositorKind) {

		ComplexCompositorKind oldComplexCompositorKind = complexCompositorKind;
		complexCompositorKind = newComplexCompositorKind == null ? COMPLEX_COMPOSITOR_KIND_EDEFAULT : newComplexCompositorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND, oldComplexCompositorKind, complexCompositorKind));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ComplexCompositor> getComplexCompositorChildren() {

		if (complexCompositorChildren == null) {
			complexCompositorChildren = new EObjectContainmentEList<ComplexCompositor>(ComplexCompositor.class, this, PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN);
		}
		return complexCompositorChildren;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<SchemaElementReference> getElementReferences() {

		if (elementReferences == null) {
			elementReferences = new EObjectContainmentEList<SchemaElementReference>(SchemaElementReference.class, this, PlatformPackage.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES);
		}
		return elementReferences;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN:
				return ((InternalEList<?>)getComplexCompositorChildren()).basicRemove(otherEnd, msgs);
			case PlatformPackage.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES:
				return ((InternalEList<?>)getElementReferences()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND:
				return getComplexCompositorKind();
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN:
				return getComplexCompositorChildren();
			case PlatformPackage.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES:
				return getElementReferences();
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
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND:
				setComplexCompositorKind((ComplexCompositorKind)newValue);
				return;
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN:
				getComplexCompositorChildren().clear();
				getComplexCompositorChildren().addAll((Collection<? extends ComplexCompositor>)newValue);
				return;
			case PlatformPackage.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES:
				getElementReferences().clear();
				getElementReferences().addAll((Collection<? extends SchemaElementReference>)newValue);
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
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND:
				setComplexCompositorKind(COMPLEX_COMPOSITOR_KIND_EDEFAULT);
				return;
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN:
				getComplexCompositorChildren().clear();
				return;
			case PlatformPackage.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES:
				getElementReferences().clear();
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
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND:
				return complexCompositorKind != COMPLEX_COMPOSITOR_KIND_EDEFAULT;
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN:
				return complexCompositorChildren != null && !complexCompositorChildren.isEmpty();
			case PlatformPackage.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES:
				return elementReferences != null && !elementReferences.isEmpty();
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
		result.append(" (complexCompositorKind: ");
		result.append(complexCompositorKind);
		result.append(')');
		return result.toString();
	}


} //ComplexCompositorImpl
