#!/usr/bin/env bash

kubectl apply -f config/service_a.yaml
kubectl apply -f resources/service.yaml
kubectl apply -f resources/