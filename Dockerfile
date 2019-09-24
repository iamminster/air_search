FROM openjdk:8-jdk-alpine
# ENV 
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/air_search-0.0.1-SNAPSHOT.jar /app/air_search-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/app/air_search-0.0.1.jar"]