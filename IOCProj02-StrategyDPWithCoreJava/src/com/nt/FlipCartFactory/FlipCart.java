package com.nt.FlipCartFactory;

import java.util.Arrays;
import java.util.Random;

import com.nt.beans.BlueDartCourier;
import com.nt.beans.DTDCCourier;

public final class FlipCart {

	private BlueDartCourier BCourier;
	private DTDCCourier dtdCourier;

	public String shopping(String items[], double price[]) {
		long oid = new Random().nextInt(100000);
		double totalAmt = 0.00;
		for (Double d : price) {
			totalAmt += d;
		}
		
		String msg = new BlueDartCourier().deliver(oid);
		msg = new DTDCCourier().deliver(oid);

		return "The items" + Arrays.toString(items) + " & Total amt is " + totalAmt + msg;
	}
}
