FROM openjdk:17-jdk-slim
WORKDIR /app
COPY ./target/printecTask-0.0.1-SNAPSHOT.jar /app/printecTask-0.0.1-SNAPSHOT.jar
EXPOSE 8080
EXPOSE 3306
CMD ["java", "-jar", "/app/printecTask-0.0.1-SNAPSHOT.jar"]