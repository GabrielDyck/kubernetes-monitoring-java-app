package com.despegar.connector;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceConnector {

    private String server = "http://"+System.getenv("ip")+":80";
    private RestTemplate rest;
    private HttpHeaders headers;

    public ServiceConnector() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
    }

    public ResponseEntity pingServiceOk() {
        HttpEntity<String> requestEntity = new HttpEntity<String>("",headers);
        ResponseEntity<String> responseEntity = rest.exchange(server + "/", HttpMethod.GET, requestEntity, String.class);
        return responseEntity;

    }


    public ResponseEntity pingServiceError() {
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        return rest.exchange(server  + "/errorException", HttpMethod.GET, requestEntity, String.class);

    }
}


