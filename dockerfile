FROM openjdk:8-jdk-alpine
MAINTAINER Houssem
copy sis-2.7.6.jar docker-sis-2.7.6.jar
ENTRYPOINT ["java","-jar","/docker-sis-2.7.6.jar"]
