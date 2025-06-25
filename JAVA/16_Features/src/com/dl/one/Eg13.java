package com.dl.one;

interface BB {

	default void m1() {
		System.out.println("M1 Default Method");
	}
}

public class Eg13 implements BB {
	
	public void m1() {
		System.out.println("M1 Default Method Implemented");
	}

	public static void main(String[] args) {

		BB b = new Eg13();
		b.m1();
		
	}

}
