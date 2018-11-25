package com.poc;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BiFunction<Integer,Integer,String> biFunction=(n1,n2)-> "Returned Number is"+(n1+n2);
		System.out.println(biFunction.apply(12, 14));
		System.out.println("=================================");*/
		
		BiFunction<String,Integer,Integer> biFunction=(designation,age)-> {
			if(designation!=null && age!=null)
			{
				if(designation.equalsIgnoreCase("Manager") && age > 30)
					return 120000;
				else if(designation.equalsIgnoreCase("Developer") && age > 25)
					return 90000;
				else
					return 0;
			}
			else 
				return 0;
			
			
			
			
		};

		int salary=biFunction.apply("Manager", 31);
		System.out.println(salary);
		
		 salary=biFunction.apply("Developer", 28);
			System.out.println(salary);
		
		Function<Integer,String> function=(sal)->{
			
			if(sal>100000) return "Band 5";
			else if(sal>80000) return "Band 4";
			else return "Band 3";
			

			
		};
		String salaryBand=biFunction.andThen(function).apply("Manager", 31);
		System.out.println(salaryBand);
		
		
		salaryBand=biFunction.andThen(function).apply("Developer", 28);
		System.out.println(salaryBand);

		


	}

}
