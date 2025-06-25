package com.dl.two.methods;

public class Child extends Parent {

	public static void main(String[] args) {
		
		Parent p = new Child(); //ParentClass ref = new ChildClass();
		p.m1();
		p.m2();
	}
	
//	public void m1() {
//		int houseN0 = 128;
//		System.out.println("Child: " + houseN0);
//	}

}
