FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/calculator.jar /app/calculator.jar

ENTRYPOINT ["java","-jar","/app/calculator.jar"]
