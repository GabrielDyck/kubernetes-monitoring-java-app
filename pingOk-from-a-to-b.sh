#!/usr/bin/env bash

kubectl exec -n monitoring monitoring-java-web-app-a-7556ccdd76-2tsp2 -- curl 10.12.11.197:80/pingOk