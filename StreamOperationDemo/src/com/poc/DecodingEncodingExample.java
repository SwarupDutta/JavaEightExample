package com.poc;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class DecodingEncodingExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		simpleEncodingAndDecodingExample();
		urlEncodingAndDecodingExample();

	}

	private static void simpleEncodingAndDecodingExample() throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		final String textData="Decoding Encoding Example!!!";
		String encodedText=Base64.getEncoder().encodeToString(textData.getBytes("UTF-8"));
		System.out.println("Encoded text is"+encodedText);
		byte[] decodedArray=Base64.getDecoder().decode(encodedText);
		String decodedText=new String(decodedArray,"UTF-8");
		System.out.println("Decoded text is"+decodedText);
	}
	
	private static void urlEncodingAndDecodingExample() throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		final String textData="Decoding Encoding Example!!!!!!!!!";
		String encodedText=Base64.getUrlEncoder().encodeToString(textData.getBytes("UTF-8"));
		System.out.println("Encoded text is"+encodedText);
		byte[] decodedArray=Base64.getUrlDecoder().decode(encodedText);
		String decodedText=new String(decodedArray,"UTF-8");
		System.out.println("Decoded text is"+decodedText);
	}

}
