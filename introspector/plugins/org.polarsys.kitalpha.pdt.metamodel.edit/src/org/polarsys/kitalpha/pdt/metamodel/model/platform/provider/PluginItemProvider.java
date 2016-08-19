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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PluginItemProvider extends IdentifiedVersionnedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(PlatformPackage.Literals.PLUGIN__EXTENSION_POINTS);
			childrenFeatures.add(PlatformPackage.Literals.PLUGIN__EXTENSIONS);
			childrenFeatures.add(PlatformPackage.Literals.PLUGIN__PLUGIN_DEPENDENCIES);
			childrenFeatures.add(PlatformPackage.Literals.PLUGIN__EXPORTED_PACKAGES);
			childrenFeatures.add(PlatformPackage.Literals.PLUGIN__EXECUTION_ENVIRONMNENTS);
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
	 * This returns Plugin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plugin"));
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
		String label = ((Plugin)object).getId();
		String version  = ((Plugin)object).getVersion();
		if(version != null || label != null)
			return label + " v" + version + " [Plugin]";
		else
			return "[Plugin]";
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

		switch (notification.getFeatureID(Plugin.class)) {
			case PlatformPackage.PLUGIN__EXTENSION_POINTS:
			case PlatformPackage.PLUGIN__EXTENSIONS:
			case PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES:
			case PlatformPackage.PLUGIN__EXPORTED_PACKAGES:
			case PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS:
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
						(PlatformPackage.Literals.PLUGIN__EXTENSION_POINTS,
						 PlatformFactory.eINSTANCE.createPluginExtensionPoints()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.PLUGIN__EXTENSIONS,
						 PlatformFactory.eINSTANCE.createPluginExtensions()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.PLUGIN__PLUGIN_DEPENDENCIES,
						 PlatformFactory.eINSTANCE.createPluginDependencies()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.PLUGIN__EXPORTED_PACKAGES,
						 PlatformFactory.eINSTANCE.createExportedPackages()));



				newChildDescriptors.add
					(createChildParameter
						(PlatformPackage.Literals.PLUGIN__EXECUTION_ENVIRONMNENTS,
						 PlatformFactory.eINSTANCE.createExecutionEnvironments()));


	}


}
