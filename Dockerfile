FROM eclipse-temurin:17-jdk-jammy

# Install dos2unix utility
RUN apt-get update && apt-get install -y dos2unix

# Set working directory
WORKDIR /app

# Copy jar and script
COPY calculator.jar /app/calculator.jar
COPY calculator.sh /app/calculator.sh

# Convert script to unix format
RUN dos2unix /app/calculator.sh

# Give execute permission
RUN chmod +x /app/calculator.sh

# Run script automatically
CMD ["bash","/app/calculator.sh"]
