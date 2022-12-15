package com.mycompany.firstmicroservice.controller;


import com.mycompany.firstmicroservice.event.model.LicenseMessageEventModel;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final StreamBridge streamBridge;

    private final Supplier<LicenseMessageEventModel> createLicenseEvent;

    @GetMapping("/")
    public String get() {

        System.out.println(streamBridge.send("createLicenseEvent-out-0",  createLicenseEvent));

        return "Hello, Microservice";

    }

}
