package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shape {

	@Override
	public void draw() {

		System.out.println("Drawing a rectangle");
	}

}
