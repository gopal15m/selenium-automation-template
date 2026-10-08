pipeline {
  agent any
  parameters { choice(name:'ENV', choices:['qa','uat'], description:'Environment'); choice(name:'BROWSER', choices:['chrome','firefox'], description:'Browser') }
  stages {
    stage('Compile') { steps { sh 'mvn -B -DskipTests compile' } }
    stage('Smoke') { steps { sh "mvn -B test -P${params.ENV} -Dbrowser=${params.BROWSER} -Dheadless=true -DsuiteXmlFile=src/test/resources/suites/smoke.xml" } }
  }
  post { always { archiveArtifacts artifacts: 'target/evidence/**', allowEmptyArchive: true; junit allowEmptyResults: true, testResults: 'target/surefire-reports/junitreports/*.xml' } }
}
