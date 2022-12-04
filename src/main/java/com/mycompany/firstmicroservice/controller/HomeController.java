package com.mycompany.firstmicroservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String get() {

        return "Hello, Microservice";

    }

}
