package com.dl.two.methods;

public class Eg1 {

	//Main Method
	public static void main(String[] args) {

		//direct approach
		m1();
		m2();
		m3();
		m4();
		
		System.out.println(" ");
		
		//ClassName.staticMethodName()
		Eg1.m1();
		Eg1.m2();
		Eg1.m3();
		Eg1.m4();
		
	}
	
	//Static Method
	public static void m1() {
		System.out.println("M1 Method");
	}
	
	public static void m2() {
		System.out.println("M2 Method");
	}
	
	public static void m3() {
		System.out.println("M3 Method");
	}
	public static void m4() {
		System.out.println("M4 Method");
	}
}
