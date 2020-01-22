#!/usr/bin/env bash
kubectl exec -n monitoring monitoring-java-web-app-a-6595d99789-hxz4j -- curl 10.12.15.75:80/
