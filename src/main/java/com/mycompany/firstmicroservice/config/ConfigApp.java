package com.mycompany.firstmicroservice.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "test")
@Component
@Getter
@Setter
public class ConfigApp {

     private String props;

}
