# Dockerfile
FROM openjdk:20-slim-bullseye


WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN mvn package -DskipTests

COPY ./target/parking-control-0.0.1-SNAPSHOT.jar parking-control-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "parking-control-0.0.1-SNAPSHOT.jar"]