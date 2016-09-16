/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.pdt.docgen.services;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.MonitorServices;
import org.polarsys.kitalpha.doc.gen.business.ecore.Activator;
import org.polarsys.kitalpha.doc.gen.business.ecore.helpers.AIRDDiagramGeneratorHelper;
import org.polarsys.kitalpha.pdt.docgen.exceptions.DocGenException;
import org.polarsys.kitalpha.pdt.docgen.helpers.AIRDHelpers;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;

/**
 * @author Xavier DECOOL
 * @author Boubekeur Zendagui
 */
public class GenerateDiagramsService {

	// Ecore resource
	private static Resource resource;
	private static IPath path;
	private static Session _localSession;
	public static IProgressMonitor progressMonitor;

	// Transactional editing domain and resource set
	// private TransactionalEditingDomain editing_domain ;
	private static TransactionalEditingDomain editing_domain;/*
															 * =
															 * EditingDomainService
															 * . getInstance ().
															 * getEditingDomainProvider
															 * (
															 * ).getEditingDomain
															 * ();
															 */

	/**
	 * eMDE Viewpoint informations
	 */
	private static final String ENTITIES__VSM__PLUGIN_ID = "org.polarsys.kitalpha.pdt.modeler.design";
	private static final String ENTITIES__VIEWPOINT_NAME = "Eclipse Model";

	public GenerateDiagramsService(Resource resource, IPath path,
			IProgressMonitor monitor) {
		GenerateDiagramsService.resource = resource;
		GenerateDiagramsService.path = path;
		GenerateDiagramsService.progressMonitor = monitor;
	}

	// method to call during creation of HTML page
	public static Collection<DRepresentation> generateDiagramsForTheGivenObject(
			EclipseElement element) {
		
		Collection<DRepresentation> diagramList = new ArrayList<DRepresentation>();
		try {
			Collection<DRepresentationDescriptor> diagramsDescriptors = 
					generateDiagrams(progressMonitor, element);
			for (DRepresentationDescriptor dRepresentationDescriptor : diagramsDescriptors) 
			{
				DRepresentation representation = dRepresentationDescriptor.getRepresentation();
				diagramList.add(representation);
			}
//			diagramList = generateDiagrams(progressMonitor, element);
		} catch (DocGenException e) {
			// e.printStackTrace();
			// TODO bug #5982 : popup info for ask user if he really want to exit
			AIRDHelpers.INSTANCE.cleanAllMaps();
			AIRDHelpers.INSTANCE.clearCurrentAird();
		}
		return diagramList;
	}

	public void createAird(final IProgressMonitor monitor) {

		
		//Logger.getLogger().info("Aird creation (5)");
		try {
			// Prepare semantic resources
			final Collection<Resource> semantics = new ArrayList<Resource>();
			semantics.add(resource);

			// Get aird resource
			URI airdUri = AIRDDiagramGeneratorHelper.getExistedURI(path);
			if (airdUri == null) {
				airdUri = AIRDDiagramGeneratorHelper.generateURI(path);
			}

			// Get a session to generate diagrams
			_localSession = SessionManager.INSTANCE.getSession(airdUri,
					progressMonitor);

			DiagramSessionHelper.initSessionFromAirdURI(_localSession
					.getSessionResource().getURI());

			editing_domain = _localSession.getTransactionalEditingDomain();

			boolean sessionWasOpen = _localSession.isOpen();
			if (!sessionWasOpen) {
				_localSession.open(progressMonitor);
			}
			((DAnalysisSession) _localSession).setAnalysisSelector(null);

		}

		catch (Exception e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Error during aird generation", e));
		}
	}

	private static Collection<DRepresentationDescriptor> generateDiagrams(
			final IProgressMonitor monitor, final EclipseElement element)
			throws DocGenException {

		Collection<DRepresentationDescriptor> allRepresentations = new ArrayList<DRepresentationDescriptor>();

		if (null != monitor && progressMonitor != monitor)
			progressMonitor = monitor;

		final CommandStack stack = _localSession
				.getTransactionalEditingDomain().getCommandStack();

		stack.execute(new RecordingCommand(editing_domain) {
			@Override
			protected void doExecute() {
				_localSession.addSemanticResource(element.eResource().getURI(),
						monitor);
			}
		});

		Resource modelResource = element.eResource();
		String elementID = ((XMIResource) modelResource).getID(element);
		
		//Logger.getLogger().info("Generating diagrams for "+elementID);

		// generate diagrams
		String representationFileName = _localSession.getID().toString()
				.replace("platform:/resource/", "");

		// I store my session
		AIRDHelpers.INSTANCE.storeLocalSession(_localSession);

		// and then i populate diagrams
		PlatformElementRepresentationCreationOperation operation = new PlatformElementRepresentationCreationOperation(
				modelResource.getURI(), elementID, _localSession,
				representationFileName, ENTITIES__VSM__PLUGIN_ID,
				ENTITIES__VIEWPOINT_NAME, null);

		MonitorServices.initMonitor(progressMonitor);
		try {
			operation.run(progressMonitor);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// } catch (DocGenException e){
		// AIRDHelpers.INSTANCE.cleanAllMaps();
		// AIRDHelpers.INSTANCE.clearCurrentAird();
		// }

		Collection<DView> ownedViews = _localSession.getOwnedViews();
		for (DView dView : ownedViews) {
			if (monitor.isCanceled()) {
				throw new DocGenException("Generation was canceled");
			}
			
			EList<DRepresentationDescriptor> representations = dView.getOwnedRepresentationDescriptors();
			allRepresentations.addAll(representations);
		}
		
		return allRepresentations;
	}
}
