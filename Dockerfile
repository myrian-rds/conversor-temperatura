# syntax=docker/dockerfile:1

FROM maven:3.8.5-jdk-11

WORKDIR /app

COPY . .
RUN mvn -B -f ./java-project/pom.xml install