package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements Courier {

	@Override
	public final String deliver(int orderId) {
		return "DTDC:delevering order with OrderId:"+orderId;
	}

}
