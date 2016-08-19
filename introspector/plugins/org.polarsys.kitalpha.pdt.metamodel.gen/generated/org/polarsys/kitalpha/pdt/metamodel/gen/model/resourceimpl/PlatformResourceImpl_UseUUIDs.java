//Generated with EGF 1.3.0.v20150924-1035
package org.polarsys.kitalpha.pdt.metamodel.gen.model.resourceimpl;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class PlatformResourceImpl_UseUUIDs extends org.eclipse.egf.emf.pattern.model.ResourceClass {
	protected static String nl;

	public static synchronized PlatformResourceImpl_UseUUIDs create(String lineSeparator) {
		nl = lineSeparator;
		PlatformResourceImpl_UseUUIDs result = new PlatformResourceImpl_UseUUIDs();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "/**" + NL + " *" + NL + " * Copyright (c) THALES, 2007-2010. All rights reserved."
			+ NL + " *" + NL + " */" + NL + "package org.polarsys.kitalpha.pdt.metamodel.model.platform.util;" + NL + ""
			+ NL + "import java.io.IOException;" + NL + "import java.util.HashMap;" + NL + "import java.util.Map;" + NL
			+ "" + NL + "import org.eclipse.emf.common.util.URI;" + NL
			+ "import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;" + NL + "" + NL + "/**" + NL
			+ " * <!-- begin-user-doc --> The <b>Resource </b> associated with the package." + NL
			+ " * <!-- end-user-doc -->" + NL
			+ " * @see org.polarsys.kitalpha.pdt.metamodel.model.platform.util.PlatformResourceFactoryImpl" + NL
			+ " * @generated" + NL + " */" + NL + "public class PlatformResourceImpl extends XMIResourceImpl {" + NL
			+ "\t/**" + NL + "\t * Creates an instance of the resource." + NL + "\t * <!-- begin-user-doc --> <!--" + NL
			+ "\t * end-user-doc -->" + NL + "\t * @param uri the URI of the new resource." + NL + "\t * @generated"
			+ NL + "\t */" + NL + "\tpublic PlatformResourceImpl(URI uri) {" + NL + "\t\tsuper(uri);" + NL + "\t}" + NL
			+ "" + NL + "\t@Override" + NL + "\t/**" + NL + "\t * @generated NOT" + NL + "\t */" + NL + "\t/**" + NL
			+ "\t * CUSTOM_CODE_BEGIN : []" + NL + "\t **/" + NL + "\tprotected boolean useUUIDs() {" + NL
			+ "\t\treturn true;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * (non-Javadoc)" + NL + "\t * " + NL
			+ "\t * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#load(java.util.Map)" + NL
			+ "\t * @generated not with special scotch by Hello Kitty (R) [MHE]" + NL + "\t */" + NL + "\t@Override"
			+ NL + "\t@SuppressWarnings({ \"rawtypes\", \"unchecked\" })" + NL
			+ "\tpublic void load(Map options) throws IOException {" + NL + "\t\tMap newOptions = new HashMap();" + NL
			+ "\t\tif (options != null)" + NL + "\t\t\tnewOptions.putAll(options);" + NL
			+ "\t\t// if ((options==null)||(options.size()==0)){" + NL + "\t\t// options = new HashMap();" + NL
			+ "\t\t// }" + NL + "" + NL + "\t\tnewOptions.put(OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);" + NL
			+ "\t\tsuper.load(newOptions);" + NL + "\t}" + NL + "} // PlatformResourceImpl" + NL + "/**" + NL
			+ " * CUSTOM_CODE_END : []" + NL + " **/";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;

	public PlatformResourceImpl_UseUUIDs() {
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

			this.parameter = (org.eclipse.emf.codegen.ecore.genmodel.GenPackage) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_3);
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

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_doGenerate(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "doGenerate", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}