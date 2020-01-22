#!/usr/bin/env bash
kubectl exec -n monitoring monitoring-java-web-app-a-6595d99789-52wcs -- curl 10.12.2.70:80/
