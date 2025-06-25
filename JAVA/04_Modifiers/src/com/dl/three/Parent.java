package com.dl.three;

public class Parent {

	public void m1() {
		System.out.println("M1 Method");
	}
	
	private void m2() {
		System.out.println("M2 Method");
	}
	
	protected void m3() {
		System.out.println("M3 Method");
	}
	
	void m4() {
		System.out.println("M4 Method");
	}
	
	public static void main(String[] args) {
		
		new Parent().m1();
		new Parent().m2();
		new Parent().m3();
		new Parent().m4();
	}
}
