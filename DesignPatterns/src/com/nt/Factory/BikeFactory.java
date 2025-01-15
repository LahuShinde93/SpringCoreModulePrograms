package com.nt.Factory;

import com.nt.Compo.*;

public class BikeFactory {

	public static Bike getBike(String bikeType) {
		Bike bike = null;

		if (bikeType.equalsIgnoreCase("Hondabike"))
			return bike = new HondaBick();
		else if (bikeType.equalsIgnoreCase("shindeBike"))
			return bike = new ShindeBike();
		else if (bikeType.equalsIgnoreCase("RaiderBike"))
			return bike = new RaiderBike();
		else
			throw new IllegalArgumentException("Invalid bike type..");

	}
}
