package com.despegar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    private static final String PATH = "/errorException";
    @RequestMapping(value = PATH)
    public String error() throws Exception {
        throw new Exception();
    }
}
