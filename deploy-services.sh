#!/usr/bin/env bash


kubectl apply -f k8s/service_a/config/service_a.yaml
kubectl apply -f k8s/service_a/resources/service.yaml
kubectl apply -f k8s/service_a/resources/




kubectl apply -f k8s/service_b/config/service_b.yaml
kubectl apply -f k8s/service_b/resources/service.yaml
kubectl apply -f k8s/service_b/resources/