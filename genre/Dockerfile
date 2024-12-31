FROM amazoncorretto:17.0.3-alpine
LABEL authors="rahul"

ARG JAR_FILE=target/genre-1.0.0.jar

COPY ${JAR_FILE} genre.jar

EXPOSE 7001

ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "/genre.jar"]