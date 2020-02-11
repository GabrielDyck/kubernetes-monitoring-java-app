#!/usr/bin/env bash

kubectl exec -n monitoring monitoring-java-web-app-a-6bcdb66b4f-7jn47 -- curl 10.12.61.3:80/pingOk