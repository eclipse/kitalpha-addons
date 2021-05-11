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
package org.polarsys.kitalpha.pdt.docgen.helpers;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.command.DeleteRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;

/**
 * @author Xavier DECOOL, Boubekeur Zendagui
 */
public class AIRDHelpers {
	public static final AIRDHelpers INSTANCE = new AIRDHelpers();
	private Session _localSession;
	
	public Session getCurrentSession(){
		return _localSession;
	}
	
	public void storeLocalSession(Session localSession){
		_localSession = localSession;
	}
	
	public void clearCurrentAird(){
		// Here i empty representations of my currentSession
		if(_localSession.isOpen()){
			Collection<DView> views = _localSession.getOwnedViews();
			
			TransactionalEditingDomain editingDomain = _localSession.getTransactionalEditingDomain();
			CommandStack commandStack = editingDomain.getCommandStack();
			
			for (DView dView : views) {				
				EList<DRepresentationDescriptor> ownedRepresentationDescriptors = dView.getOwnedRepresentationDescriptors();
				Set<DRepresentationDescriptor> representationsSet = new HashSet<DRepresentationDescriptor>();
				representationsSet.addAll(ownedRepresentationDescriptors);
				DeleteRepresentationCommand command = new DeleteRepresentationCommand(_localSession, representationsSet);
				commandStack.execute(command);
			}
		}
	}
	
	
	/**
	 * Used for clean all hash maps after the end of a html page creation
	 */
	public void cleanAllMaps(){
		ExtensionsHelpers.extensionsPages.clear();
		ExtensionsHelpers.extensionDiagrams.clear();
		ExtensionPointsHelpers.extensionPointsDiagrams.clear();
		ExtensionPointsHelpers.extensionPointsPages.clear();
	}
}
