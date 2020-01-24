#!/usr/bin/env bash
kubectl exec -n monitoring monitoring-java-web-app-a-6595d99789-fsbv4 -- curl 10.12.58.164:80/pingError
