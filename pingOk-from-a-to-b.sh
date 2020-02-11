#!/usr/bin/env bash

kubectl exec -n monitoring monitoring-java-web-app-a-9b977855b-vzkcb -- curl 10.12.12.194:80/pingOk