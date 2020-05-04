FROM maven:3.6.3-jdk-8-slim AS BUILD

COPY . /app/
WORKDIR /app/
RUN mvn package spring-boot:repackage
COPY ./prometheus /usr/src/app/


FROM maven:3.6.3-jdk-8-slim AS FINAL
EXPOSE 8080 9800
WORKDIR /usr/src/app

CMD java -javaagent:jmx_prometheus_javaagent-0.12.0.jar=9800:config.yaml -jar monitoring-java-web-app-1.0-SNAPSHOT.jar