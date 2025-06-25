package com.dl.five;

public class Child extends Parent {

	@Override
	public void m2() {
		System.out.println("M2 Method");

	}

	@Override
	public void m3() {
		System.out.println("M3 Method");

	}

	@Override
	public void m4() {
		System.out.println("M4 Method");

	}

	@Override
	public void m5() {
		System.out.println("M5 Method");

	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
		child.m4();
		child.m5();
		
	}

}
