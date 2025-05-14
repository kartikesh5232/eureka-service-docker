package com.example.eudiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuDiscoveryServiceApplication {



	
	public static void main(String[] args) {
		SpringApplication.run(EuDiscoveryServiceApplication.class, args);

		
	}

}
