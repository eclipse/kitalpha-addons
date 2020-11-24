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
package org.polarsys.kitalpha.pdt.docgen.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class CleanUselessObjectCommandService extends RecordingCommand {
	
	private EObject objectToRemove;
	
	public CleanUselessObjectCommandService(final Session session, EObject objectToRemove) {
		this(session.getTransactionalEditingDomain());
		this.objectToRemove = objectToRemove;
	}
	
	private CleanUselessObjectCommandService(TransactionalEditingDomain domain) {
		super(domain);
	}

	@Override
	protected void doExecute() {
		if(objectToRemove instanceof DEdge)
			((DEdge)objectToRemove).setVisible(false);
		if(objectToRemove instanceof DNode)
			((DNode)objectToRemove).setVisible(false);
	}

}
