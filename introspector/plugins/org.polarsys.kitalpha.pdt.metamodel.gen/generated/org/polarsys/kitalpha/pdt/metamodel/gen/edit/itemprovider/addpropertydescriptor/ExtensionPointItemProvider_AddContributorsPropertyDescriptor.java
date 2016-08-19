//Generated with EGF 1.3.0.v20150924-1035
package org.polarsys.kitalpha.pdt.metamodel.gen.edit.itemprovider.addpropertydescriptor;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class ExtensionPointItemProvider_AddContributorsPropertyDescriptor
		extends org.eclipse.egf.emf.pattern.edit.call.ItemProvider.ItemProvideraddPropertyDescriptoroverride {
	protected static String nl;

	public static synchronized ExtensionPointItemProvider_AddContributorsPropertyDescriptor create(
			String lineSeparator) {
		nl = lineSeparator;
		ExtensionPointItemProvider_AddContributorsPropertyDescriptor result = new ExtensionPointItemProvider_AddContributorsPropertyDescriptor();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "\t\t// begin-extension-code" + NL + "\t\titemPropertyDescriptors" + NL
			+ "\t\t\t\t.add(createItemPropertyDescriptor" + NL + "\t\t\t\t// end-extension-code" + NL
			+ "\t\t\t\t(((ComposeableAdapterFactory) adapterFactory)" + NL + "\t\t\t\t\t\t.getRootAdapterFactory(),"
			+ NL + "\t\t\t\t\t\tgetResourceLocator()," + NL
			+ "\t\t\t\t\t\tgetString(\"_UI_ExtensionPoint_contributors_feature\")," + NL
			+ "\t\t\t\t\t\tgetString(\"_UI_ExtensionPoint_contributors_description\")," + NL
			+ "\t\t\t\t\t\tPlatformPackage.Literals.EXTENSION_POINT__CONTRIBUTORS," + NL
			+ "\t\t\t\t\t\ttrue, true, false, null, null," + NL + "\t\t\t\t\t\t// begin-extension-code" + NL
			+ "\t\t\t\t\t\tnull));" + NL + "\t\t// end-extension-code";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;

	public ExtensionPointItemProvider_AddContributorsPropertyDescriptor() {
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

		List<Object> genFeatureList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> genClassList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> genPackageList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> genModelList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> _ListList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object genFeatureParameter : genFeatureList) {
			for (Object genClassParameter : genClassList) {
				for (Object genPackageParameter : genPackageList) {
					for (Object genModelParameter : genModelList) {
						for (Object _ListParameter : _ListList) {

							this.genFeature = (org.eclipse.emf.codegen.ecore.genmodel.GenFeature) genFeatureParameter;
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
			parameterValues.put("genFeature", this.genFeature);
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
		parameters.put("genFeature", this.genFeature);
		parameters.put("genClass", this.genClass);
		parameters.put("genPackage", this.genPackage);
		parameters.put("genModel", this.genModel);
		parameters.put("_List", this._List);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return (genClass.getName().equals("ExtensionPoint") && genFeature.getName().equals("contributors"));
	}
}