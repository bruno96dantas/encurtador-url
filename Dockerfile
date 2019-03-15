FROM openjdk:8-jdk-alpine

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY ./target/encurtador-url-0.0.1-SNAPSHOT.jar /usr/src/app
EXPOSE 8082
CMD ["java", "-jar", "encurtador-url-0.0.1-SNAPSHOT.jar"]
