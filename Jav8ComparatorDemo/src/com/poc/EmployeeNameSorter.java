package com.poc;

import java.util.Comparator;

import com.poc.model.Employee;

public class EmployeeNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}
