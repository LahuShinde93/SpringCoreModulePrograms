package com.nt.StrategyDPTest;

import com.nt.FlipCartFactory.FlipCart;

public class StartegyDPTestMain { 

	public static void main(String[] args) {

		  
		FlipCart flpkt = new FlipCart();
		String shopping = flpkt.shopping(new String[] {"Shirt","Trouser"},new double[]{5000,6000});
		System.out.println(shopping);
	} 

}
 