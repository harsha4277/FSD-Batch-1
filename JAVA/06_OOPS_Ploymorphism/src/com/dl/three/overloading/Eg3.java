package com.dl.three.overloading;

public class Eg3 {

	public Eg3() {
		System.out.println("Default Constructor");
	}
	
	public Eg3(int a, int b) {
		System.out.println(a+b);
	}
	
	public Eg3(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	//Constructor Overloading
	public static void main(String[] args) {

		new Eg3();
		new Eg3(10, 20);
		new Eg3(10, 20, 30);
	}

}
