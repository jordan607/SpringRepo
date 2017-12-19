package com.spring.social.fb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * fb App: Spring Test New
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.nt.controller")
public class FaceBookBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaceBookBootApplication.class, args);
	}
}
