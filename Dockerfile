FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/calculator-0.0.1-SNAPSHOT.jar /app/calculator.jar

ENTRYPOINT ["java","-jar","/app/calculator.jar"]
