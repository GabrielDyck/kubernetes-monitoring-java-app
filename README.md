# kubernetes-monitoring-java-app


## Run locally

mvn clean package spring-boot:repackage

java -javaagent:./prometheus/jmx_prometheus_javaagent-0.12.0.jar=9090:./prometheus/config.yaml -jar ./target/monitoring-java-web-app-1.0-SNAPSHOT.jar



## Run in docker

docker build .

docker run -d --network host -p 9090:9090 -p 8080:8080 monitoring-java-web-app:latest


## Build and push in docker
docker build . -t  gabrieldyck/monitoring-java-web-app:latest
docker push gabrieldyck/monitoring-java-web-app:latest


## Run in k8s

En la carpeta k8s ejecutar ./deploy-sh para crear el deployment. Para el clean-up ejecutar ./delete-all.sh








## Para sherlockube 

https://www.envoyproxy.io/docs/envoy/latest/configuration/upstream/cluster_manager/cluster_stats







## Prueba de envoy

Levantar el servicio B.
Levantar el servicio A.
Correr el siguiente comando
k exec -n monitoring monitoring-java-web-app-a-<saraza> -- curl <ip_del_pod_seleccionado>:8080/<algun-endpoint>{Ej:pingError}

