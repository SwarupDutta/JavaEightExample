package com.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stu1
		List<String> list=new ArrayList<String>();
		list.add("Sean");
		list.add("Martin");
		list.add("Frank");
		list.add("Andrew");
		Stream<String> distinctStream=list.stream().distinct();
		System.out.println(distinctStream.count());
		
		


		

	}

}
