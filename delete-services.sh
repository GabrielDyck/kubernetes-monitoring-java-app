#!/usr/bin/env bash

kubectl delete -f k8s/service_a/resources/service-monitor.yaml
kubectl delete -f k8s/service_a/resources/deployment.yaml
kubectl delete -f k8s/service_a/config/service_a.yaml

kubectl delete -f k8s/service_b/resources/service-monitor.yaml
kubectl delete -f k8s/service_b/resources/deployment.yaml
kubectl delete -f k8s/service_b/config/service_b.yaml

