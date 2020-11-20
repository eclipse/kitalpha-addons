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
