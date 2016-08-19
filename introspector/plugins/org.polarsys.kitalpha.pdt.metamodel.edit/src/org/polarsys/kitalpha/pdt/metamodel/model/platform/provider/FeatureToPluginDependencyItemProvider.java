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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.FeatureToPluginDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureToPluginDependencyItemProvider extends VersionnedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureToPluginDependencyItemProvider(AdapterFactory adapterFactory) {
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

			addMatchRulePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Match Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMatchRulePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureToPluginDependency_matchRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureToPluginDependency_matchRule_feature", "_UI_FeatureToPluginDependency_type"),
				 PlatformPackage.Literals.FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureToPluginDependency_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureToPluginDependency_target_feature", "_UI_FeatureToPluginDependency_type"),
				 PlatformPackage.Literals.FEATURE_TO_PLUGIN_DEPENDENCY__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This returns FeatureToPluginDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureToPluginDependency"));
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
		 * CUSTOM_CODE_BEGIN
		 **/
		String id = " ";
		String versionToMatch = "";
		String label = "";
		MatchRule matchRule = MatchRule.UNSET;

		FeatureToPluginDependency dependency = (FeatureToPluginDependency) object;

		if (dependency.getTarget() != null) {
			id = dependency.getTarget().getId();
			label += id;
		}
		if (dependency.getTarget() != null) {
			versionToMatch = dependency.getVersion();
			if (versionToMatch != null){
				label += " -> v" + versionToMatch;
				matchRule = dependency.getMatchRule();
				if(matchRule != MatchRule.UNSET){
					label += " : " + matchRule;  
				}
			}
		}
		return label + " [Plugin Dependency]";
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

		switch (notification.getFeatureID(FeatureToPluginDependency.class)) {
			case PlatformPackage.FEATURE_TO_PLUGIN_DEPENDENCY__MATCH_RULE:
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

		
@Override
public Object overlayImage(Object object, Object image){
		/**
		 * CUSTOM_CODE_BEGIN : []
		 **/
		return super.overlayImage(object, getResourceLocator().getImage("full/obj16/PluginDependency"));
		/**
		 * CUSTOM_CODE_END : []
		 **/
}
}
