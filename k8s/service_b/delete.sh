#!/usr/bin/env bash

#NO se borra el service por la ip en envoy config
kubectl delete -f resources/service-monitor.yaml
kubectl delete -f resources/deployment.yaml
kubectl delete -f config/service_b.yaml