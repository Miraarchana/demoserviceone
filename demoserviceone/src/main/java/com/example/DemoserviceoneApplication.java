package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class DemoserviceoneApplication {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {//this is executed only once
		return new RestTemplate();
	}//alternate to REstTemplateBuilder
	public static void main(String[] args) {
		SpringApplication.run(DemoserviceoneApplication.class, args);
	}

}
