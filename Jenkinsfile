pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'openjdk-jdk14-latest'
  }
  stages {
    stage('Package introspector addon') {
      steps {
      	wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
        	sh 'mvn  -Dmaven.test.failure.ignore=true clean verify -P introspector -e -f pom.xml'
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
  }
}
