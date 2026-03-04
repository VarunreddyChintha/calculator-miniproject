FROM amd64/openjdk:27-ea-jdk-oraclelinux9

WORKDIR /app

# Copy the calculator.sh script into the container
COPY calculator.jar /app/calculator.jar

CMD ["java","-jar","/calculator.jar"]
