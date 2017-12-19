package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.service.EmpService;

@SpringBootApplication
@ComponentScan(basePackages={"com.nt.service","com.nt.dao"})
public class BootProj4DaoJdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmpService service=null;
		ctx=SpringApplication.run(BootProj4DaoJdbcTemplateApplication.class, args);
		//get SErvice bean
		service=ctx.getBean("empService",EmpService.class);
		System.out.println("Emp Count:::"+service.findEmpCount());
		System.out.println("CLERK Desg Employees::"+service.findEmployeesByDesg("CLERK"));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}
}
