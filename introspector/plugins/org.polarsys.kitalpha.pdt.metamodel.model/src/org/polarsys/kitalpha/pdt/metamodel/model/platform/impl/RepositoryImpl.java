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
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Feature;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Repository;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.RepositoryKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.RepositoryImpl#getRepositoryKind <em>Repository Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends NamedElementImpl implements Repository {

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> packages;




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
	 * The default value of the '{@link #getRepositoryKind() <em>Repository Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryKind()
	 * @generated
	 * @ordered
	 */
	protected static final RepositoryKind REPOSITORY_KIND_EDEFAULT = RepositoryKind.PLATFORM;

	/**
	 * The cached value of the '{@link #getRepositoryKind() <em>Repository Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryKind()
	 * @generated
	 * @ordered
	 */
	protected RepositoryKind repositoryKind = REPOSITORY_KIND_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.REPOSITORY;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package> getPackages() {

		if (packages == null) {
			packages = new EObjectContainmentEList<org.polarsys.kitalpha.pdt.metamodel.model.platform.Package>(org.polarsys.kitalpha.pdt.metamodel.model.platform.Package.class, this, PlatformPackage.REPOSITORY__PACKAGES);
		}
		return packages;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Plugin> getPlugins() {

		if (plugins == null) {
			plugins = new EObjectContainmentEList<Plugin>(Plugin.class, this, PlatformPackage.REPOSITORY__PLUGINS);
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
			features = new EObjectContainmentEList<Feature>(Feature.class, this, PlatformPackage.REPOSITORY__FEATURES);
		}
		return features;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public RepositoryKind getRepositoryKind() {

		return repositoryKind;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setRepositoryKind(RepositoryKind newRepositoryKind) {

		RepositoryKind oldRepositoryKind = repositoryKind;
		repositoryKind = newRepositoryKind == null ? REPOSITORY_KIND_EDEFAULT : newRepositoryKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.REPOSITORY__REPOSITORY_KIND, oldRepositoryKind, repositoryKind));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.REPOSITORY__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case PlatformPackage.REPOSITORY__PLUGINS:
				return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
			case PlatformPackage.REPOSITORY__FEATURES:
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
			case PlatformPackage.REPOSITORY__PACKAGES:
				return getPackages();
			case PlatformPackage.REPOSITORY__PLUGINS:
				return getPlugins();
			case PlatformPackage.REPOSITORY__FEATURES:
				return getFeatures();
			case PlatformPackage.REPOSITORY__REPOSITORY_KIND:
				return getRepositoryKind();
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
			case PlatformPackage.REPOSITORY__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends org.polarsys.kitalpha.pdt.metamodel.model.platform.Package>)newValue);
				return;
			case PlatformPackage.REPOSITORY__PLUGINS:
				getPlugins().clear();
				getPlugins().addAll((Collection<? extends Plugin>)newValue);
				return;
			case PlatformPackage.REPOSITORY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case PlatformPackage.REPOSITORY__REPOSITORY_KIND:
				setRepositoryKind((RepositoryKind)newValue);
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
			case PlatformPackage.REPOSITORY__PACKAGES:
				getPackages().clear();
				return;
			case PlatformPackage.REPOSITORY__PLUGINS:
				getPlugins().clear();
				return;
			case PlatformPackage.REPOSITORY__FEATURES:
				getFeatures().clear();
				return;
			case PlatformPackage.REPOSITORY__REPOSITORY_KIND:
				setRepositoryKind(REPOSITORY_KIND_EDEFAULT);
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
			case PlatformPackage.REPOSITORY__PACKAGES:
				return packages != null && !packages.isEmpty();
			case PlatformPackage.REPOSITORY__PLUGINS:
				return plugins != null && !plugins.isEmpty();
			case PlatformPackage.REPOSITORY__FEATURES:
				return features != null && !features.isEmpty();
			case PlatformPackage.REPOSITORY__REPOSITORY_KIND:
				return repositoryKind != REPOSITORY_KIND_EDEFAULT;
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
		result.append(" (repositoryKind: ");
		result.append(repositoryKind);
		result.append(')');
		return result.toString();
	}


} //RepositoryImpl
