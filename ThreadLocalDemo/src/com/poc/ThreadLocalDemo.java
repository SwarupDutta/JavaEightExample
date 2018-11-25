package com.poc;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalDemo implements Runnable {
	
	public static final AtomicInteger nextId=new AtomicInteger(0);
	
	public static final ThreadLocal<Integer> threadId=ThreadLocal.withInitial(()->nextId.getAndIncrement());

	public static int get()
	{
		return threadId.get();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread "+Thread.currentThread().getName()+" value.."+get());

	}

}
