package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("firstFlight")
public class FirstFlight implements Courier {
	 @Autowired
	  private Date date;

	@Override
	public String deliver(int  orderId) {
		return orderId+" order is delivered from FirstFlight on date::"+date; 
	}
}//class
