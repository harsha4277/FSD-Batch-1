package com.dl.six;

public class Child extends Parent {

	public static void main(String[] args) {

		Child child = new Child();
		child.m3(); 
		child.m4();
		child.m1();
		child.m2();
	}

	@Override
	public void m3() {
		System.out.println("M3 Method");

	}

	@Override
	public void m4() {
		System.out.println("M4 Method");

	}

}
