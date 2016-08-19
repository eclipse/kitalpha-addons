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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider extends IdentifiedVersionnedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemProvider(AdapterFactory adapterFactory) {
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

			addFeatureDescriptionPropertyDescriptor(object);
			addCopyrightNoticePropertyDescriptor(object);
			addLicenseAgreementPropertyDescriptor(object);
			addSitesToVisitPropertyDescriptor(object);
			addProviderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Feature Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureDescriptionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_featureDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_featureDescription_feature", "_UI_Feature_type"),
				 PlatformPackage.Literals.FEATURE__FEATURE_DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DescriptionPropertyCategory"),
				 null));

	}

	/**
	 * This adds a property descriptor for the Copyright Notice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightNoticePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_copyrightNotice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_copyrightNotice_feature", "_UI_Feature_type"),
				 PlatformPackage.Literals.FEATURE__COPYRIGHT_NOTICE,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_CopyrightPropertyCategory"),
				 null));

	}

	/**
	 * This adds a property descriptor for the License Agreement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicenseAgreementPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_licenseAgreement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_licenseAgreement_feature", "_UI_Feature_type"),
				 PlatformPackage.Literals.FEATURE__LICENSE_AGREEMENT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_CopyrightPropertyCategory"),
				 null));

	}

	/**
	 * This adds a property descriptor for the Sites To Visit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSitesToVisitPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_sitesToVisit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_sitesToVisit_feature", "_UI_Feature_type"),
				 PlatformPackage.Literals.FEATURE__SITES_TO_VISIT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InformationsPropertyCategory"),
				 null));

	}

	/**
	 * This adds a property descriptor for the Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_provider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_provider_feature", "_UI_Feature_type"),
				 PlatformPackage.Literals.FEATURE__PROVIDER,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_CopyrightPropertyCategory"),
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
			childrenFeatures.add(PlatformPackage.Literals.FEATURE__FEATURE_INCLUSIONS);
			childrenFeatures.add(PlatformPackage.Literals.FEATURE__PLUGIN_DEPENDENCIES);
			childrenFeatures.add(PlatformPackage.Literals.FEATURE__INCLUDED_PLUGINS);
			childrenFeatures.add(PlatformPackage.Literals.FEATURE__FEATURE_DEPENDENCIES);
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
	 * This returns Feature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Feature"));
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
		String label = ((Feature) object).getId();
		if(label != null)
			return label + " [Feature]";
		else return " [Feature]";
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

		switch (notification.getFeatureID(Feature.class)) {
			case PlatformPackage.FEATURE__FEATURE_DESCRIPTION:
			case PlatformPackage.FEATURE__COPYRIGHT_NOTICE:
			case PlatformPackage.FEATURE__LICENSE_AGREEMENT:
			case PlatformPackage.FEATURE__SITES_TO_VISIT:
			case PlatformPackage.FEATURE__PROVIDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PlatformPackage.FEATURE__FEATURE_INCLUSIONS:
			case PlatformPackage.FEATURE__PLUGIN_DEPENDENCIES:
			case PlatformPackage.FEATURE__INCLUDED_PLUGINS:
			case PlatformPackage.FEATURE__FEATURE_DEPENDENCIES:
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
						(PlatformPackage.Literals.FEATURE__FEATURE_INCLUSIONS,
						 PlatformFactory.eINSTANCE.createFeatureInclusions()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.FEATURE__PLUGIN_DEPENDENCIES,
						 PlatformFactory.eINSTANCE.createFeaturePluginDependencies()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.FEATURE__INCLUDED_PLUGINS,
						 PlatformFactory.eINSTANCE.createIncludedPlugins()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.FEATURE__FEATURE_DEPENDENCIES,
						 PlatformFactory.eINSTANCE.createFeatureDependencies()));


	}


}
