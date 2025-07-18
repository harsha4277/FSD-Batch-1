package com.dl.three;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Employee emp) {
//
//		return name.compareTo(emp.name);
//	}
	
	@Override
	public int compareTo(Employee emp) {

		return emp.name.compareTo(name);
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(4, "A");
		Employee emp2 = new Employee(3, "C");
		Employee emp3 = new Employee(1, "B");
		Employee emp4 = new Employee(2, "D");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
