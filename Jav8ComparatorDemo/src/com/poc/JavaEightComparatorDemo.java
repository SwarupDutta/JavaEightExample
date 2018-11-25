package com.poc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.poc.model.Employee;

public class JavaEightComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("Davis",30));
		empList.add(new Employee("Alice",30));

		empList.add(new Employee("Alice",23));
		empList.add(new Employee(null,45));

		empList.add(new Employee("Barry",34));
		empList.add(new Employee(null,35));
		empList.add(new Employee("Martin",35));

		empList.add(new Employee("James",45));
		
		System.out.println("Before sorting");
		empList.forEach(System.out::println);;
		
		//Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		//empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		
		//Comparator<Employee> comp=Comparator.comparing(Employee::getName);
		//Comparator<Employee> comp=Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER);
		
		//Comparator<Employee> comp=Comparator.comparingInt(Employee::getAge);
		
		//Comparator<Employee> comp=Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);


		Comparator<Employee> comp=Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));

		Collections.sort(empList,comp);

		//Collections.sort(empList,comp.reversed());


		System.out.println("After sorting");

		empList.forEach(System.out::println);
		
		//List<String> empNameList=empList.stream().map(Employee::getName).collect(Collectors.toList());
		//System.out.println("Employee name list before sorting"+empNameList);
		
		//empNameList.sort(Comparator.naturalOrder());
		//empNameList.sort(Comparator.reverseOrder());

		//System.out.println("Employee name list after sorting"+empNameList);


		
		



	}

}
