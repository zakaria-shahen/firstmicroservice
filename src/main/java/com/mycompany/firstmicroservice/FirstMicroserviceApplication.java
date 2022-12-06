package com.mycompany.firstmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class FirstMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroserviceApplication.class, args);
	}

}
