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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttributeKind;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.ConfigurationElementAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationElementAttributeItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationElementAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addBasedOnPropertyDescriptor(object);
			addTranslatablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfigurationElementAttribute_type_feature"),
				 getString("_UI_ConfigurationElementAttribute_type_description"),
				 PlatformPackage.Literals.CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Based On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasedOnPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfigurationElementAttribute_basedOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfigurationElementAttribute_basedOn_feature", "_UI_ConfigurationElementAttribute_type"),
				 PlatformPackage.Literals.CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Translatable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranslatablePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConfigurationElementAttribute_translatable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConfigurationElementAttribute_translatable_feature", "_UI_ConfigurationElementAttribute_type"),
				 PlatformPackage.Literals.CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This returns ConfigurationElementAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfigurationElementAttribute"));
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
		 * CUSTOM_CODE_BEGIN : [ConfigurationElementAtributeItem]
		 **/
		String label = "";
		ConfigurationElementAttribute CEA = (ConfigurationElementAttribute) object;
		label = "" + CEA.getName() + " : " + CEA.getType();
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

		switch (notification.getFeatureID(ConfigurationElementAttribute.class)) {
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TYPE:
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__BASED_ON:
			case PlatformPackage.CONFIGURATION_ELEMENT_ATTRIBUTE__TRANSLATABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

//INJECTED-CODE-BEGIN : ConfigurationElementAttributeInstance#overlayImage()
/**
* This adds an overlay to the given image if the object is controlled.
*/
@Override
protected Object overlayImage(Object object, Object image) {	
		/**
		 * CUSTOM_CODE_BEGIN : [Image provider of ConfigurationElementAttribute]
		 **/
		ConfigurationElementAttribute CEA = (ConfigurationElementAttribute) object;
		if (CEA.getType() == ConfigurationElementAttributeKind.RESOURCE) {
			return super.overlayImage(
					object,
					getResourceLocator()
							.getImage(
									"full/obj16/ConfigurationElementAttribute_resource"));
		} else if (CEA.getType() == ConfigurationElementAttributeKind.BOOLEAN) {
			return super.overlayImage(
					object,
					getResourceLocator().getImage(
							"full/obj16/ConfigurationElementAttribute_boolean"));
		} else if (CEA.getType() == ConfigurationElementAttributeKind.JAVA) {
			return super.overlayImage(
					object,
					getResourceLocator().getImage(
							"full/obj16/ConfigurationElementAttribute_java"));
		} else
			return super.overlayImage(
					object,
					getResourceLocator().getImage(
							"full/obj16/ConfigurationElementAttribute_string"));
		/**
		 * CUSTOM_CODE_END : []
		 **/
		 }

}
