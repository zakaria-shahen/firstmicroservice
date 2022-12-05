package com.mycompany.firstmicroservice;

import com.mycompany.firstmicroservice.model.License;
import com.mycompany.firstmicroservice.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DateLoader implements ApplicationRunner {

    private final LicenseService licenseService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        licenseService.create(License.builder()
                        .licenseId("1dfd")
                        .description("any")
                .build());
    }
}
