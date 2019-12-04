package com.despegar.controller;

import com.despegar.connector.ServiceConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingErrorController {


    @Autowired
    private ServiceConnector serviceController;

    @RequestMapping("/pingError")
    public String pingOk() {
        return (String) serviceController.pingServiceError().getBody();
    }
}

