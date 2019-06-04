package com.ohiohealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PatientInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientInfoServiceApplication.class, args);
	}

}
