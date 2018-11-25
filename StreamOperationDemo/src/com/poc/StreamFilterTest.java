package com.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.poc.model.Employee;

public class StreamFilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu1
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(10,1000,"XYZ"));
		list.add(new Employee(10,2000,"XYZ"));
		list.add(new Employee(20,3000,"XYZ"));
		list.add(new Employee(30,3000,"XYZ"));
		
		boolean allMatch=list.stream().allMatch(e->e.getAge()>10);
		System.out.println(allMatch);
		boolean anyMatch=list.stream().anyMatch(e->e.getAge()>10);
		System.out.println(anyMatch);
		
		boolean noneMatch=list.stream().noneMatch(e->e.getAge()>10);
		System.out.println(noneMatch);
		
		Stream<Employee> filteredStudentStream=list.stream().filter(e->e.getSal()>2000);
		filteredStudentStream.forEach(System.out::println);	
		
		



		

	}

}
