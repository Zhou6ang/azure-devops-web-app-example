FROM alpine:3.19

# Install required packages
RUN apk update \
    && apk upgrade \
    && apk add --update openjdk11-jre curl unzip bash

# Set working directory
WORKDIR /app

COPY target/*.jar /app/app.jar

ENV MY_ENV=xxx

EXPOSE 8888

CMD java -jar /app/app.jar --server.port=8888
