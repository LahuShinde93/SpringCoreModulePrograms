package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("sqr")
public class Square implements Shape {

	@Override
	public void draw() {

		System.out.println("Drawing a square");
	}

}
