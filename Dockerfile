FROM openjdk:17-jdk-alpine

WORKDIR /app
COPY ./build/libs/eurekajar.jar ./eurekajar.jar

ENTRYPOINT ["java","-jar","eurekajar.jar"]
