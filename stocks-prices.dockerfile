FROM adoptopenjdk/openjdk11:alpine
RUN apk update
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} stocks-prices-ms.jar
ENV ENV_HOST=stocks-prices-ms
ENV ENV_PORT=7400
ENTRYPOINT ["java","-jar","/stocks-prices-ms.jar"]