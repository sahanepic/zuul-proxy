package com.sahanbcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class HospitalGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalGetwayApplication.class, args);
	}



}
