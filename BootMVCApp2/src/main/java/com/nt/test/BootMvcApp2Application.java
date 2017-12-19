package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.controller")
public class BootMvcApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcApp2Application.class, args);
	}
}
