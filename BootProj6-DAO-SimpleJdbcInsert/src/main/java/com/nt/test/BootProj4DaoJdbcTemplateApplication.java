package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;



@SpringBootApplication
@ComponentScan(basePackages={"com.nt.service","com.nt.dao"})
public class BootProj4DaoJdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
	   StudentService service=null;
	   StudentDTO dto=null;
		ctx=SpringApplication.run(BootProj4DaoJdbcTemplateApplication.class, args);
		//get SErvice Bean
		 service=ctx.getBean("stService",StudentService.class);
		 //prepare DTO
		 dto=new StudentDTO();
		 dto.setSno(1123); dto.setSname("raja"); dto.setSadd("hyd");
		 //invoke method
		 System.out.println(service.register(dto));
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}
}
