package com.mycompany.firstmicroservice.event;

import com.mycompany.firstmicroservice.event.model.LicenseMessageEventModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class LicensePublisherEvents {


    @Bean
    public Supplier<LicenseMessageEventModel> createLicenseEvent() {

        return () -> new LicenseMessageEventModel(
                LicenseMessageEventModel.class.getTypeName(),
                eventAction.CREATE.name(),
                "1");

    }

    enum eventAction {
        CREATE,
        UPDATE,
        DELETE
    }

}
