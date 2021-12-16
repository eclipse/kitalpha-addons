//Generated with EGF 1.6.3.202110291409
package org.polarsys.kitalpha.pdt.docgen.content;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.kitalpha.doc.gen.business.core.util.DefaultSiriusDiagramHelper;
import org.polarsys.kitalpha.pdt.docgen.helpers.ObjectHelpers;
import org.polarsys.kitalpha.pdt.docgen.helpers.Helpers;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class eclipseModelsContent extends org.polarsys.kitalpha.doc.gen.business.core.doccontent.ElementDocContent {
	protected static String nl;

	public static synchronized eclipseModelsContent create(String lineSeparator) {
		nl = lineSeparator;
		eclipseModelsContent result = new eclipseModelsContent();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<div style=\"position: fixed; top: 0; left: 1%; width: 98%; z-index: 2; background-color: white; \";>";
	protected final String TEXT_2 = NL + "\t<p><strong>";
	protected final String TEXT_3 = " :</strong> ";
	protected final String TEXT_4 = "</p>";
	protected final String TEXT_5 = NL + "<h1><img src=\"../icon/";
	protected final String TEXT_6 = "\" alt=\"\" /> ";
	protected final String TEXT_7 = "</h1>" + NL + "<hr style=\"width:98%; align : center; \" /> " + NL + "</div>" + NL
			+ "" + NL + "<div style=\"position: absolute; top: 160px; left: 1%; z-index: 1; width: 98%;\">" + NL;
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL + NL + NL + NL;

	public eclipseModelsContent() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_8);
		stringBuffer.append(TEXT_8);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement element = null;

	public void set_element(org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseElement object) {
		this.element = object;
	}

	protected org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper helper = null;

	public void set_helper(org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper object) {
		this.helper = object;
	}

	protected java.lang.String iconPath = null;

	public void set_iconPath(java.lang.String object) {
		this.iconPath = object;
	}

	protected org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel parameter = null;

	public void set_parameter(org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String outputFolder = ctx.getValue("outputFolder").toString();
		String projectName = ctx.getValue("projectName").toString();
		String text = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers.getLabel((EclipseElement) element);
		try {
			text = EscapeChars.forHTML(text);
		} catch (NullPointerException e) {
			System.err.println("Caught exception while converting text into html:" + e.getMessage());
			text = "";
		}

		stringBuffer.append(TEXT_1);

		String hyperlink = "";
		EObject parent = element.eContainer();
		if (parent != null && parent instanceof EclipseElement) {
			hyperlink = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers.getTypeHyperLink((EclipseElement) parent,
					Helpers.getLabel((EclipseElement) parent));
			String parentClassName = parent.eClass().getName();
			stringBuffer.append(TEXT_2);
			stringBuffer.append(parentClassName);
			stringBuffer.append(TEXT_3);
			stringBuffer.append(hyperlink);
			stringBuffer.append(TEXT_4);

		}

		String imageFileName = LabelProviderHelper.getImageFileName(element, projectName, outputFolder);
		stringBuffer.append(TEXT_5);
		stringBuffer.append(imageFileName);
		stringBuffer.append(TEXT_6);
		stringBuffer.append(text);
		stringBuffer.append(TEXT_7);

		String EMName = ((EclipseModel) element).getName();
		if (EMName == null) {
			EMName = "Eclipse Model Name not found";
		}

		stringBuffer.append(TEXT_8);

		String eclipseModelPage = org.polarsys.kitalpha.pdt.docgen.helpers.EclipseModelHelpers
				.getEclipseModelPage((EclipseModel) element, projectName, outputFolder, 1);

		stringBuffer.append(TEXT_8);
		stringBuffer.append(TEXT_8);
		stringBuffer.append(eclipseModelPage);
		stringBuffer.append(TEXT_9);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_setContext(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		element = parameter;
		fileName = fileNameService.getFileName(element);
		helper = new DefaultSiriusDiagramHelper();
		title = org.polarsys.kitalpha.pdt.docgen.helpers.Helpers.getLabel(element);
		String className = element.eClass().getName();
		iconPath = "../icon/" + className + ".png";

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext", stringBuffer.toString());
	}

	protected void method_setFileNameService(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		fileNameService = new ObjectHelpers();

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setFileNameService", stringBuffer.toString());
	}
}