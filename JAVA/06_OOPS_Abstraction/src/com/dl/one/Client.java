package com.dl.one;

abstract class Parent {

	public void m1() {
		System.out.println("Non Abstract Method");
	}

	public abstract void m2();

}

class Child extends Parent {

	@Override
	public void m2() {

		System.out.println("Implented Abs Method");
	}

}

public class Client {

	public static void main(String[] args) {
		
		//Inheritance
		Child child = new Child();
		child.m1(); 
		child.m2();
		
		System.out.println(" ");
		
		//Poly
		Parent parent = new Child();
		parent.m1();
		parent.m2();
	}
}
