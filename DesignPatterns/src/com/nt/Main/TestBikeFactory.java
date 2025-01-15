package com.nt.Main;

import com.nt.Compo.Bike;
import com.nt.Factory.BikeFactory; 

public class TestBikeFactory {

	public static void main(String[] args) {

		Bike bike =  null;
		bike = BikeFactory.getBike("Hondabike");
		bike.run(); 
		   
		bike = BikeFactory.getBike("ShindeBike");
		bike.run();
		  
		bike = BikeFactory.getBike("raiderbike");
		bike.run();
		
		
		
		
	}

}
