package com.poc.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ConvertOldDateToNewDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date=new Date();
		
		LocalDateTime locaDateTime=LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println(locaDateTime);
		
		System.out.println(locaDateTime.format(DateTimeFormatter.ISO_DATE));

		
		LocalTime localTime=locaDateTime.toLocalTime();
		System.out.println(localTime);
		
		LocalDate localDate=locaDateTime.toLocalDate();
		System.out.println(localDate);
		
		Calendar calendar=Calendar.getInstance();
		LocalDateTime locaDateTime2=LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
		System.out.println(locaDateTime2);
		
		

		
		

	}

}
