package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoserviceoneController {
    private RestTemplate restTemplate;
	
	@Autowired
	public DemoserviceoneController(RestTemplateBuilder builder) {//alternate is create a bean of rest template and autowire it when needed.
	    this.restTemplate = builder.build();
	}
	
	@RequestMapping("/{name}")
	public String hello(@PathVariable("name") String name) {
		System.out.println("inside controller1");
		return restTemplate.getForObject("http://localhost:8082/"+name,String.class);
//		return "Hello "+ name;
	}

}
