/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PackageImpl#getAbsoluteName <em>Absolute Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements org.polarsys.kitalpha.pdt.metamodel.model.platform.Package {

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> subPackages;




	/**
	 * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugin> plugins;




	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;




	/**
	 * The default value of the '{@link #getAbsoluteName() <em>Absolute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteName()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSOLUTE_NAME_EDEFAULT = null;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PACKAGE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> getSubPackages() {

		if (subPackages == null) {
			subPackages = new EObjectContainmentEList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package>(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package.class, this, PlatformPackage.PACKAGE__SUB_PACKAGES);
		}
		return subPackages;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Plugin> getPlugins() {

		if (plugins == null) {
			plugins = new EObjectContainmentEList<Plugin>(Plugin.class, this, PlatformPackage.PACKAGE__PLUGINS);
		}
		return plugins;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Feature> getFeatures() {

		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, PlatformPackage.PACKAGE__FEATURES);
		}
		return features;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getAbsoluteName() {

		/**
		 * CUSTOM_CODE_BEGIN : []
		 **/
		if (this.eContainer() instanceof org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository)
			return this.getName();
		else
			return (( org.polarsys.kitalpha.pdt.metamodel.model.platform.Package)this.eContainer()).getAbsoluteName()+"."+getName();
		/**
		 * CUSTOM_CODE_END : []
		 **/
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
			case PlatformPackage.PACKAGE__PLUGINS:
				return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
			case PlatformPackage.PACKAGE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case PlatformPackage.PACKAGE__PLUGINS:
				return getPlugins();
			case PlatformPackage.PACKAGE__FEATURES:
				return getFeatures();
			case PlatformPackage.PACKAGE__ABSOLUTE_NAME:
				return getAbsoluteName();
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
			case PlatformPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends org.polarsys.kitalpha.pdt.metamodel.model.platform.Package>)newValue);
				return;
			case PlatformPackage.PACKAGE__PLUGINS:
				getPlugins().clear();
				getPlugins().addAll((Collection<? extends Plugin>)newValue);
				return;
			case PlatformPackage.PACKAGE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case PlatformPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case PlatformPackage.PACKAGE__PLUGINS:
				getPlugins().clear();
				return;
			case PlatformPackage.PACKAGE__FEATURES:
				getFeatures().clear();
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
			case PlatformPackage.PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
			case PlatformPackage.PACKAGE__PLUGINS:
				return plugins != null && !plugins.isEmpty();
			case PlatformPackage.PACKAGE__FEATURES:
				return features != null && !features.isEmpty();
			case PlatformPackage.PACKAGE__ABSOLUTE_NAME:
				return ABSOLUTE_NAME_EDEFAULT == null ? getAbsoluteName() != null : !ABSOLUTE_NAME_EDEFAULT.equals(getAbsoluteName());
		}
		return super.eIsSet(featureID);
	}



} //PackageImpl
