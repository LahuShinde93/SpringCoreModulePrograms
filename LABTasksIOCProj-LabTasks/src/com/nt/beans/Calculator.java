package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("calculate")
public class Calculator {

	public double add(double a, double b)
	{
		return a+b;
	}
	
	public double sub(double a,double b) {
		return a-b;
	}
	
	public double multiplicatio(double a, double b) {
		return a*b;
	}
	
	public double div (double a, double b) {
		return a/b;
	}
}
