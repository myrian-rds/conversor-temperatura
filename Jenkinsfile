pipeline {
    agent { docker { image 'maven:3.8.5-jdk-11' } }
      stages {
        stage('log version info') {
      steps {
        sh 'mvn --version'
        sh 'mvn -B -f ./java-project/pom.xml install'
      }
    }
  }
}