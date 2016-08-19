//Generated with EGF 1.3.0.v20150924-1035
package org.polarsys.kitalpha.pdt.docgen.index;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.polarsys.kitalpha.pdt.metamodel.model.platform.EclipseModel;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class generalIndexBuilder extends org.polarsys.kitalpha.doc.gen.business.core.index.GeneralIndexBuilder {
	protected static String nl;

	public static synchronized generalIndexBuilder create(String lineSeparator) {
		nl = lineSeparator;
		generalIndexBuilder result = new generalIndexBuilder();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + "\t\t<li>" + NL
			+ "\t\t\t<div style=\"float:left; margin-left:5px; font-size:12px; font-family:Arial\">" + NL
			+ "\t\t\t\t<a href=\"";
	protected final String TEXT_3 = "/";
	protected final String TEXT_4 = ".html\" target=\"_top\">";
	protected final String TEXT_5 = "</a>" + NL + "\t\t\t</div>" + NL + "\t\t</li>";
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = "\t</ul>" + NL + "    </body>" + NL + "</html>";
	protected final String TEXT_8 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL
			+ "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" " + NL
			+ "        \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" + NL
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\">" + NL + "" + NL + "    <head>" + NL
			+ "\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/generalindex.css\" />" + NL + "    </head>"
			+ NL + "    " + NL + "    <body>" + NL + "    <ul class=\"generalIndex\">";
	protected final String TEXT_9 = " ";
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL;

	public generalIndexBuilder() {
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

		if (preCondition(ctx)) {
			ctx.setNode(new Node.Container(currentNode, getClass()));
			orchestration(ctx);
		}

		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_10);
		stringBuffer.append(TEXT_11);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		List<Object> model = (List<Object>) ctx.getValue(PatternContext.DOMAIN_OBJECTS);
		String fileName = "";
		String buffer = "";
		EclipseModel rootModel;
		List<String> domainList = (List<String>) ctx.getValue("domainList");
		int modelsNumber = model.size();
		for (Object currentObject : model) {
			if (currentObject instanceof EclipseModel) {
				fileName = org.polarsys.kitalpha.pdt.docgen.helpers.EclipseModelHelpers
						.getEclipseModelName((EclipseModel) currentObject);
				//org.polarsys.kitalpha.pdt.docgen.helpers.EclipseModelHelpers.getReferencedEclipseModelsCount((EclipseModel)currentObject);
				rootModel = (EclipseModel) currentObject;
				buffer = org.polarsys.kitalpha.pdt.docgen.helpers.ModelIndexHelpers.getModelIndexContent(rootModel,
						fileName, domainList);
				org.polarsys.kitalpha.pdt.docgen.helpers.ModelIndexHelpers.clearModelIndexBuffer(modelsNumber);
				model.remove(currentObject);
				break;
			}
		}

		stringBuffer.append(TEXT_1);
		/*
		
		
		for (String domain : domainList){
		
		stringBuffer.append(TEXT_2);
		stringBuffer.append(domain);
		stringBuffer.append(TEXT_3);
		stringBuffer.append(fileName);
		stringBuffer.append(TEXT_4);
		stringBuffer.append(fileName);
		stringBuffer.append(TEXT_5);
		}
		*/
		stringBuffer.append(TEXT_6);
		stringBuffer.append(buffer);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_htmlFooter(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_7);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "htmlFooter", stringBuffer.toString());
	}

	protected void method_htmlHeader(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_8);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "htmlHeader", stringBuffer.toString());
	}

	protected void method_setContextVariable(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		ctx.setValue("fileName", "modelindex");

		stringBuffer.append(TEXT_9);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContextVariable", stringBuffer.toString());
	}
}