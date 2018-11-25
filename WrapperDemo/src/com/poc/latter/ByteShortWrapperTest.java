package com.poc.latter;

public class ByteShortWrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short data=23;
		int hashCode=Short.hashCode(data);
		System.out.println(hashCode);
		
		int unsignedInt=Short.toUnsignedInt(data);
		System.out.println(unsignedInt);
		
		long unsignedLong=Short.toUnsignedLong(data);
		System.out.println(unsignedLong);

	}

}
