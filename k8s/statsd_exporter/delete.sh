#!/usr/bin/env bash

#NO se borra el service por la ip en envoy config
kubectl delete -f resources/
kubectl delete -f config/config.yaml