package com.nt.beans;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishMessageGenerator {
	
	public String sayHello(String  user){
		return "Hello ---->"+user;
	}
}
