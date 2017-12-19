package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class BootApp1Application {

	public static void main(String[] args) {
	
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		//Get IOC container
		ctx=SpringApplication.run(BootApp1Application.class, args);
		//get Bean object
		generator=ctx.getBean("wish",WishMessageGenerator.class);
		System.out.println(generator.sayHello("raja"));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
