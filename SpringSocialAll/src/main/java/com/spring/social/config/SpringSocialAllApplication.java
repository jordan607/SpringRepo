package com.spring.social.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.social.connect.web.SignInAdapter;

import com.spring.social.signin.SimpleSignInAdapter;

@ComponentScan(basePackages="com.spring.social")
@EnableConfigurationProperties
@EnableAutoConfiguration
public class SpringSocialAllApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSocialAllApplication.class, args);
	}
	
	@Bean
	public SignInAdapter signInAdapter() {
		return new SimpleSignInAdapter(new HttpSessionRequestCache());
	}

}