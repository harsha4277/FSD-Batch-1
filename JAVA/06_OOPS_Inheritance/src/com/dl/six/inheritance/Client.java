package com.dl.six.inheritance;

class GrandParent extends Object {

	public void m1() {
		System.out.println("M1 Method of GP");
	}
}

class Parent extends GrandParent {

	public void m2() {
		System.out.println("M2 Method of Parent");
	}
}

class Child extends GrandParent {

	public void m3() {
		System.out.println("M3 Method of Child");
	}
}

//Hierarchial
public class Client {

	public static void main(String[] args) {

		Child child = new Child();
		child.m1();
		child.m3();
		
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
	}
}
