package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("voter")
public class VoteElgibilityChecking {
	@Value("raja")
	private String name;
	@Value("-30")
	private int age;
	
	
	@PostConstruct
	public void myInt(){
		if(name==null || age<0)
			throw new IllegalArgumentException("invalid inputs");
	}
	
	public  String checkVotingElgility(){
		if(age>=18)
			return  "Mr/Miss/Mrs. "+name+ " u r elgible for voting";
		else
			return  "Mr/Miss/Mrs. "+name+ " not u r elgible for voting";
	}
	@PreDestroy
	public void myDestroy(){
		name=null;
		age=0;
	}

}
