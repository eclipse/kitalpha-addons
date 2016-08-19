/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositorKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexCompositorItemProvider extends CardinalityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexCompositorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addComplexCompositorKindPropertyDescriptor(object);
			addComplexCompositorChildrenPropertyDescriptor(object);
			addElementReferencesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Complex Compositor Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexCompositorKindPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexCompositor_complexCompositorKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexCompositor_complexCompositorKind_feature", "_UI_ComplexCompositor_type"),
				 PlatformPackage.Literals.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Complex Compositor Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexCompositorChildrenPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexCompositor_complexCompositorChildren_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexCompositor_complexCompositorChildren_feature", "_UI_ComplexCompositor_type"),
				 PlatformPackage.Literals.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Element References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementReferencesPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexCompositor_elementReferences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexCompositor_elementReferences_feature", "_UI_ComplexCompositor_type"),
				 PlatformPackage.Literals.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PlatformPackage.Literals.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN);
			childrenFeatures.add(PlatformPackage.Literals.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComplexCompositor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexCompositor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		/**
		 * CUSTOM_CODE_BEGIN : []
		 **/
		ComplexCompositor complexCompositor = (ComplexCompositor) object;
		String label = "";
		int complexCompCard = complexCompositor.getMaxCard();

		if (complexCompositor.getComplexCompositorKind().equals(
				ComplexCompositorKind.SEQUENCE)) {
			if (complexCompositor.isUnbounded())
				label = "Sequence [" + complexCompositor.getMinCard() + ";*]";
			else
				label = "Sequence [" + complexCompositor.getMinCard() + ";"
						+ complexCompCard + "]";

		} else {
			if (complexCompositor.isUnbounded())
				label = "Choice [" + complexCompositor.getMinCard() + ";*]";
			else
				label = "Choice [" + complexCompositor.getMinCard() + ";"
						+ complexCompCard + "]";
		}
		return label;
		/**
		 * CUSTOM_CODE_END : []
		 **/

	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComplexCompositor.class)) {
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PlatformPackage.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN:
			case PlatformPackage.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.COMPLEX_COMPOSITOR__COMPLEX_COMPOSITOR_CHILDREN,
						 PlatformFactory.eINSTANCE.createComplexCompositor()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.COMPLEX_COMPOSITOR__ELEMENT_REFERENCES,
						 PlatformFactory.eINSTANCE.createSchemaElementReference()));


	}

@Override
	public Object overlayImage(Object object, Object image) {
		ComplexCompositor currentCompositor = (ComplexCompositor) object;
		if (currentCompositor.getComplexCompositorKind().equals(
				ComplexCompositorKind.SEQUENCE))
			return super.overlayImage(
					object,
					getResourceLocator().getImage(
							"full/obj16/ComplexSchemaElement_sequence"));
		else
			return super.overlayImage(
					object,
					getResourceLocator().getImage(
							"full/obj16/ComplexSchemaElement_choice"));
	}

}
