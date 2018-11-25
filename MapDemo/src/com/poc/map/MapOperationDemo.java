package com.poc.map;

import java.util.HashMap;
import java.util.Map;

public class MapOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(190292, "Martin");
		map.put(190928, "Frank");
		map.put(902292, "Andrew");
		String result=map.getOrDefault(190928, "Swa1rup");
		System.out.println(result);
		result=map.getOrDefault(190924 , "Swarup");
		System.out.println(result);

		//map.replaceAll((i,s)->s+"_"+i);
		
		//map.forEach((k,v)->System.out.println("Key...>"+k+"Value...>"+v));
		
		String associatedValue=map.putIfAbsent(190292, "New Value");
		System.out.println("Associated value is "+associatedValue);
		map.forEach((k,v)->System.out.println("Key...>"+k+"Value...>"+v));
		
		 associatedValue=map.putIfAbsent(190296, "New Value");
		System.out.println("Associated value is "+associatedValue);
		map.forEach((k,v)->System.out.println("Key...>"+k+"Value...>"+v));
		
		
		System.out.println(map.replace(190292, "Martina", "Martin Cro"));
		map.forEach((k,v)->System.out.println("Key...>"+k+"Value...>"+v));
		System.out.println(map.replace(190292, "Martin", "Martin Cro"));
		map.forEach((k,v)->System.out.println("Key...>"+k+"Value...>"+v));




	}

}
