#!groovy

pipeline {

  agent any

  stages {

    stage("Build and Publish Image") {

      steps {
        echo 'Build and Publish Image start'
//        sh "docker build -t docker.ensoft.local/${IMAGE} "
//        sh "docker push docker.ensoft.local/${IMAGE}:latest"
        echo 'Build and Publish Image start'
      }

    }

    stage('Deploy on dev server') {

      steps {
        echo 'Deploy start'
        sh 'sudo docker-compose -f /root/docker-files/hello-spring.yml stop'
        sh 'sudo docker-compose -f /root/docker-files/hello-spring.yml pull'
        sh 'sudo docker-compose -f /root/docker-files/hello-spring.yml up -d'
        echo 'Deploy  end'
      }

    }

  }

}
