package com.example.stockplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // Required
public class SpringDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDiscoveryApplication.class, args);
	}

}
