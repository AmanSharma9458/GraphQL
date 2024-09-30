package com.infybuzz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.infybuzz.controller", "com.infybuzz.service"})
public class GraphQLClientWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQLClientWithSpringBootApplication.class, args);
	}

}
