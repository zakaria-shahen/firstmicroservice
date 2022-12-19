package com.mycompany.firstmicroservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain jwtConfig(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeRequests().anyRequest().authenticated();
        httpSecurity.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);

        return httpSecurity.build();
    }
}
