package com.poc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDemoSimpleDateFormat implements Runnable {
	
	
	/*public static final ThreadLocal<SimpleDateFormat> dateFormat=new ThreadLocal<SimpleDateFormat>()
			{
				@Override
				protected SimpleDateFormat initialValue()
				{
					System.out.println("Initializing simpledate format for"+Thread.currentThread().getName());
					return new SimpleDateFormat("dd/MM/yyyy");
				}
			};*/
	
	public static final ThreadLocal<SimpleDateFormat> dateFormat=ThreadLocal.withInitial(()-> new SimpleDateFormat("dd/MM/yyyy"));
			
	

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread run execution started "+Thread.currentThread().getName());
		System.out.println("DateFormatter pattern is "+dateFormat.get().toPattern());
		System.out.println("Formatted date is "+dateFormat.get().toPattern());


		System.out.println("Formated date is "+dateFormat.get().format(new Date()));

	}

}
