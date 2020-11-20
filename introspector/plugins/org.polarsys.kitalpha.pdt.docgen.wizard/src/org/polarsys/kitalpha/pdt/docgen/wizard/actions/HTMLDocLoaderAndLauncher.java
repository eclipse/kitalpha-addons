/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.docgen.wizard.actions;

import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf.ContractHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf.InvokeActivityHelper;
import org.polarsys.kitalpha.pdt.docgen.wizard.general.HTMLDocGenContext;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class HTMLDocLoaderAndLauncher {

	private final String egfActivityStringURI = "platform:/plugin/org.polarsys.kitalpha.pdt.docgen/model/PlatformHtmlDocGen.fcore#_K3jz4WZjEeSd0vTgWOim0Q";

	// constructeur
	public HTMLDocLoaderAndLauncher() {
	}

	public void launchActivity() {

		HTMLDocGenContext context = HTMLDocGenContext.INSTANCE;
		URI platformModelURI = context.getPlatformModelURI();

//		if (context.generateAllDiagramsIsChecked()) {
//			ResourceSet currentResourceSet = new ResourceSetImpl();
//			currentResourceSet.getResource(platformModelURI, true);
//			EcoreUtil.resolveAll(currentResourceSet);
//			EList<Resource> allResources = currentResourceSet.getResources();
//			for (Resource currentResource : allResources) {
//				URI uri = currentResource.getURI();
//				generateHTML(context, uri);
//			}
//		} else
			generateHTML(context, platformModelURI);

		HTMLDocGenContext.INSTANCE.reset();
	}

	public void generateHTML(HTMLDocGenContext context, URI platformModelURI) {
		URI egfActivityUri = URI.createURI(egfActivityStringURI);
		Activity egfActivity = InvokeActivityHelper.getActivity(egfActivityUri);
		FactoryComponent fc = (FactoryComponent) egfActivity;
		ContractHelper.setStringContract(fc, "projectName",
				context.getProjectName());
		ContractHelper.setStringContract(fc, "outputFolder",
				context.getOutputFolderName() + "/output");
		ContractHelper.setStringContract(fc, "CSS_destinationFolder",
				context.getCSSOutputFolder());
		ContractHelper.setStringContract(fc, "sourceFolder",
				context.getCSSSourceFolder());
		ContractHelper.setBooleanContract(fc, "diagramsInclusion",
				context.diagramsInclusionIsChecked());
		ContractHelper.setDomain(fc, "platformDomain", platformModelURI);
		// Lunch the factory component 
		//Logger.getLogger().info("J'ai lanc� une activit� "+egfActivity.getID()+" named : "+egfActivity.getName());
		
		//Diagnostic diagnostic = Diagnostician.INSTANCE.validate(egfActivity);
		//Logger.getLogger().info(diagnostic.toString());
		InvokeActivityHelper.validateAndInvoke(fc, "generating HTML");
	}
}
