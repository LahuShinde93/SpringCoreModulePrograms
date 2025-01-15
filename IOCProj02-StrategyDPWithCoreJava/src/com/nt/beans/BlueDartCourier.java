package com.nt.beans;

public class BlueDartCourier implements ICourier {

	@Override
	public String deliver(long oid) {

		return "assign to delivred with " + oid + " order id to BlueDart courier ";
	}

}
