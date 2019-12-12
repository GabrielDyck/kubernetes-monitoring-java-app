package com.despegar.connector;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class ServiceConnector {

    private String server = "http://"+System.getenv("ip")+":8080";
    private RestTemplate rest;
    private HttpHeaders headers;

    public ServiceConnector() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
    }

    public ResponseEntity pingServiceOk() throws UnknownHostException {
        System.out.println( InetAddress.getLocalHost().getHostName() + ": Starting to pingOk service " + server);
        HttpEntity<String> requestEntity = new HttpEntity<String>("",headers);
        ResponseEntity<String> responseEntity = rest.exchange(server + "/", HttpMethod.GET, requestEntity, String.class);
        System.out.println("Finish to ping with response body" + responseEntity.getBody());

        return responseEntity;

    }


    public ResponseEntity pingServiceError() throws UnknownHostException {
        System.out.println( InetAddress.getLocalHost().getHostName() + ": Starting to pingError service " + server);
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        return rest.exchange(server  + "/errorException", HttpMethod.GET, requestEntity, String.class);

    }
}


