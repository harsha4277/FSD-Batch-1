package com.dl.five;

public class Eg2 {
	
	//Static Variables
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		
		System.out.println("Main Method 03");
		System.out.println(a);
		System.out.println(b);
		m1();
		Eg2.m1();

	}
	
	//Static Method
	public static void m1() {
		System.out.println("Static Method 02");
		System.out.println(a);
		System.out.println(b);
	}
	
	static {
		System.out.println("Static Block 01");
		System.out.println(a);
		System.out.println(b);
	}

}
