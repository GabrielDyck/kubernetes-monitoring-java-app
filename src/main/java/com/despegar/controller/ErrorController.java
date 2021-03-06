package com.despegar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class ErrorController {
    private static final String PATH = "/errorException";
    @RequestMapping(value = PATH)
    public String error() throws Exception {
        System.out.println(InetAddress.getLocalHost().getHostName()+ ": Throwing error");
        throw new Exception();
    }
}
