package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("wish")
public class WishMessageGenerator {
	@Autowired
	private Date date;
	
	public String sayHello(String  user){
		int hour=0;
		//get current hour of the day
		hour=date.getHours();
		if(hour<12)
			return "Good Morning-->"+user;
		else if(hour<16)
			return "Good After noon-->"+user;
		else if(hour<20)
			return "Good Evening-->"+user;
		else
			return "Good night-->"+user;
	}
}
