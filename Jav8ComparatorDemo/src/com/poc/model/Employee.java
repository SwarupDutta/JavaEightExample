package com.poc.model;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	private String name;
	private Integer age;

}
