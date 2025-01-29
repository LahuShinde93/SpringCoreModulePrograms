package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("shapeFactory")
public class ShapeFactory { 

	@Autowired
	private ApplicationContext context; 
	public Shape createShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("circle"))
			return context.getBean("circle",Circle.class);
		else if(shapeType.equalsIgnoreCase("sqr"))
			return context.getBean("sqr",Square.class);
		else if(shapeType.equalsIgnoreCase("rectangle"))
			return context.getBean("rectangle",Rectangle.class);
		else
		throw new IllegalArgumentException("Invalid shape type");
	}
}
