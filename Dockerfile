FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY calculator.jar /app/calculator.jar
COPY calculator.sh /app/calculator.sh

RUN chmod +x /app/calculator.sh

ENTRYPOINT ["/app/calculator.sh"]
