package com.dl.four.inheritance;

public class Child extends Parent {

	public void m4() {
		System.out.println("M4 Method of Child");
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1();
		System.out.println(child.m2());
		child.m2();
		child.m3();
		child.m4();
	}
}
