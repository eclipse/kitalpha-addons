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

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;


/**
 * 
 * @author Xavier DECOOL
 *
 */
public class CopyCSS implements ITaskProduction {

	private static final String CONTRACT_PLUGIN_ID_TAG = "plugin_id"; //$NON-NLS-1$
	private static final String DESTINATION_PATH = "destination_path";
	private static final String SOURCE_PATH = "source_path";
	private static final String OUTPUT_FOLDER_PATH = "outputFolder";

	@Override
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// refresh source and destination path.
		IFolder source = getSourceFolder(productionContext);
		IFolder destination = getDestinationFolder(productionContext);
		try {
			source.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			destination.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (CoreException e) {
			throw new InvocationException(e);
		}
	}

	@Override
	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

		IFolder source = getSourceFolder(productionContext);
		IFolder destination = getDestinationFolder(productionContext);
		try {
			copy(source, destination);
		} catch (CoreException e) {
			throw new InvocationException(e);
		}

	}

	private void copy(IFolder source, IFolder destination) throws CoreException {

		IPath projectSourceRelativePath = source.getProjectRelativePath();
		IPath projectDestinationFullPath = destination.getFullPath().removeFirstSegments(1);
		String pluginID = projectSourceRelativePath.segment(0);
		URL urlSource;
		IProject project = destination.getProject();
		IFolder folder = project.getFolder(projectDestinationFullPath);
		IFile contentFile = folder.getFile("content.css");
		try {
			urlSource = new URL("platform:/plugin/" + pluginID
					+ "/CSS/content.css");
			InputStream inputStream = urlSource.openConnection()
					.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					inputStream));

			String inputLine;
			FileOutputStream outStream = new FileOutputStream(contentFile
					.getLocation().toOSString());

			while ((inputLine = in.readLine()) != null) {
				outStream.write(inputLine.getBytes());
				String jump = "\n";
				outStream.write(jump.getBytes());
			}
			in.close();
			outStream.flush();
			outStream.close();
			

		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	private IFolder getSourceFolder(ITaskProductionContext context)
			throws InvocationException {
		String sourcePath = getSourcePath(context);
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(new Path(sourcePath));

		if (!folder.exists()) {
			Platform.getBundle(sourcePath.substring(1,
					sourcePath.indexOf('/', 1)));

		}
		return folder;
	}

	private String getSourcePath(ITaskProductionContext context)
			throws InvocationException {
		return context.getInputValue(SOURCE_PATH, String.class);
	}

	private String getPluginId(ITaskProductionContext context)
			throws InvocationException {
		return context.getInputValue(CONTRACT_PLUGIN_ID_TAG, String.class);
	}

	private String getDestinationPath(ITaskProductionContext context) throws InvocationException {
		return context.getInputValue(DESTINATION_PATH, String.class);
	}

	private IFolder getDestinationFolder(ITaskProductionContext context) throws InvocationException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(getPluginId(context));
		String destinationPath = getDestinationPath(context);
		String outputFolder = context.getInputValue(OUTPUT_FOLDER_PATH, String.class);
		IPath path = new Path(outputFolder);
		path = path.removeLastSegments(1);
		path = path.append(destinationPath);
		return project.getFolder(path);
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// refresh destination path
		IFolder folder = getDestinationFolder(productionContext);
		try {
			folder.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (CoreException e) {
			throw new InvocationException(e);
		}
	}
}
