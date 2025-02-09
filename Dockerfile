FROM eclipse-temurin:17.0.14_7-jre-jammy

WORKDIR /app

COPY build/libs/Nikke-Hub-Eureka-Server-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app/app.jar"]