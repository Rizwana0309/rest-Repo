package com.springboot.test.proj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.Controller"})

public class SpringbootRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRest2Application.class, args);
	}

}
