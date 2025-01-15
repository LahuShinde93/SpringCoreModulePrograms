package com.nt.Factory;

import com.nt.Compo.*;

public class CarFactory {

	public static Car getCar(String carType) {
		
		if (carType.equalsIgnoreCase("SportCar"))
			return new SportCar();
		else if (carType.equalsIgnoreCase("SwiftCar"))
			return new SwiftCar();
		else if (carType.equalsIgnoreCase("MUVCar"))
			return new MUVCar();
		else
			throw new IllegalArgumentException("Invalid carType..");
	}
}
