#!/usr/bin/env bash

kubectl exec -n monitoring monitoring-java-web-app-a-7789446f57-2mwqs -- curl 10.12.11.197:80/pingOk