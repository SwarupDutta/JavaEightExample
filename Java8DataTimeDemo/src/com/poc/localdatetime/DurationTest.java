package com.poc.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime initialTime=LocalTime.of(6, 30,0);
		LocalTime finalTime=initialTime.plus(Duration.ofSeconds(30));
		
		long secdiff=Duration.between( initialTime,finalTime).getSeconds();
		System.out.println(secdiff);
		secdiff=ChronoUnit.SECONDS.between( initialTime,finalTime);
		System.out.println(secdiff);



	}

}
