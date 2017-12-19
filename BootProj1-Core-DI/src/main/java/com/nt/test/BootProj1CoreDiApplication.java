package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.service.WishMessageGeneratorService;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.service")
public class BootProj1CoreDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGeneratorService service=null;
		
		//get IOC container
		ctx=SpringApplication.run(BootProj1CoreDiApplication.class, args);
		//get Bean
		service=ctx.getBean("wish",WishMessageGeneratorService.class);
		//invoke method
		System.out.println(service.generateWishMessage("raja"));
	}
}
