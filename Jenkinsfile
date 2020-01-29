pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'oracle-jdk8-latest'
  }
  stages {
    stage('Package introspector addon') {
      steps {
      	wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
        	sh 'mvn  -Dmaven.test.failure.ignore=true clean verify  -e -f pom.xml'
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
				ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/capellastudio/updates/nightly/master
				ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/capellastudio/updates/nightly/master
				scp -r releng/plugins/org.polarsys.capella.studio.releng.updatesite/target/repository/* genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/capellastudio/updates/nightly/master
				
				echo "deploy product"
				ssh genie.capella@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/capella/capellastudio/products/nightly/master
				ssh genie.capella@projects-storage.eclipse.org mkdir -p /home/data/httpd/download.eclipse.org/capella/capellastudio/products/nightly/master
				scp -r releng/plugins/org.polarsys.capella.studio.releng.product/target/products/*.zip genie.capella@projects-storage.eclipse.org:/home/data/httpd/download.eclipse.org/capella/capellastudio/products/nightly/master
			  
            '''
        }
      }
    }
  }
  post {
    always {
       archiveArtifacts artifacts: '**/*.log,**/*.layout'
       junit '**/target/surefire-reports/*.xml'
    }
  }
  
}