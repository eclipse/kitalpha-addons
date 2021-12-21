//Generated with EGF 1.6.3.202110291409
package org.polarsys.kitalpha.pdt.metamodel.gen.edit.itemprovider.gettext;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class PluginDependencyItemProvider_GetText
		extends org.eclipse.egf.emf.pattern.edit.call.ItemProvider.ItemProvidergetTextoverride {
	protected static String nl;

	public static synchronized PluginDependencyItemProvider_GetText create(String lineSeparator) {
		nl = lineSeparator;
		PluginDependencyItemProvider_GetText result = new PluginDependencyItemProvider_GetText();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL + "\t\t/**" + NL + "\t\t * CUSTOM_CODE_BEGIN" + NL + "\t\t **/" + NL
			+ "\t\tString firstBracket = \"|\";" + NL + "\t\tString lastBracket = \"|\";" + NL
			+ "\t\tPluginDependency dependency = (PluginDependency) object;" + NL + "\t\tString id = \"\";" + NL
			+ "\t\tString minimumVersion = \"UNDEFINED\";" + NL + "\t\tString maximumVersion = \"UNDEFINED\";" + NL
			+ "\t\t" + NL + "\t\t// brackets" + NL
			+ "\t\tif (dependency.getMinimumInclusion().getName() == InclusionKind.INCLUSIVE.getLiteral())" + NL
			+ "\t\t\tfirstBracket = \"[\";" + NL
			+ "\t\telse if (dependency.getMinimumInclusion().getName() == InclusionKind.EXCLUSIVE.getLiteral())" + NL
			+ "\t\t\tfirstBracket = \"]\";" + NL + "\t\telse" + NL + "\t\t\tfirstBracket = \"|\";" + NL
			+ "\t\tif (dependency.getMaximumInclusion().getName() == InclusionKind.INCLUSIVE.getLiteral())" + NL
			+ "\t\t\tlastBracket = \"]\";" + NL
			+ "\t\telse if (dependency.getMaximumInclusion().getName() == InclusionKind.EXCLUSIVE.getLiteral())" + NL
			+ "\t\t\tlastBracket = \"[\";" + NL + "\t\telse" + NL + "\t\t\tlastBracket = \"|\";" + NL + "" + NL
			+ "\t\t//versions" + NL + "\t\tString modelMinimumVersion = dependency.getMinimumVersion();" + NL
			+ "\t\tif ((modelMinimumVersion != null)&&(!modelMinimumVersion.isEmpty()))" + NL
			+ "\t\t\tminimumVersion = modelMinimumVersion;" + NL + "\t\t" + NL
			+ "\t\tString modelMaximumVersion = dependency.getMaximumVersion();" + NL
			+ "\t\tif ((modelMaximumVersion != null)&&(!modelMaximumVersion.isEmpty()))" + NL
			+ "\t\t\tmaximumVersion = modelMaximumVersion;" + NL + "\t\t" + NL + "\t\t" + NL + "\t\t//dependency" + NL
			+ "\t\tif (dependency.getTarget() != null) {" + NL + "\t\t\tid = dependency.getTarget().getId();" + NL
			+ "\t\t}" + NL + "\t\t" + NL + "\t\treturn \"\" + id + \" \" + firstBracket + minimumVersion + \" ; \"" + NL
			+ "\t\t\t\t+ maximumVersion + lastBracket+\" [Plugin Dependency]\";" + NL + "\t\t/**" + NL
			+ "\t\t * CUSTOM_CODE_END : []" + NL + "\t\t **/" + NL;
	protected final String TEXT_2 = NL;

	public PluginDependencyItemProvider_GetText() {
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
		List<Object> isJDK50List = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> forceDefaultCaseList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> indentDefaultCaseList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> _ListList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object genClassParameter : genClassList) {
			for (Object genPackageParameter : genPackageList) {
				for (Object genModelParameter : genModelList) {
					for (Object isJDK50Parameter : isJDK50List) {
						for (Object forceDefaultCaseParameter : forceDefaultCaseList) {
							for (Object indentDefaultCaseParameter : indentDefaultCaseList) {
								for (Object _ListParameter : _ListList) {

									this.genClass = (org.eclipse.emf.codegen.ecore.genmodel.GenClass) genClassParameter;
									this.genPackage = (org.eclipse.emf.codegen.ecore.genmodel.GenPackage) genPackageParameter;
									this.genModel = (org.eclipse.emf.codegen.ecore.genmodel.GenModel) genModelParameter;
									this.isJDK50 = (java.lang.Boolean) isJDK50Parameter;
									this.forceDefaultCase = (java.lang.Boolean) forceDefaultCaseParameter;
									this.indentDefaultCase = (java.lang.String) indentDefaultCaseParameter;
									this._List = (java.lang.String) _ListParameter;

									if (preCondition(ctx)) {
										ctx.setNode(new Node.Container(currentNode, getClass()));
										orchestration(ctx);
									}

								}
							}
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
		stringBuffer.append(TEXT_2);
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
			parameterValues.put("isJDK50", this.isJDK50);
			parameterValues.put("forceDefaultCase", this.forceDefaultCase);
			parameterValues.put("indentDefaultCase", this.indentDefaultCase);
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
		parameters.put("isJDK50", this.isJDK50);
		parameters.put("forceDefaultCase", this.forceDefaultCase);
		parameters.put("indentDefaultCase", this.indentDefaultCase);
		parameters.put("_List", this._List);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		genModel.addImport("org.polarsys.kitalpha.pdt.metamodel.model.platform.InclusionKind");
		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return genClass.getName().equals("PluginDependency");
	}
}