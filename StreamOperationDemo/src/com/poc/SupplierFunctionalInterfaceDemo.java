package com.poc;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceDemo {
	
	private static Integer getNum()
	{
		Random random=new Random();
		return random.nextInt(100);
	} 
	
	
	public static void main(String argv[])
	{
		Supplier<Integer> supplier=SupplierFunctionalInterfaceDemo::getNum;
		for(int i=0;i<20;i++)
		{
			System.out.println(supplier.get());
		}
		
	}

}
