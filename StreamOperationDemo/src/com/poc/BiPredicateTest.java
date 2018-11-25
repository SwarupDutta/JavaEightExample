package com.poc;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,String> biPredicate=(n,str)-> n>50 && str.startsWith("Swa");
		System.out.println(biPredicate.test(52, "Swarup"));
		
		

	}

}
