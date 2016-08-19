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
package org.polarsys.kitalpha.pdt.docgen.exceptions;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class DocGenException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DocGenException(){
	}
	
	public DocGenException(String message){
		super(message);
	}
	
	public DocGenException(Throwable t){
		super(t);
	}
	
	public DocGenException(String message, Throwable t){
		super(message, t);
	}
}
