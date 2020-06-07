package com.code4fun.jwtexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello_world")
    public String getMessage(){
        System.out.println("JWT Example");
        return "JWT_example";
    }
}
