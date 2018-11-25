package com.poc.latter;

public class IntegerLonWrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String unsignedString=Integer.toUnsignedString(10, 2);
		System.out.println(unsignedString);
		
		 unsignedString=Integer.toUnsignedString(10);
		System.out.println(unsignedString);
		
		int parseUnsignedInt=Integer.parseUnsignedInt("32", 4);// wii convert decimal 12 which is in base 8 to decimal
		System.out.println(parseUnsignedInt);
		
		int divUnsignedInt=Integer.divideUnsigned(100, 4);
		System.out.println(divUnsignedInt);
		
		int remainderUnsignedInt=Integer.remainderUnsigned(100, 24);
		System.out.println(remainderUnsignedInt);

		int sum=Integer.sum(10, 20);
		System.out.println(sum);




	}

}
