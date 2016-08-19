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
package org.polarsys.kitalpha.pdt.docgen.wizard.general;

import org.eclipse.emf.common.util.URI;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class HTMLDocGenContext {

	public static final HTMLDocGenContext INSTANCE = new HTMLDocGenContext();
	
	private HTMLDocGenContext() {
	}
	
	private String projectName;
	private String outputFolderName;
	private String cssSourceFolder;
	private String cssOutputFolder;
	private String modelPath;
	private URI platformModelURI;
	private boolean generationSpecification = true;
	private boolean diagramsInclusion = true;
	private boolean diagramsGenerationChecked = false;
		

	/**
	 * Return true if diagrams are needed in doc, false otherwise 
	 **/
	public boolean diagramsInclusionIsChecked(){
		return diagramsInclusion;
	}
	
	public void setDiagramsInclusion(boolean result){
		diagramsInclusion = result;
	}
	
	
	/**
	 * Return true if current repository location is checked, false otherwise 
	 **/
	public boolean currentRepositoryIsChecked(){
		return generationSpecification;
	}
	
	public void setRepoSpecification(boolean result){
		generationSpecification = result;
	}
	
	public URI getPlatformModelURI() {
		return platformModelURI;
	}

	public void setPlatformModelURI(URI platformModelURI) {
		this.platformModelURI = platformModelURI;
	}

	public String getModelPath() {
		return modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getOutputFolderName() {
		return outputFolderName;
	}

	public void setOutputFolderName(String outputFolderName) {
		this.outputFolderName = outputFolderName;
	}

	public String getCSSSourceFolder() {
		return cssSourceFolder;
	}

	public void setCSSSourceFolder(String cssSourceFolder) {
		this.cssSourceFolder = cssSourceFolder;
	}

	public String getCSSOutputFolder() {
		return cssOutputFolder;
	}

	public void setCSSOutputFolder(String cssOutputFolder) {
		this.cssOutputFolder = cssOutputFolder;
	}
	
	public boolean generateAllDiagramsIsChecked(){
		return diagramsGenerationChecked;
	}
	
	public void setDiagramsGeneration(boolean diagramGeneration){
		this.diagramsGenerationChecked = diagramGeneration;
	}

	public void reset(){
		generationSpecification = true;
		diagramsInclusion = true;
		diagramsGenerationChecked = false;
	}
	
}
