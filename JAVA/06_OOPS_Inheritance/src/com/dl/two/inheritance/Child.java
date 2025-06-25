package com.dl.two.inheritance;

//Single Level Inheritance
class Parent{
	
	final void m1() {
		System.out.println("M1 Method");
	}
	
	final static void m2() {
		System.out.println("M2 Method");
	}
}
//Inherting/Acheive --> extends keyword
public class Child extends Parent {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1();
		m2();
	}
}
