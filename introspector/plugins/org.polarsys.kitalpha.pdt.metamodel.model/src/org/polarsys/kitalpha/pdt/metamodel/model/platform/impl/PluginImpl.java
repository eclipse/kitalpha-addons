/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.pdt.metamodel.model.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExecutionEnvironments;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExportedPackages;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformPackage;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.Plugin;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginDependencies;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensionPoints;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PluginExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl#getPluginDependencies <em>Plugin Dependencies</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.pdt.metamodel.model.platform.impl.PluginImpl#getExecutionEnvironmnents <em>Execution Environmnents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginImpl extends IdentifiedVersionnedElementImpl implements Plugin {

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected PluginExtensionPoints extensionPoints;




	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected PluginExtensions extensions;




	/**
	 * The cached value of the '{@link #getPluginDependencies() <em>Plugin Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginDependencies()
	 * @generated
	 * @ordered
	 */
	protected PluginDependencies pluginDependencies;




	/**
	 * The cached value of the '{@link #getExportedPackages() <em>Exported Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedPackages()
	 * @generated
	 * @ordered
	 */
	protected ExportedPackages exportedPackages;




	/**
	 * The cached value of the '{@link #getExecutionEnvironmnents() <em>Execution Environmnents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironmnents()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironments executionEnvironmnents;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLUGIN;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public PluginExtensionPoints getExtensionPoints() {

		return extensionPoints;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExtensionPoints(PluginExtensionPoints newExtensionPoints, NotificationChain msgs) {

		PluginExtensionPoints oldExtensionPoints = extensionPoints;
		extensionPoints = newExtensionPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXTENSION_POINTS, oldExtensionPoints, newExtensionPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtensionPoints(PluginExtensionPoints newExtensionPoints) {

		if (newExtensionPoints != extensionPoints) {
			NotificationChain msgs = null;
			if (extensionPoints != null)
				msgs = ((InternalEObject)extensionPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXTENSION_POINTS, null, msgs);
			if (newExtensionPoints != null)
				msgs = ((InternalEObject)newExtensionPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXTENSION_POINTS, null, msgs);
			msgs = basicSetExtensionPoints(newExtensionPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXTENSION_POINTS, newExtensionPoints, newExtensionPoints));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public PluginExtensions getExtensions() {

		return extensions;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExtensions(PluginExtensions newExtensions, NotificationChain msgs) {

		PluginExtensions oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExtensions(PluginExtensions newExtensions) {

		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXTENSIONS, newExtensions, newExtensions));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public PluginDependencies getPluginDependencies() {

		return pluginDependencies;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetPluginDependencies(PluginDependencies newPluginDependencies, NotificationChain msgs) {

		PluginDependencies oldPluginDependencies = pluginDependencies;
		pluginDependencies = newPluginDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES, oldPluginDependencies, newPluginDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPluginDependencies(PluginDependencies newPluginDependencies) {

		if (newPluginDependencies != pluginDependencies) {
			NotificationChain msgs = null;
			if (pluginDependencies != null)
				msgs = ((InternalEObject)pluginDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES, null, msgs);
			if (newPluginDependencies != null)
				msgs = ((InternalEObject)newPluginDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES, null, msgs);
			msgs = basicSetPluginDependencies(newPluginDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES, newPluginDependencies, newPluginDependencies));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ExportedPackages getExportedPackages() {

		return exportedPackages;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExportedPackages(ExportedPackages newExportedPackages, NotificationChain msgs) {

		ExportedPackages oldExportedPackages = exportedPackages;
		exportedPackages = newExportedPackages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXPORTED_PACKAGES, oldExportedPackages, newExportedPackages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExportedPackages(ExportedPackages newExportedPackages) {

		if (newExportedPackages != exportedPackages) {
			NotificationChain msgs = null;
			if (exportedPackages != null)
				msgs = ((InternalEObject)exportedPackages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXPORTED_PACKAGES, null, msgs);
			if (newExportedPackages != null)
				msgs = ((InternalEObject)newExportedPackages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXPORTED_PACKAGES, null, msgs);
			msgs = basicSetExportedPackages(newExportedPackages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXPORTED_PACKAGES, newExportedPackages, newExportedPackages));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ExecutionEnvironments getExecutionEnvironmnents() {

		return executionEnvironmnents;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetExecutionEnvironmnents(ExecutionEnvironments newExecutionEnvironmnents, NotificationChain msgs) {

		ExecutionEnvironments oldExecutionEnvironmnents = executionEnvironmnents;
		executionEnvironmnents = newExecutionEnvironmnents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS, oldExecutionEnvironmnents, newExecutionEnvironmnents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setExecutionEnvironmnents(ExecutionEnvironments newExecutionEnvironmnents) {

		if (newExecutionEnvironmnents != executionEnvironmnents) {
			NotificationChain msgs = null;
			if (executionEnvironmnents != null)
				msgs = ((InternalEObject)executionEnvironmnents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS, null, msgs);
			if (newExecutionEnvironmnents != null)
				msgs = ((InternalEObject)newExecutionEnvironmnents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS, null, msgs);
			msgs = basicSetExecutionEnvironmnents(newExecutionEnvironmnents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS, newExecutionEnvironmnents, newExecutionEnvironmnents));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PLUGIN__EXTENSION_POINTS:
				return basicSetExtensionPoints(null, msgs);
			case PlatformPackage.PLUGIN__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES:
				return basicSetPluginDependencies(null, msgs);
			case PlatformPackage.PLUGIN__EXPORTED_PACKAGES:
				return basicSetExportedPackages(null, msgs);
			case PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS:
				return basicSetExecutionEnvironmnents(null, msgs);
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
			case PlatformPackage.PLUGIN__EXTENSION_POINTS:
				return getExtensionPoints();
			case PlatformPackage.PLUGIN__EXTENSIONS:
				return getExtensions();
			case PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES:
				return getPluginDependencies();
			case PlatformPackage.PLUGIN__EXPORTED_PACKAGES:
				return getExportedPackages();
			case PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS:
				return getExecutionEnvironmnents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.PLUGIN__EXTENSION_POINTS:
				setExtensionPoints((PluginExtensionPoints)newValue);
				return;
			case PlatformPackage.PLUGIN__EXTENSIONS:
				setExtensions((PluginExtensions)newValue);
				return;
			case PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES:
				setPluginDependencies((PluginDependencies)newValue);
				return;
			case PlatformPackage.PLUGIN__EXPORTED_PACKAGES:
				setExportedPackages((ExportedPackages)newValue);
				return;
			case PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS:
				setExecutionEnvironmnents((ExecutionEnvironments)newValue);
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
			case PlatformPackage.PLUGIN__EXTENSION_POINTS:
				setExtensionPoints((PluginExtensionPoints)null);
				return;
			case PlatformPackage.PLUGIN__EXTENSIONS:
				setExtensions((PluginExtensions)null);
				return;
			case PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES:
				setPluginDependencies((PluginDependencies)null);
				return;
			case PlatformPackage.PLUGIN__EXPORTED_PACKAGES:
				setExportedPackages((ExportedPackages)null);
				return;
			case PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS:
				setExecutionEnvironmnents((ExecutionEnvironments)null);
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
			case PlatformPackage.PLUGIN__EXTENSION_POINTS:
				return extensionPoints != null;
			case PlatformPackage.PLUGIN__EXTENSIONS:
				return extensions != null;
			case PlatformPackage.PLUGIN__PLUGIN_DEPENDENCIES:
				return pluginDependencies != null;
			case PlatformPackage.PLUGIN__EXPORTED_PACKAGES:
				return exportedPackages != null;
			case PlatformPackage.PLUGIN__EXECUTION_ENVIRONMNENTS:
				return executionEnvironmnents != null;
		}
		return super.eIsSet(featureID);
	}



} //PluginImpl
