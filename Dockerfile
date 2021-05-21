FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ARG JAR_FILE=target/*.jar

#WORKDIR /myfolder

COPY ${JAR_FILE} application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]