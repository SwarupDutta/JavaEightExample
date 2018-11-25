package com.poc.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate initialDate=LocalDate.parse("2007-05-10");
		LocalDate finalDate=initialDate.plus(Period.ofDays(5));
		int dif=Period.between(finalDate, initialDate).getDays();
		System.out.println(dif);
	long daysdiff=ChronoUnit.DAYS.between(initialDate, finalDate);
	System.out.println(daysdiff);


	}

}
