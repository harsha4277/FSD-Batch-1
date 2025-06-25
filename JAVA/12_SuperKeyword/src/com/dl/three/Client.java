package com.dl.three;

class Parent {

	public Parent() {
		System.out.println("Default Cons P");
	}
	
	public Parent(int i) {
		this();
		System.out.println("Value is: " + i);
	}
}

class Child extends Parent{

	public Child() {
		super(10);
		System.out.println("Default Cons C");
	}
}

public class Client {

	public static void main(String[] args) {

		new Child();
	}

}

//this and this()
//super and super()

