package com.dl.variables;

public class Child extends Parent {

	public static void main(String[] args) {
		
		//The field Parent.userId is not visible
		//System.out.println(userId); // means private is not call-able in another class
		System.out.println(new Child().userName);
		System.out.println(userContactNo);
		System.out.println(userSalary);
	}
}
