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
package org.polarsys.kitalpha.pdt.metamodel.gen.edit.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.FilesystemDomain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.kitalpha.pdt.metamodel.gen.edit.tasks.messages.Messages;
import org.polarsys.kitalpha.pdt.metamodel.internal.gen.Activator;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class CopyIconsRepository implements ITaskProduction {

	private File SRC_ICONS_REPOSITORY;
	private File DEST_ICONS_REPOSITORY;
	private FilesystemDomain CURRENT_PLUGIN;
	private FilesystemDomain CURRENT_WORKSPACE;
	
	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		CURRENT_PLUGIN = productionContext.getInputValue("CURRENT_PLUGIN", FilesystemDomain.class); //$NON-NLS-1$
		CURRENT_WORKSPACE = productionContext.getInputValue("CURRENT_WORKSPACE", FilesystemDomain.class); //$NON-NLS-1$
		EList<Object> currPluginContent = CURRENT_PLUGIN.getContent();
		for (Object obj : currPluginContent) {
			if (obj instanceof File) {
				File file = (File) obj;
				if (file.getPath().endsWith("icons")) { //$NON-NLS-1$
					SRC_ICONS_REPOSITORY = file;
					break;
				}
			}
		}
		EList<Object> currWorkspaceContent = CURRENT_WORKSPACE.getContent();
		for (Object obj : currWorkspaceContent) {
			if (obj instanceof File) {
				File file = (File) obj;
				if (file.getPath().endsWith("introspector.model.edit")) { //$NON-NLS-1$
					if (file.isDirectory()) {
						File[] editPluginFiles = file.listFiles();
						for (File editPluginFile : editPluginFiles) {
							if (editPluginFile.getPath().endsWith("icons")) { //$NON-NLS-1$
								DEST_ICONS_REPOSITORY = editPluginFile;
								break;
							}
						}
					}
				}
			}
		}
		
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		if (SRC_ICONS_REPOSITORY != null && DEST_ICONS_REPOSITORY != null) {
				copy(SRC_ICONS_REPOSITORY, DEST_ICONS_REPOSITORY);
		}
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}
	
	public void copy(File sourceLocation, File targetLocation) {
	    if (sourceLocation.isDirectory()) {
	        copyDirectory(sourceLocation, targetLocation);
	    } else {
	        copyFile(sourceLocation, targetLocation);
	    }
	}

	private void copyDirectory(File source, File target) {
	    if (!target.exists()) {
	        target.mkdirs();
	    }

	    for (String f : source.list()) {
	        copy(new File(source, f), new File(target, f));
	    }
	}

	private void copyFile(File source, File target) {        
		InputStream in = null;
		OutputStream out = null;
		
		try {
			if (!target.exists()) {
				target.delete();
				target.mkdirs();
				Boolean fileCreated = target.createNewFile();
				if (!fileCreated) {
					target.delete();
					target.createNewFile();
				}
			}

			in = new FileInputStream(source);
			out = new FileOutputStream(target);

			byte[] buf = new byte[1024];
			int length;
			while ((length = in.read(buf)) > 0) {
				out.write(buf, 0, length);
			}

			in.close();
			out.close();

		} catch (IOException e) {
			String message = Messages.bind(Messages.IconCopyError, new String[]{source.getName(), target.getName()});
			IStatus warningStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, e);
			StatusManager.getManager().handle(warningStatus);
		}
	}
}
