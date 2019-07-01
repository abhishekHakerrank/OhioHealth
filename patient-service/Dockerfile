FROM openjdk:latest
ADD target/patient-service.jar patient-service.jar
ENTRYPOINT ["java","-jar","patient-service.jar"]
EXPOSE 7001