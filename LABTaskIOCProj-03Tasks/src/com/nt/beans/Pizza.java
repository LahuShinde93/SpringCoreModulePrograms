package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("pizza")
public class Pizza implements Food {

	@Override
	public String serve() {
		return "Serving Pizza";
	}

}
