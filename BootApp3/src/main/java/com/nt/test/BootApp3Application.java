package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.FlipKart;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(value = AppConfig.class)
public class BootApp3Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		FlipKart fpk;
		ctx=SpringApplication.run(BootApp3Application.class, args);
		//get FlipKart bean object
		fpk=ctx.getBean("flipKart",FlipKart.class);
		System.out.println(fpk.shopping(new String[]{"cotton shirt","ransna"," caps","butter milk"}));
		
		((ConfigurableApplicationContext) ctx).close();
		
	}//main
}//class
