package com.poc.localdatetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Set;

public class LocalDateTest {
	
	public static void main(String argv[])
	{
		
		
		
		
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		Clock clock=Clock.systemDefaultZone();
		LocalDate clockLocalDate=LocalDate.now(clock);
		System.out.println(clockLocalDate);
		
		ZoneId zone=ZoneId.of("Australia/Darwin");
		LocalDate zoneLocalDate=LocalDate.now(zone);
		System.out.println(zoneLocalDate);
		
		LocalDate localDateOf=LocalDate.of(2011, 05, 24);
		System.out.println(localDateOf);
		
		LocalDate localDateParse=LocalDate.parse("2019-05-24");

		/*System.out.println(localDateParse.getMonth());
		System.out.println(localDateParse.getYear());
		//getDayOfWeek,getDayOfMonth,isLeapYear,isBefore, isAfter

		System.out.println(localDateParse.getDayOfWeek());*/
		LocalDate plusDays=localDateParse.plusDays(12);
		System.out.println(plusDays);

		//localDateParse.plus/minusMonths(monthsToAdd)
		//localDateParse.plus/minusWeeks(weeksToAdd)
		//localDateParse.plus/minusYears(yearsToAdd)
		LocalDate minusDays=localDateParse.minus(2, ChronoUnit.DAYS);//same applicable for plus


		System.out.println(minusDays);
		
		boolean before=LocalDate.parse("2017-03-01").isBefore(LocalDate.parse("2017-02-28"));
		System.out.println(before);
		
		boolean after=LocalDate.parse("2017-03-01").isAfter(LocalDate.parse("2017-02-28"));
		System.out.println(after);
		
		LocalDateTime locdateTime=LocalDate.parse("2017-03-01").atStartOfDay();
		System.out.println(locdateTime);
		//LocalDate with=LocalDate.parse("2017-04-11").with(TemporalAdjusters.firstDayOfYear());
		LocalDate with=LocalDate.parse("2017-04-11").with(TemporalAdjusters.firstDayOfMonth());

		System.out.println(with);





/*public static int daysBetweenUsingJoda(Date d1, Date d2)
{ 
	return Days.daysBetween( new LocalDate(d1.getTime()), new LocalDate(d2.getTime())).getDays(); }

	}*/



		




	}

}
