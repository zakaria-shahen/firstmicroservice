package com.mycompany.firstmicroservice;

import com.mycompany.firstmicroservice.config.ConfigApp;
import com.mycompany.firstmicroservice.model.License;
import com.mycompany.firstmicroservice.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DateLoader implements ApplicationRunner {

    private final LicenseService licenseService;

    private final Logger logger = LoggerFactory.getLogger(DateLoader.class);

    private final ConfigApp configApp;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.info(configApp.getProps());

        licenseService.create(License.builder()
                        .licenseId("1dfd")
                        .description("any")
                .build());
    }
}
