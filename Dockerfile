FROM openjdk:8
ADD /target/group-request-0.0.1-SNAPSHOT.jar group-request-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "group-request-0.0.1-SNAPSHOT.jar"]

EXPOSE 8087
