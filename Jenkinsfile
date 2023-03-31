#!groovy

pipeline {

  agent any

  stages {

    stage("Build and Publish Image") {

      steps {
        echo 'Build and Publish Image on develop start'
        sh "docker build -t docker.ensoft.local/${IMAGE} "
        sh "docker push docker.ensoft.local/${IMAGE}:latest"
        echo 'Build and Publish Image on develop end'
      }
    }

  }

}