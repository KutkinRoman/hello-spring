FROM openjdk:19-jdk-slim
COPY /target/hello-spring-0.0.1-SNAPSHOT.jar hello-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","hello-spring-0.0.1-SNAPSHOT.jar"]

FROM maven:3-amazoncorretto-19 AS maven
LABEL MAINTAINER="spring@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app

RUN mvn package

FROM openjdk:19-alpine

ARG JAR_FILE=hello-spring-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

ENTRYPOINT ["java","-jar","hello-spring-0.0.1-SNAPSHOT.jar"]