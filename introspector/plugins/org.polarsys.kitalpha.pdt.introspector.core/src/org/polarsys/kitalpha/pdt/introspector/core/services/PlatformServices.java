/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.introspector.core.services;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.pde.core.target.ITargetHandle;
import org.eclipse.pde.core.target.ITargetPlatformService;
import org.eclipse.pde.internal.core.target.TargetPlatformService;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.introspector.core.internal.rules.Activator;
import org.polarsys.kitalpha.pdt.introspector.core.messages.Messages;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;

/**
 * Services for save, in the selected folder, the result of the introspection
 * 
 * 
 * @author Xavier DECOOL
 *
 */
@SuppressWarnings("restriction")
public class PlatformServices {

	/**
	 * Save PlatformModel
	 * 
	 * @param eclipseModel
	 * @param modelPath
	 * @param resSet
	 */
	public static void savePlatformModel(EclipseModel eclipseModel,
			String modelPath, ResourceSet resSet, IntrospectionContext introContext) {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		URI uri;

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		// Get the name of the current product
		String filename = "";
		
		String productName = null;
		ITargetPlatformService defaultPlatform = TargetPlatformService.getDefault();
		try {
			ITargetHandle workspaceTargetHandle = defaultPlatform.getWorkspaceTargetHandle();
			productName= workspaceTargetHandle.getTargetDefinition().getName();
		} catch (CoreException e1) {
			IStatus errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.ErrorGenerationTargetHandler, e1);
			StatusManager.getManager().handle(errorStatus);
		}
		
		//FIXME If the productName is null?
		if(productName != null)
			productName = productName.replaceAll(" ", "_");
		
		if(introContext.isVisitPlatform() && !introContext.isVisitWorkspace())
			filename = (productName + "_" + sdf.format(date));
		else if(introContext.isVisitWorkspace() && !introContext.isVisitPlatform())
			filename = ("Workspace_"+sdf.format(date));
		else
			filename = (productName + "_and_Worskpace_"+sdf.format(date));

		String modelFullPath = modelPath + "\\" + filename + ".platform";
		uri = URI.createFileURI(modelFullPath);
		// Create a resource
		Resource resource = resSet.createResource(uri);
		// Get the first model element and cast it to the right type
		resource.getContents().add(eclipseModel);

		// Now save the content.
		try {
			resource.save(options);
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(2, null);
		} catch (IOException e) {
			IStatus errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.bind(Messages.ErrorSavingResource, uri.toString()), e);
			StatusManager.getManager().handle(errorStatus);
		} catch (CoreException e) {
			IStatus errorStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.ErrorRefreshWorkspace, e);
			StatusManager.getManager().handle(errorStatus);
		}
	}
}
