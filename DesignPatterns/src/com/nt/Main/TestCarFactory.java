package com.nt.Main;

import com.nt.Compo.Car;
import com.nt.Factory.CarFactory;

public class TestCarFactory {

	public static void main(String[] args) {

		Car car1 = CarFactory.getCar("MUVcar");
		car1.drive();
		Car car2 = CarFactory.getCar("sportcar");
		car2.drive();
		Car car3 = CarFactory.getCar("Swiftcar");
		car3.drive();
		
		/*
		  invalid car type.. exception will generate..
		  Car car4 = CarFactory.getCar("Mahindra");
		  car4.drive();
		 */
	} 

}
