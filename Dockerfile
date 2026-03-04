FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY calculator.jar calculator.jar

CMD ["java","-jar","calculator.jar"]
