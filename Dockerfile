FROM openjdk:21-jdk-slim
EXPOSE 8080
ADD target/h2-dock.jar h2-dock.jar
ENTRYPOINT ["java","-jar","/h2-dock.jar"]