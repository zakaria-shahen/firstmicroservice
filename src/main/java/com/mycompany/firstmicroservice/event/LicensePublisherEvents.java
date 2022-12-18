package com.mycompany.firstmicroservice.event;

import com.mycompany.firstmicroservice.event.model.LicenseMessageEventModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
@Slf4j
public class LicensePublisherEvents {

    @Bean
    public Supplier<LicenseMessageEventModel> createLicenseEvent() {

        return () -> {
            log.debug("createLicenseEvent Bean: Scheduled message sent (every minute)");

            return new LicenseMessageEventModel(
                    LicenseMessageEventModel.class.getTypeName(),
                    eventAction.CREATE.name(),
                    "1");
        };

    }

    public enum eventAction {
        CREATE,
        UPDATE,
        DELETE
    }

}
