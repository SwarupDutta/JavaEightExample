package com.poc.model;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", sal=" + sal + ", name=" + name + "]";
	}

	/**
	 * @param age
	 * @param sal
	 * @param name
	 */
	public Employee(int age, int sal, String name) {
		super();
		this.age = age;
		this.sal = sal;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	private int sal;

	private String  name;

	

}
