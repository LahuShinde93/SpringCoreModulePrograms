package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("info")
public class PersonalInfo { 

	@Value("${myName.name}")
	private String name;
	
	@Value("${myAge.age}")
	private int age;
	
	@Value("${myEducation.education}")
	private String education;
	
	@Value("${myDesignatation.designatation}")
	private String designatation;
	
	public void getPersonalInfo() {
		System.out.println("Your name is : "+name);
		System.out.println("Your Age is : "+age);
		System.out.println("Your education is : "+education);
		System.out.println("Your designatation is : "+designatation);
	}
	
	
	
}
