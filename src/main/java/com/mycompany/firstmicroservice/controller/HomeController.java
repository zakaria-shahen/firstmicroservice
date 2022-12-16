package com.mycompany.firstmicroservice.controller;


import com.mycompany.firstmicroservice.event.LicensePublisherEvents;
import com.mycompany.firstmicroservice.event.model.LicenseMessageEventModel;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final StreamBridge streamBridge;

    @GetMapping("/")
    public String get() {

        return "Hello, Microservice"+ "\nsend kafka message: " +
                streamBridge.send("createLicenseEvent-out-0",
                        new LicenseMessageEventModel(
                        LicenseMessageEventModel.class.getTypeName(),
                        LicensePublisherEvents.eventAction.CREATE.name(),
                        "1")
                );

    }

}
