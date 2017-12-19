package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.service.StudentService;

@SpringBootApplication
@Import({ServiceConfig.class,PersistenceConfig.class})
public class BootDaoApp1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		ctx=SpringApplication.run(BootDaoApp1Application.class, args);
		//get Bean
		service=ctx.getBean("stService",StudentService.class);
		System.out.println("student count::"+service.findStudentsCount());
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
