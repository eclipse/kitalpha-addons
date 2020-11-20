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
package org.polarsys.kitalpha.pdt.docgen.tasks;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.Domain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.MonitorServices;
import org.polarsys.kitalpha.pdt.docgen.helpers.Helpers;
import org.polarsys.kitalpha.pdt.docgen.services.GenerateDiagramsService;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class GenerationEnvironmentPreparation implements ITaskProduction {

	private String projectName;
	private String outputFolder;
	private boolean diagramsInclusion;
	private Resource currentModelResource;
	private IPath path;
	private Domain platformDomain;

	private URI airdUri;

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		//Logger.getLogger().info("GenerationEnvironmentPreparation preExecute (1)");
		projectName = productionContext.getInputValue("projectName",
				String.class);
		outputFolder = productionContext.getInputValue("outputFolder",
				String.class);
		diagramsInclusion = productionContext.getInputValue(
				"diagramsInclusion", Boolean.class);
		
		Helpers.setDiagramsInclusion(diagramsInclusion);
		platformDomain = productionContext.getInputValue("platformDomain",
				Domain.class);

		// EMFDomain domain = DomainFactory.eINSTANCE.createEMFDomain();
		// URI uri= URI.createPlatformResourceURI(modelPath,true);
		// domain.setUri(uri);

		EList<Object> content = platformDomain.getContent();
		for (Object object : content) {
			if (object instanceof EclipseModel) {
				currentModelResource = ((EclipseModel) object).eResource();
				break;
			}
		}
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		//Logger.getLogger().info("GenerationEnvironmentPreparation doExecute (2)");
		createProject();
		MonitorServices.initMonitor(monitor);
		if (diagramsInclusion)
			generateDiagramServiceObject(monitor);

		if (airdUri != null) {
			DiagramSessionHelper.setAirdUri(airdUri);
			DiagramSessionHelper.initSession();
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		//Logger.getLogger().info("GenerationEnvironmentPreparation postExecute(6)");
	}

	private void createProject() {
		
		//Logger.getLogger().info("Create project (3)");
		path = new Path(projectName + "/" + outputFolder);
//		path = path.append("output");
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(path);
		if (!folder.exists()) {
			try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				System.err.println("Folder " + folder.getLocation()
						+ " does not exist. It will be created.");
			}
		}
	}

	private void generateDiagramServiceObject(IProgressMonitor progressMonitor) {
		//we generate the doc for our model
		//Logger.getLogger().info("Call generate diagrams (4)");
		GenerateDiagramsService gds = new GenerateDiagramsService(currentModelResource,
				path, progressMonitor);
		gds.createAird(progressMonitor);
	}

}
