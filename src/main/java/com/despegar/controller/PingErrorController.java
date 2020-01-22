package com.despegar.controller;

import com.despegar.connector.ServiceConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class PingErrorController {


    @Autowired
    private ServiceConnector serviceController;

    @RequestMapping("/pingError")
    public String pingError() throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostName() + ": Starting to pingError");
        return (String) serviceController.pingServiceError().getBody();
    }


    @RequestMapping("/pingNotFound")
    public String pingNotFound() throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostName() + ": Starting to pingNotFound");
        return (String) serviceController.pingNotFound().getBody();
    }

}

