FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} assignment.jar
ENTRYPOINT ["java","-jar","/assignment.jar"]