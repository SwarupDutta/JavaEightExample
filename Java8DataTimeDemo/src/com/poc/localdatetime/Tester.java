package com.poc.localdatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Tester {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	    Date firstDate = sdf.parse("06/24/2017 10:00:02");
	    Date secondDate = sdf.parse("06/24/2017 10:30:29");
	 
	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    
	    System.out.println(diff);
	 
//https://www.baeldung.com/java-date-difference
	}

}