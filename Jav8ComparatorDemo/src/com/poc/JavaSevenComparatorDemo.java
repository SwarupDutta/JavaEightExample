package com.poc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.poc.model.Employee;

public class JavaSevenComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("Davis",30));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee("Martin",35));
		empList.add(new Employee("James",45));
		
		System.out.println(empList);
		
		//Collections.sort(empList, new EmployeeNameSorter());
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});

		
		
		System.out.println(empList);



	}

}
