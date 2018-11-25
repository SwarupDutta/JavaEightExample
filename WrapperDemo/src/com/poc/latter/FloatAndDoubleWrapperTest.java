package com.poc.latter;

public class FloatAndDoubleWrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean finite=Float.isFinite(200.89f);
		System.out.println(finite);
		
		 finite=Float.isFinite(20.0f/0);
		System.out.println(finite);
		
		float var=Float.sum(10.2f, 20.4f);
		System.out.println(var);
		
		var=Float.max(10.2f, 20.4f);
		System.out.println(var);
		
		var=Float.min(10.2f, 20.4f);
		System.out.println(var);



	}

}
