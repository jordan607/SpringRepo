package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.VoteElgibilityChecking;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp4BeanLifeCycleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VoteElgibilityChecking checking=null;
		ctx=SpringApplication.run(BootApp4BeanLifeCycleApplication.class, args);
		//get Bean
		checking=ctx.getBean("voter",VoteElgibilityChecking.class);
		System.out.println(checking.checkVotingElgility());
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
