package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("burger")
public class Burger implements Food {

	@Override
	public String serve() {

		return "Serving Burger";
	}

}
