package com.poc;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	
	public static void main(String argv[])
	{
		BiConsumer<Integer,Integer> adder=(I1,I2)->System.out.println("Adder "+(I1+I2));
		BiConsumer<Integer,Integer> multiplier=(I1,I2)->System.out.println("Multiplier "+(I1*I2));
		
		adder.andThen(multiplier).accept(10, 30);
		System.out.println("------------------");
		multiplier.andThen(adder).accept(10, 30);


	}

}
