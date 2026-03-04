FROM openjdk:17

WORKDIR /app

COPY calculator.jar calculator.jar

CMD ["java","-jar","calculator.jar"]
