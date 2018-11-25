package com.poc;


public class ThreadLocalDemoClient {
	
	public static void main(String argv[])
	{
		
		/*ThreadLocal<String> threadLocal=new ThreadLocal<String>();
		threadLocal.set("Thread local demo");
		System.out.println(threadLocal.get());*/
		
		/*ThreadLocalDemo threadLocalDemo=new ThreadLocalDemo();
		Thread th1=new Thread(threadLocalDemo,"Thread-1" );
		Thread th2=new Thread(threadLocalDemo,"Thread-2" );
		Thread th3=new Thread(threadLocalDemo,"Thread-3" );
		th1.start();
		th2.start();
		th3.start();*/
		
		
		ThreadLocalDemoSimpleDateFormat threadLocalDemoSimpleDateFormat=new ThreadLocalDemoSimpleDateFormat();
		Thread th1=new Thread(threadLocalDemoSimpleDateFormat,"Thread-1" );
		Thread th2=new Thread(threadLocalDemoSimpleDateFormat,"Thread-2" );
		Thread th3=new Thread(threadLocalDemoSimpleDateFormat,"Thread-3" );
		th1.start();
		th2.start();
		th3.start();




	}
	
}
