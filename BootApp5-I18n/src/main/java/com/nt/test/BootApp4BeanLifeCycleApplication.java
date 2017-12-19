package com.nt.test;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp4BeanLifeCycleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		String msg=null;
		Locale l=null;
		ctx=SpringApplication.run(BootApp4BeanLifeCycleApplication.class, args);
		//get Message
		l=new Locale("de","DE");
		msg=ctx.getMessage("msg.wish",null,l);
		System.out.println(msg);
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
