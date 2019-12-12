Up and Running


kubectl apply -f resource/generated-manifest.yaml


kubectl apply -f setup/ ##Apply del setup de sherlockube


kubectl label namespace monitoring istio-injection=enabled


Deployar el gateway y virtualservice de service_a

Deployar los servicios service_a y service_b

export INGRESS_HOST=$(minikube ip)

export INGRESS_PORT=$(kubectl -n istio-system get service istio-ingressgateway -o jsonpath='{.spec.ports[?(@.name=="http2")].nodePort}')

export SECURE_INGRESS_PORT=$(kubectl -n istio-system get service istio-ingressgateway -o jsonpath='{.spec.ports[?(@.name=="https")].nodePort}')

export GATEWAY_URL=$INGRESS_HOST:$INGRESS_PORT

