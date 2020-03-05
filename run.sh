#!/usr/bin/env bash
mvn clean package spring-boot:repackage
java -javaagent:./prometheus/jmx_prometheus_javaagent-0.12.0.jar=9800:./prometheus/config.yaml -jar ./target/monitoring-java-web-app-1.0-SNAPSHOT.jar
