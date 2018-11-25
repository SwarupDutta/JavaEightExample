package com.poc.localdatetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now=LocalTime.now();
		System.out.println(now);
		
		LocalTime sixThirty=LocalTime.parse("06:30");
		System.out.println(sixThirty);
		
		LocalTime sixThirtyOf=LocalTime.of(6,30);
		
		
		System.out.println(sixThirtyOf);
		System.out.println(sixThirtyOf.plus(1, ChronoUnit.HOURS));
		
		boolean before=LocalTime.parse("06:30").isBefore(LocalTime.parse("06:40"));
		System.out.println(before);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);








	}

}
