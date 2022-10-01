package com.naveen.basic.naveen.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NaveenSvc {

	public static void main(String[] args) {
		System.setProperty("Spring.config.name", "naveenSvc");
		SpringApplication.run(NaveenSvc.class, args);
	}

}
