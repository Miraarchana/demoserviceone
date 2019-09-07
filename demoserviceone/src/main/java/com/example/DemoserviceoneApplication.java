package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoserviceoneApplication {
//	@Bean
//	public RestTemplate getRestTemplate() {//this is executed only once
//		return new RestTemplate();
//	}//alternate to REstTemplateBuilder
	public static void main(String[] args) {
		SpringApplication.run(DemoserviceoneApplication.class, args);
	}

}
