FROM openjdk:19-jdk-slim
COPY /target/hello-spring-0.0.1-SNAPSHOT.jar hello-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","hello-spring-0.0.1-SNAPSHOT.jar"]