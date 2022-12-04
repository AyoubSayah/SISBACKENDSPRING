FROM openjdk:8-jdk-alpine
MAINTAINER Houssem
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-app.jar
ENTRYPOINT ["java","-jar","/docker-app.jar"]
