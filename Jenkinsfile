#!groovy

pipeline {
    agent any

    stages {

        stage("Verify Tooling") {
            steps {
                sh 'docker version'
                sh 'docker-compose version'
            }
        }

        stage("Build and Publish Image") {
            steps {
                echo 'Build and Publish Image start'
                echo 'Build and Publish Image start'
            }
        }

        stage('Deploy on Server') {
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
