node {

  stage("Build") {
    sh "docker-compose -f /root/docker-files/hello-spring.yml build"
  }

  stage("Push") {
    sh "docker-compose -f /root/docker-files/hello-spring.yml push"
  }

  stage("Deployment") {

    stage("Deployment") {
      sh 'docker-compose -f /root/docker-files/hello-spring.yml down'
      sh 'docker-compose -f /root/docker-files/hello-spring.yml pull'
      sh 'docker-compose -f /root/docker-files/hello-spring.yml up -d'
    }
  }
}