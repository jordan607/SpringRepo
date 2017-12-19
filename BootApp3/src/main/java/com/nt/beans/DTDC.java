package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {
	 @Autowired
	  private Date date;

	@Override
	public String deliver(int orderId) {
		return orderId+" order is delivered from DTDC on date::"+date; 
	}

}
