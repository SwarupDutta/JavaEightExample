package com.poc.model;

public class Product {
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	/**
	 * @param id
	 * @param name
	 */
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private int id;
	private String name;
	

}
