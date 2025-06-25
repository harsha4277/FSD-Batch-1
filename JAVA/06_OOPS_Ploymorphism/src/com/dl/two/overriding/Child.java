package com.dl.two.overriding;

class GrandParent {

	public void m1() {
		System.out.println("M1 Method of GrandParent");
	}
}

class Parent extends GrandParent{
	
	public void m1() {
		System.out.println("M1 Method of Parent");
	}
}

public class Child extends Parent{
	
	public void m1() {
		System.out.println("M1 Method of Child");
	}

	public static void main(String[] args) {
		
//		
//		GrandParent gp = new GrandParent(); // No
//		gp.m1();
//		
//		GrandParent p1 = new Parent(); // Yes
//		p1.m1();
		
		Child c = new Child(); // No
		c.m1(); // M1 Method of Child"
		
		Parent p = new Parent(); // No
		p.m1(); // M1 Method of Parent
		
		Parent p1 = new Child(); // Yes
		p1.m1();
		
		
		
		
	}

}
 