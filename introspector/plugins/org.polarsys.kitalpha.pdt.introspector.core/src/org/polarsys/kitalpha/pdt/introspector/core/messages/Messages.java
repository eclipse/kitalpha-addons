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
package org.polarsys.kitalpha.pdt.introspector.core.messages;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Faycal Abka
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.pdt.introspector.core.messages.messages";
	
	public static String FolderDoesNotExist_Creation_Information;
	public static String ErrorPlatformInterospectionInvocation;
	public static String ErrorPlatformInterospectionInterrupted;
	public static String WarningPlatformIntrospectionException;
	public static String EclipseModel;
	public static String WorkspaceOnlyIntrospectionPerimeter;
	public static String ErrorResourcesMembers;
	public static String ErrorGenerationTargetHandler;
	public static String ErrorSavingResource;
	public static String ErrorRefreshWorkspace;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
