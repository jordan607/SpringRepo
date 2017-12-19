package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("voter")
public class VoterChecking {
	@Value("raja")
	private String name;
	@Value("30")
	private int age;
	
	@PostConstruct
	public void myInit()throws IllegalArgumentException{
		System.out.println("VoterChecking:myInit()");
		if(age<=0)
			throw new IllegalArgumentException("age must be +ve number");
	}
	
	public String checkVotingElgibility(){
		if(age<18)
			 return name+" u r not elgible to vote";
		else
			return name+" u r  elgible to vote";
	}
	
	@PreDestroy
	public void myDestroy(){
		System.out.println("VoterChecking:myDestroy()");
		name=null;
		age=0;
	}
}//class
