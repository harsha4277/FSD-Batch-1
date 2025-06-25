package com.dl.five;

public class Eg1 {
	
	//Instance V
	int a = 10;
	int b = 20; 

	public static void main(String[] args) {

		//new Eg1().m1();
		Eg1 eg1 = new Eg1();
		eg1.m1();
	}
	
	//Instance Method
	public void m1() {
		System.out.println("Instance Method");
		System.out.println(a);
		System.out.println(b);
	}
	
	//Instance Block
	{
		System.out.println("Instance Block");
		System.out.println(a);
		System.out.println(b);
	}
	
	//Constructor
	public Eg1() {
		System.out.println("Constructor");
		System.out.println(a);
		System.out.println(b);
	}
}
