package com.despegar.controller;

import com.despegar.connector.ServiceConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class PingOkController {

    @Autowired
    private ServiceConnector serviceController;

    @RequestMapping("/pingOk")
    public String pingOk() throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostName() + ": Start pingOk method");
        return (String)serviceController.pingServiceOk().getBody();
    }
}
