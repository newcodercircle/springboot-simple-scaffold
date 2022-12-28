FROM openjdk:17
WORKDIR /app
COPY build/libs/springboot-simple-scaffold-0.0.1-SNAPSHOT.jar /app/simple-scaffold.jar
ENTRYPOINT ["java","-jar","/app/simple-scaffold.jar"]
