//Generated with EGF 1.3.0.v20150924-1035
package org.polarsys.kitalpha.pdt.metamodel.gen.edit.itemprovider.gettext;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class FeatureToPluginDependencyItemProvider_GetText
		extends org.eclipse.egf.emf.pattern.edit.call.ItemProvider.ItemProvidergetTextoverride {
	protected static String nl;

	public static synchronized FeatureToPluginDependencyItemProvider_GetText create(String lineSeparator) {
		nl = lineSeparator;
		FeatureToPluginDependencyItemProvider_GetText result = new FeatureToPluginDependencyItemProvider_GetText();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL + "\t\t/**" + NL + "\t\t * CUSTOM_CODE_BEGIN" + NL + "\t\t **/" + NL
			+ "\t\tString id = \" \";" + NL + "\t\tString versionToMatch = \"\";" + NL + "\t\tString label = \"\";" + NL
			+ "\t\tMatchRule matchRule = MatchRule.UNSET;" + NL + "" + NL
			+ "\t\tFeatureToPluginDependency dependency = (FeatureToPluginDependency) object;" + NL + "" + NL
			+ "\t\tif (dependency.getTarget() != null) {" + NL + "\t\t\tid = dependency.getTarget().getId();" + NL
			+ "\t\t\tlabel += id;" + NL + "\t\t}" + NL + "\t\tif (dependency.getTarget() != null) {" + NL
			+ "\t\t\tversionToMatch = dependency.getVersion();" + NL + "\t\t\tif (versionToMatch != null){" + NL
			+ "\t\t\t\tlabel += \" -> v\" + versionToMatch;" + NL + "\t\t\t\tmatchRule = dependency.getMatchRule();"
			+ NL + "\t\t\t\tif(matchRule != MatchRule.UNSET){" + NL + "\t\t\t\t\tlabel += \" : \" + matchRule;  " + NL
			+ "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn label + \" [Plugin Dependency]\";" + NL
			+ "\t\t/**" + NL + "\t\t * CUSTOM_CODE_END : []" + NL + "\t\t **/" + NL;
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;

	public FeatureToPluginDependencyItemProvider_GetText() {
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

		List<Object> genClassList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> genPackageList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> genModelList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> _ListList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object genClassParameter : genClassList) {
			for (Object genPackageParameter : genPackageList) {
				for (Object genModelParameter : genModelList) {
					for (Object _ListParameter : _ListList) {

						this.genClass = (org.eclipse.emf.codegen.ecore.genmodel.GenClass) genClassParameter;
						this.genPackage = (org.eclipse.emf.codegen.ecore.genmodel.GenPackage) genPackageParameter;
						this.genModel = (org.eclipse.emf.codegen.ecore.genmodel.GenModel) genModelParameter;
						this._List = (java.lang.String) _ListParameter;

						if (preCondition(ctx)) {
							ctx.setNode(new Node.Container(currentNode, getClass()));
							orchestration(ctx);
						}

					}
				}
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

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("genClass", this.genClass);
			parameterValues.put("genPackage", this.genPackage);
			parameterValues.put("genModel", this.genModel);
			parameterValues.put("_List", this._List);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("genClass", this.genClass);
		parameters.put("genPackage", this.genPackage);
		parameters.put("genModel", this.genModel);
		parameters.put("_List", this._List);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		genModel.addImport("org.polarsys.kitalpha.pdt.metamodel.model.platform.MatchRule");
		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return genClass.getName().equals("FeatureToPluginDependency");
	}
}