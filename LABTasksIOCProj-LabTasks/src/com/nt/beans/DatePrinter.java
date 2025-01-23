package com.nt.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("datePrint")
public class DatePrinter {

	@Autowired
	LocalDate currentDate; //HAS-A Property
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	

	public void printDate() {
		System.out.print(currentDate.getDayOfYear()+"-");
		System.out.print(currentDate.getDayOfMonth()+"-");
		System.out.print(currentDate.getDayOfWeek());
	}
}
