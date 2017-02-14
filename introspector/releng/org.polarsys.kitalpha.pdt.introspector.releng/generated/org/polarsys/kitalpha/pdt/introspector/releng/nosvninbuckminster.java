//Generated with EGF 1.4.1.v20161010-1704
package org.polarsys.kitalpha.pdt.introspector.releng;

import org.eclipse.egf.portfolio.eclipse.build.PropertyWrapper;
import org.eclipse.egf.portfolio.eclipse.build.PropertiesHelper;
import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class nosvninbuckminster extends org.eclipse.egf.portfolio.eclipse.build.buckminster.buildxml {
	protected static String nl;

	public static synchronized nosvninbuckminster create(String lineSeparator) {
		nl = lineSeparator;
		nosvninbuckminster result = new nosvninbuckminster();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "    <target name=\"install.buckminster\">" + NL
			+ "        <available file=\"${tools}/buckminster/buckminster\" property=\"buckminster.exists\" />" + NL
			+ "        <antcall target=\"do.install.buckminster\" />" + NL + "\t</target>" + NL + "\t" + NL
			+ "    <target name=\"do.install.buckminster\" unless=\"buckminster.exists\" depends=\"install.director\">"
			+ NL + "        <echo message=\"Configuring headless buckminster with needed features\" />" + NL
			+ "        <echo message=\"Headless site: ${bm.headless.site}\" />" + NL
			+ "        <echo message=\"External site: ${bm.external.site}\" />" + NL
			+ "        <eclipse.launch app=\"director\">" + NL + "            <args>" + NL
			+ "                <jvmarg value=\"-Declipse.p2.mirrors=false\" />" + NL
			+ "                <arg value=\"-r\" />" + NL + "                <arg value=\"${bm.headless.site}\" />" + NL
			+ "                <arg value=\"-r\" />" + NL + "                <arg value=\"${bm.external.site}\" />" + NL
			+ "                <arg value=\"-r\" />" + NL + "                <arg value=\"${polarion.site}\" />" + NL
			+ "                <arg value=\"-d\" />" + NL + "                <arg value=\"${tools}/buckminster\" />"
			+ NL + "                <arg value=\"-p\" />" + NL + "                <arg value=\"Buckminster\" />" + NL
			+ "                <arg value=\"-i\" />" + NL
			+ "                <arg value=\"org.eclipse.buckminster.cmdline.product\" />" + NL
			+ "                <arg value=\"-i\" />" + NL
			+ "                <arg value=\"org.eclipse.buckminster.core.headless.feature.feature.group\" />" + NL
			+ "                <arg value=\"-i\" />" + NL
			+ "                <arg value=\"org.eclipse.buckminster.pde.headless.feature.feature.group\" />" + NL
			+ "                <arg value=\"-i\" />" + NL
			+ "                <arg value=\"org.eclipse.buckminster.emma.headless.feature.feature.group\" />" + NL
			+ "            </args>" + NL + "        </eclipse.launch>" + NL + "    </target>" + NL;
	protected final String TEXT_2 = "\t<macrodef name=\"egf\">" + NL
			+ "        <attribute name=\"workspace\" default=\"${workspace}\" />" + NL
			+ "        <element name=\"activities\" />" + NL + "        <element name=\"globargs\" optional=\"true\" />"
			+ NL + "        <element name=\"cmdargs\" optional=\"true\" />" + NL + "        <sequential>" + NL
			+ "            <eclipse.launch app=\"egf\">" + NL + "                <args>" + NL
			+ "                    <arg value=\"-application\" />" + NL
			+ "                    <arg value=\"org.eclipse.egf.application.activity\" />" + NL
			+ "                    <arg value=\"-consoleLog\" />" + NL + "                    <arg value=\"-data\" />"
			+ NL + "                    <arg value=\"@{workspace}\" />" + NL + "                    <globargs />" + NL
			+ "                    <arg value=\"-runtime\" />" + NL
			+ "                    <arg value=\"-activities\" />" + NL + "                    <activities />" + NL
			+ "                    <cmdargs />" + NL + "                </args>" + NL + "            </eclipse.launch>"
			+ NL + "        </sequential>" + NL + "    </macrodef>";
	protected final String TEXT_3 = "    <!-- This macro executes the default application of an eclipse installation that resides"
			+ NL + "         in the folder ${buildtools}/@app" + NL + "      -->" + NL
			+ "    <macrodef name=\"eclipse.launch\">" + NL + "        <attribute name=\"app\" />" + NL
			+ "        <attribute name=\"workspace\" default=\"${workspace}\" />" + NL
			+ "        <element name=\"args\" optional=\"true\" />" + NL + "        <sequential>" + NL
			+ "            <!-- We assume that the eclipse installation is beneath ${tools} -->" + NL
			+ "            <property name=\"@{app}.deploy.dir\" value=\"${tools}/@{app}\" />" + NL + "" + NL
			+ "            <!-- Find the Eclipse launcher and assing its location to the @{app}.launcher property -->"
			+ NL + "            <pathconvert property=\"@{app}.launcher\">" + NL + "                <first count=\"1\">"
			+ NL + "                    <sort>" + NL
			+ "                        <fileset dir=\"${@{app}.deploy.dir}/plugins\" includes=\"**/org.eclipse.equinox.launcher_*.jar\" />"
			+ NL + "                        <reverse xmlns=\"antlib:org.apache.tools.ant.types.resources.comparators\">"
			+ NL + "                            <date />" + NL + "                        </reverse>" + NL
			+ "                    </sort>" + NL + "                </first>" + NL + "            </pathconvert>" + NL
			+ "" + NL + "\t\t\t<!-- Copy Eclipse Variables preferences -->" + NL
			+ "\t\t\t<copy file=\"${relengDir}/templates/org.eclipse.core.variables.prefs\"" + NL
			+ "\t\t\t\ttoFile=\"@{workspace}/.metadata/.plugins/org.eclipse.core.runtime/.settings/org.eclipse.core.variables.prefs\"/>"
			+ NL + "\t\t\t\t" + NL + "\t\t\t<!-- Copy Eclipse JDT preferences -->" + NL
			+ "\t\t\t<copy file=\"${relengDir}/templates/org.eclipse.jdt.core.prefs\"" + NL
			+ "\t\t\t\ttoFile=\"@{workspace}/.metadata/.plugins/org.eclipse.core.runtime/.settings/org.eclipse.jdt.core.prefs\"/>"
			+ NL + "" + NL + "            <!-- Launch the eclipse application -->" + NL
			+ "            <java fork=\"true\" jar=\"${@{app}.launcher}\" dir=\"${@{app}.deploy.dir}\" failonerror=\"true\">";
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL + "\t                <jvmarg value=\"-DrelengDir=relengDir\"/>";
	protected final String TEXT_6 = NL + "\t                <jvmarg value=\"-D";
	protected final String TEXT_7 = "=${";
	protected final String TEXT_8 = "}\"/>";
	protected final String TEXT_9 = NL + "                    <arg value=\"-data\" />" + NL
			+ "                    <arg value=\"@{workspace}\" />" + NL + "                <args />" + NL
			+ "            </java>" + NL + "        </sequential>" + NL + "    </macrodef>";
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL;

	public nosvninbuckminster() {
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

		List<Object> jobList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object jobParameter : jobList) {

			this.job = (org.eclipse.egf.portfolio.eclipse.build.buildcore.Job) jobParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

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

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("job", this.job);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("job", this.job);
		return parameters;
	}

	protected void method_install_buckminster(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "install_buckminster", stringBuffer.toString());
	}

	protected void method_egf(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_2);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "egf", stringBuffer.toString());
	}

	protected void method_eclipse_launch(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_3);
		stringBuffer.append(TEXT_4);
		{
			//<%@ egf:patternCall
			//	patternId="platform:/plugin/org.eclipse.egf.portfolio.eclipse.build/egf/Build.fcore#LogicalName=org.eclipse.egf.portfolio.eclipse.build.buckminster.call.build.xml.Xmx"
			//%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.eclipse.egf.portfolio.eclipse.build/egf/Build.fcore#_VCSRcJ5MEd-3wvN5SnesGA",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_5);
		for (PropertyWrapper propertyWrapper : new PropertiesHelper().getRuntimeProperties(job)) {
			stringBuffer.append(TEXT_6);
			stringBuffer.append(propertyWrapper.getKey());
			stringBuffer.append(TEXT_7);
			stringBuffer.append(propertyWrapper.getKey());
			stringBuffer.append(TEXT_8);
		}
		stringBuffer.append(TEXT_9);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "eclipse_launch", stringBuffer.toString());
	}
}