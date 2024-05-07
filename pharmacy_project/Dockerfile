FROM openjdk:22-jdk-alpine

WORKDIR /pharmacy_project

VOLUME /tmp

COPY target/pharmacy_project-0.0.1-SNAPSHOT.jar /pharmacy_project/pharmacy_project.jar

EXPOSE 6001

ENTRYPOINT ["java", "-jar", "pharmacy_project.jar"]