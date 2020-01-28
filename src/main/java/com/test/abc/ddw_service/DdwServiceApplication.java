package com.test.abc.ddw_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DdwServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdwServiceApplication.class, args);
	}

}
