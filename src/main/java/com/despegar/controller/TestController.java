package com.despegar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @RequestMapping("/")
    public String home() throws UnknownHostException {
        System.out.println("HomeService");
        return "Spring boot is working in " + InetAddress.getLocalHost().getHostName();
    }

}
