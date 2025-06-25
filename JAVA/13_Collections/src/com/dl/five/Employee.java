package com.dl.five;

public class Employee {

	int id;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
