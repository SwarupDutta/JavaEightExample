package com.poc.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTimeNow=LocalDateTime.now();
		System.out.println(localDateTimeNow);
		
		LocalDateTime localDateTimeOf=LocalDateTime.of(LocalDate.now(),LocalTime.now());
		System.out.println(localDateTimeOf);
		
		LocalDateTime localDateTimeParse=LocalDateTime.parse("2018-12-04T12:32:02.210");
		System.out.println(localDateTimeParse.toLocalDate());
		System.out.println(localDateTimeParse.toLocalTime());
		
		System.out.println(localDateTimeNow.MAX);
		
		System.out.println(localDateTimeNow.MIN);







	}

}
