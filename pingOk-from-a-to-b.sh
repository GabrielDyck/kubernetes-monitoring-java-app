#!/usr/bin/env bash
kubectl exec -n monitoring monitoring-java-web-app-b-bcd994cc7-bjgwt -- curl 10.12.1.111:80/
