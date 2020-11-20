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
package org.polarsys.kitalpha.pdt.introspector.core.services;

import org.polarsys.kitalpha.pdt.introspector.core.IntrospectionContext;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.IntrospectionError;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.PlatformFactory;

/**
 * Contains two strings ((no name) and undefined, use when we can't find a name
 * or an attributes value
 * 
 * @author Xavier DECOOL
 *
 */
public class Helpers extends PlatformServices {

	public static String ANONYMOUS_ELEMENT = "(no name)";
	public static String UNDEFINED_STRING = "Undefined";
	
	
	public static String controlVersionLabel(String elementId, boolean isQualifierMatch, int qualifierSize){
			
		String result;
		int qualifierTempSize;
		
		if(qualifierSize==0)
			qualifierTempSize=0;
		else
			qualifierTempSize=qualifierSize+1;
			
		
		if(isQualifierMatch){
			result=elementId.substring(0,elementId.length()-qualifierTempSize);			
		}else{
			result=elementId;
		}
				
		return result;	
	}


	public static void createErrorForModelElement(EclipseElement element,
			IntrospectionContext introContext, String message, String detail) {
		
		
		if (introContext.isStoreIntrospectionIssues()) {
			IntrospectionError introError = PlatformFactory.eINSTANCE
					.createIntrospectionError();
			introError.setSummary(message);
			introError.setDetails(detail);
			if(element != null)
				introError.setTarget(element);
			//element.getEclipseElementIntrospectionErrors().add(introError);
			introContext.addError(introError);
		}else{
			//TODO bug #5910 : store errors in error log
		}
		
	}
	

}
