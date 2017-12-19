package com.nt.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	@Value("${sysDate.hour}")
	private  int hour;
	
	@Bean(name="dt")
	public Date createDate(){
		Date dt=null;
		dt=new Date();
		dt.setHours(hour);
		return dt;
	}
	

}
