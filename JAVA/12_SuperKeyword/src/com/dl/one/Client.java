package com.dl.one;

class Parent {

	int i = 10;
	int j = 20;

}

class Child extends Parent {

	int i = 100; //IN V
	int j = 200; // IN V

	public void m1() {
		
		int i = 1000;
		int j = 2000;
		System.out.println("Local: " + i);
		System.out.println("Local: " + j);
		
		System.out.println("Parent: " + super.i);
		System.out.println("Parent: " + super.j);
		
	}

}

public class Client {

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println("Child: " + child.i);
		System.out.println("Child: " + child.j);
		child.m1();
	}
}
