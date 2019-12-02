FROM openjdk:8

COPY ./target/monitoring-java-web-app-1.0-SNAPSHOT.jar /usr/src/app/
COPY ./prometheus /usr/src/app/

EXPOSE 8080 9090
WORKDIR /usr/src/app
CMD java -javaagent:jmx_prometheus_javaagent-0.12.0.jar=9090:config.yaml -jar monitoring-java-web-app-1.0-SNAPSHOT.jar
