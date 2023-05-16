FROM amazoncorretto:11-alpine-jdk
MAINTAINER michaelhelvig
COPY target/mgh-0.0.1-SNAPSHOT.jar michaelhelvig-app.jar
ENTRYPOINT ["java","-jar","/michaelhelvig-app.jar"]