pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Hello'
      }
    }

    stage('Test') {
      steps {
        sleep 10
        sh '''
pwd'''
      }
    }

  }
}