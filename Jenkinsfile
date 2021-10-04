pipeline {
	agent { label 'migration' }

	tools {
		maven 'apache-maven-latest'
		jdk 'openjdk-jdk14-latest'
	}
	environment {
	    JACOCO_VERSION = "0.8.6"
	    MVN_QUALITY_PROFILES = '-P introspector'
	    JACOCO_EXEC_FILE_PATH = '${WORKSPACE}/jacoco.exec'
	}
	stages {
		stage('Package Introspector Addon') {
			steps {
				wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
					script {
						def jacocoPrepareAgent = "-Djacoco.destFile=$JACOCO_EXEC_FILE_PATH -Djacoco.append=true org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:prepare-agent"
						sh 'mvn  -Dmaven.test.failure.ignore=true ${jacocoPrepareAgent} clean verify -P introspector -P sign -e -f pom.xml'					    
					}					
				}
			}
		}
		stage('Archive artifacts') {
			steps {
				archiveArtifacts artifacts: 'releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.all.site/target/PDTTooling_*.zip, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.docgen.site/target/PDTTooling_*.zip, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.model.site/target/PDTTooling_*.zip, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.modeler.site/target/PDTTooling_*.zip, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.site/target/PDTTooling_*.zip, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.all.site/target/repository/**, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.docgen.site/target/repository/**, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.model.site/target/repository/**, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.modeler.site/target/repository/**, releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.site/target/repository/**'
			}
		}
		stage('Deploy') {
			when {
				not { changeRequest() }
			}
			steps {
				sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
					sh '''
					echo "deploy update site"
					DST_DIR=/home/data/httpd/download.eclipse.org/kitalpha/addons/introspector/nightly/master
					ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DST_DIR}
					ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DST_DIR}
					ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DST_DIR}/updates/
					ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DST_DIR}/dropins/
					scp -r releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.all.site/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DST_DIR}/updates/
					scp -r releng/sites/introspector/org.polarsys.kitalpha.pdt.introspector.all.site/target/PDTTooling_All-dropins-*.zip genie.kitalpha@projects-storage.eclipse.org:${DST_DIR}/dropins/				
					'''
				}
			}
		}
		stage('Publish tests results') {
			steps {
				junit allowEmptyResults: true, testResults: '*.xml,**/target/surefire-reports/*.xml'
				sh "mvn -Djacoco.dataFile=$JACOCO_EXEC_FILE_PATH org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:report $MVN_QUALITY_PROFILES -e -f pom.xml"
			}
		}
		stage('Perform Sonar analysis') {
			environment {
			    PROJECT_NAME = 'kitalpha-addons'
	    		SONARCLOUD_TOKEN = credentials('sonar-token-kitalpha-addons')
			    SONAR_PROJECT_KEY = 'eclipse_kitalpha-addons'
			}
			steps {
				withEnv(['MAVEN_OPTS=-Xmx4g']) {
					script {
						def jacocoParameters = "-Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml -Dsonar.java.coveragePlugin=jacoco -Dsonar.core.codeCoveragePlugin=jacoco "
						def sonarExclusions = "-Dsonar.exclusions='**/generated/**/*.java,**/src-gen/**/*.java' "
						def javaVersion = "8"
						def sonarCommon = "sonar:sonar -Dsonar.projectKey=$SONAR_PROJECT_KEY -Dsonar.organization=eclipse -Dsonar.host.url=https://sonarcloud.io -Dsonar.login='$SONARCLOUD_TOKEN' -Dsonar.skipDesign=true -Dsonar.dynamic=reuseReports -Dsonar.java.source=${javaVersion} -Dsonar.scanner.force-deprecated-java-version=true "
						def sonarBranchAnalysis = "-Dsonar.branch.name=${BRANCH_NAME}"
						def sonarPullRequestAnalysis = ("${BRANCH_NAME}".contains('PR-') ? "-Dsonar.pullrequest.provider=GitHub -Dsonar.pullrequest.github.repository=eclipse/$PROJECT_NAME -Dsonar.pullrequest.key=${CHANGE_ID} -Dsonar.pullrequest.branch=${CHANGE_BRANCH}" : "" )
						def sonar = sonarCommon + jacocoParameters + sonarExclusions + ("${BRANCH_NAME}".contains('PR-') ? sonarPullRequestAnalysis : sonarBranchAnalysis)
						sh "mvn ${sonar} $MVN_QUALITY_PROFILES -e -f pom.xml"
					}
				}
			}
		}
	}
}
