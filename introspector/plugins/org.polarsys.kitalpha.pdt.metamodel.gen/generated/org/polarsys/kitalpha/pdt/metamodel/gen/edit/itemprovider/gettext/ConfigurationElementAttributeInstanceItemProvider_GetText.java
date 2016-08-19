//Generated with EGF 1.3.0.v20150924-1035
package org.polarsys.kitalpha.pdt.metamodel.gen.edit.itemprovider.gettext;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class ConfigurationElementAttributeInstanceItemProvider_GetText
		extends org.eclipse.egf.emf.pattern.edit.call.ItemProvider.ItemProvidergetTextoverride {
	protected static String nl;

	public static synchronized ConfigurationElementAttributeInstanceItemProvider_GetText create(String lineSeparator) {
		nl = lineSeparator;
		ConfigurationElementAttributeInstanceItemProvider_GetText result = new ConfigurationElementAttributeInstanceItemProvider_GetText();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL + "\t\t/**" + NL + "\t\t * CUSTOM_CODE_BEGIN" + NL + "\t\t **/" + NL + "" + NL
			+ "\t\tString label = \"\";" + NL
			+ "\t\tConfigurationElementAttributeInstance CEAI = (ConfigurationElementAttributeInstance) object;" + NL
			+ "\t\tAbstractValue containedValue = CEAI.getContainedValue();" + NL + "\t\t" + NL
			+ "\t\tString value = \"\";" + NL + "\t\tif (containedValue != null) {" + NL
			+ "\t\t\tif (containedValue instanceof StringValue) {" + NL
			+ "\t\t\t\tvalue = ((StringValue) containedValue).getValue();" + NL
			+ "\t\t\t} else if (containedValue instanceof JavaClassValue) {" + NL
			+ "\t\t\t\tJavaClassValue javaClassValue = (JavaClassValue) containedValue;" + NL
			+ "\t\t\t\tvalue = javaClassValue.getClassName();" + NL
			+ "\t\t\t} else if (containedValue instanceof BooleanValue) {" + NL
			+ "\t\t\t\tvalue = Boolean.toString(((BooleanValue) containedValue)" + NL + "\t\t\t\t\t\t.isValue());" + NL
			+ "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif((CEAI.getName() != null)&&(!CEAI.getName().isEmpty()))" + NL
			+ "\t\t\tlabel = \"\" + CEAI.getName();" + NL + "\t\tif(CEAI.getType()!= null)" + NL
			+ "\t\t\tlabel += \" : \" + CEAI.getType();" + NL + "\t\t" + NL
			+ "\t\tif((value != null)&&(!value.isEmpty()))" + NL + "\t\t\tlabel += \" = \" + value;" + NL + "" + NL
			+ "\t\tif (label.length()>0)" + NL + "\t\t\tlabel = label+\" [Configuration Element Attribute Instance]\";"
			+ NL + "\t\telse" + NL + "\t\t\tlabel = \"[Configuration Element Attribute Instance]\";" + NL
			+ "\t\treturn label;" + NL + "\t\t/**" + NL + "\t\t * CUSTOM_CODE_END : []" + NL + "\t\t **/" + NL + NL;
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;

	public ConfigurationElementAttributeInstanceItemProvider_GetText() {
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

		genModel.addImport("org.polarsys.kitalpha.pdt.metamodel.model.platform.AbstractValue");
		genModel.addImport("org.polarsys.kitalpha.pdt.metamodel.model.platform.StringValue");
		genModel.addImport("org.polarsys.kitalpha.pdt.metamodel.model.platform.JavaClassValue");
		genModel.addImport("org.polarsys.kitalpha.pdt.metamodel.model.platform.BooleanValue");
		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return genClass.getName().equals("ConfigurationElementAttributeInstance");
	}
}