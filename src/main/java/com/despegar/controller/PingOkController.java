package com.despegar.controller;

import com.despegar.connector.ServiceConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingOkController {

    @Autowired
    private ServiceConnector serviceController;

    @RequestMapping("/pingOk")
    public String pingOk() {
        return (String)serviceController.pingServiceOk().getBody();
    }
}
