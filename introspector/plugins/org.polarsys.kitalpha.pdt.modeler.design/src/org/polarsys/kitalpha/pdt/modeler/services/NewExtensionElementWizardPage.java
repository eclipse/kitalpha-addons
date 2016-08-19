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

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ComplexCompositor;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.ExtensionPoint;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElement;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.SchemaElementReference;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class NewExtensionElementWizardPage extends WizardPage {

	private String extensionName;
	private Text textName;
	private ExtensionPoint contributedExtensionPoint;
	private SchemaElement extensionSchemaElement;
	private ComplexCompositor extensionComplexCompositor;
	private EList<SchemaElementReference> elementReferences;
	private Tree tree;
	private TreeItem root;
	private Composite container;
	private List elementsList;

	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		setControl(container);
		extensionSchemaElement = contributedExtensionPoint
				.getExtensionSchemaElement();
		if (extensionSchemaElement != null) {
			extensionComplexCompositor = extensionSchemaElement
					.getComplexCompositor();
		}

		if (extensionComplexCompositor != null) {
			elementReferences = extensionComplexCompositor
					.getElementReferences();
			extensionComplexCompositor.getMinCard();
			extensionComplexCompositor.getMaxCard();
		}

		if (!elementReferences.isEmpty() && elementReferences != null) {
			for (SchemaElementReference elementReference : elementReferences) {
				elementReference.getReference();
			}
		}

		tree = new Tree(container, SWT.VIRTUAL | SWT.BORDER);
		tree.setItemCount(0);
		root = new TreeItem(tree, SWT.NONE);
		root.setText(extensionName);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		tree.setLayoutData(gd);
		tree.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				//nothing
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if (e.button == 3) {
					elementsList = new List(tree, SWT.NONE);
					int i = 0;
					for (SchemaElementReference schemaElementReference : elementReferences) {
						String elementName = schemaElementReference.getName();
						elementsList.add(elementName);
						elementsList.setItem(i, elementName);
						elementsList.setVisible(true);
						i++;
					}
				}

			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				//nothing
			}
		});
	}

	public String getTextName() {
		return textName.getText();
	}

	public void setExtensionName(String extName) {
		extensionName = extName;
	}

	public NewExtensionElementWizardPage(ISelection selection) {
		super("New Extension ...");
		setTitle("Element definition");
		setDescription("Definition of extension schema(s) element(s)");
		setControl(textName);
		IStructuredSelection structSel = (IStructuredSelection) selection;
		Iterator<?> it = structSel.iterator();
		Object next = it.next();
		if (next instanceof ExtensionPoint) {
			contributedExtensionPoint = (ExtensionPoint) next;
		}
	}

}
