package com.dl.two;

class Parent {

	public void m1() {
		System.out.println("M1 Method P");
	}
}

class Child extends Parent {

	public void m1() {
		System.out.println("M1 Method C");
	}
	
	public void m2() {
		this.m1();
		System.out.println("M2 Method");
		super.m1();
	}
}

public class Client {

	public static void main(String[] args) {

		Child child = new Child();
		child.m2();
	}
}
