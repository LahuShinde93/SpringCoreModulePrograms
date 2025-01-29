package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier {

	@Override 
	public String order(int oid) {
		return "Order is given to DTDC Courier Servic with "+oid+" order id";
	}

}
