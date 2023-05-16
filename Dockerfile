FROM amazoncorretto:11-alpine-jdk
MAINTAINER mgh
COPY target/mgh-0.0.1-SNAPSHOT.jar  mgh-app.jar
ENTRYPOINT ["java","-jar","/mgh-app.jar"]