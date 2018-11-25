package com.poc.localdatetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Optional;

public class DateFormatterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime localDateTime=LocalDateTime.of(2015,Month.JANUARY,25,6,30);
		
		System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
		System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

		System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK)));
		
		
		




	}

}
