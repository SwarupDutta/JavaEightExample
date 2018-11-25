package com.poc.latter;

import java.util.Scanner;

public class BooleanWrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner scanner=new Scanner(System.in))
		{
			System.out.println("Enter first  bollean");
			boolean b1=scanner.nextBoolean();
			
			System.out.println("Enter first  bollean");
			boolean b2=scanner.nextBoolean();
			
			int hashCode1=Boolean.hashCode(b1);
			System.out.println(hashCode1);
			
			int hashCode2=Boolean.hashCode(b2);
			System.out.println(hashCode2);
			
			boolean logicalAnd=Boolean.logicalAnd(b1, b2);
			System.out.println(logicalAnd);
			
			boolean logicalOr=Boolean.logicalOr(b1, b2);
			System.out.println(logicalOr);
			
			boolean logicalXor=Boolean.logicalXor(b1, b2);
			System.out.println(logicalXor);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
