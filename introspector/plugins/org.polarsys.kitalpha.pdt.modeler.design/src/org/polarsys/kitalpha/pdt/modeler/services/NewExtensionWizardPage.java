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
package org.polarsys.kitalpha.pdt.modeler.services;

import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class NewExtensionWizardPage extends WizardPage {

	private ExtensionPoint contributedExtensionPoint;

	private Text textID;
	private Text textName;

	private String extensionID;
	private String extensionName;

	private Composite container;


	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		// Scenario name
		Label labelID = new Label(container, SWT.NONE);
		labelID.setText("Extension ID : ");
		int extensionPos = contributedExtensionPoint.getContributors().size() + 1;

		textID = new Text(container, SWT.NONE);
		extensionID = contributedExtensionPoint.getId() + "_" + extensionPos; //$NON-NLS-1$
		textID.setText(extensionID);
		textID.setEditable(false);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		textID.setLayoutData(gd);

		Label labelName = new Label(container, SWT.NONE);
		labelName.setText("Extension name : ");
		extensionName = "";
		textName = new Text(container, SWT.BORDER | SWT.SINGLE);
		textName.setText(extensionName);
		textName.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				//nothing
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!textName.getText().isEmpty()) {
					extensionName = textName.getText();
					setPageComplete(true);
				}
			}
		});
		GridData gd1 = new GridData(GridData.FILL_HORIZONTAL);
		textName.setLayoutData(gd1);
		Button defaultNameButton = new Button(container, SWT.NONE);
		defaultNameButton.setText("Default");
		defaultNameButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				//nothing
			}

			@Override
			public void mouseDown(MouseEvent e) {
				extensionName = extensionID;
				textName.setText(extensionName);
				setPageComplete(true);
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				//nothing
			}


		});
		setControl(container);

	}

	/**
	 * TODO Javadoc is wellcome here
	 * @return
	 */
	public String getTextName() {
		if (extensionName != null)
			return extensionName;
		else
			return "(No Name)"; //$NON-NLS-1$
	}

	public NewExtensionWizardPage(ISelection selection) {
		super("New Extension ...");
		setTitle("Arguments definition");
		setDescription("Creation of a new extension");
		IStructuredSelection structSel = (IStructuredSelection) selection;
		Iterator<?> it = structSel.iterator();
		Object next = it.next();
		if (next instanceof ExtensionPoint) {
			contributedExtensionPoint = (ExtensionPoint) next;
		}
	}

}
