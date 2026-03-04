FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY calculator.jar /app/calculator.jar


EXPOSE 8082

CMD ["java","-jar","calculator.jar"]
