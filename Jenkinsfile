pipeline {
  agent any

  tools {
    maven 'Maven3' // nom que tu as défini dans Jenkins > Global Tools
  }

  environment {
    SONARQUBE_ENV = 'SonarQube' // nom donné dans Jenkins > Configure System
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Report Tests') {
      steps {
        junit '**/target/surefire-reports/*.xml'
      }
    }

    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv("${SONARQUBE_ENV}") {
          sh 'mvn sonar:sonar'
        }
      }
    }
  }

  post {
    success {
      echo 'Pipeline terminée avec succès !'
    }
    failure {
      echo 'Erreur dans la pipeline. Vérifie les logs.'
    }
  }
}
