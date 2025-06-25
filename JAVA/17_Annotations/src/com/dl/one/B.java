package com.dl.one;

public class B extends A {

	public void m3() {
		System.out.println("M3 Method");
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
	}
	
}

//Adv Java 
//JDBC
//Servlets
//JSP 

//Hibernate
//Spring 
//SpringBoot
//SpringBoot Microservice  and React