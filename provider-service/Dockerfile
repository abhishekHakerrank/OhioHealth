FROM openjdk:latest
ADD target/provider-service.jar provider-service.jar
ENTRYPOINT ["java","-jar","provider-service.jar"]
EXPOSE 7000