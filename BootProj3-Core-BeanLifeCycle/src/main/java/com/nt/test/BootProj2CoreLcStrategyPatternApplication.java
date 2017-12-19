package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


import com.nt.beans.VoterChecking;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class BootProj2CoreLcStrategyPatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VoterChecking checking=null;
		//get IOC container
		ctx=SpringApplication.run(BootProj2CoreLcStrategyPatternApplication.class, args);
        //get bean
		checking=ctx.getBean("voter",VoterChecking.class);
		System.out.println(checking.checkVotingElgibility());
	}
}
