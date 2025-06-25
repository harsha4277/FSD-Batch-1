package com.dl.one.variables;

public class Eg4 {

	// Non Static / Instance V
	int x = 10;
	int y = 20;

	public static void main(String[] args) {

		System.out.println(new Eg4().x); // new ClassName.instanceVariable
		System.out.println(new Eg4().y); // new ClassName.instanceVariable
		
		Eg4 eg = new Eg4();
		System.out.println(eg.x); //objectRef.instanceVariable
		System.out.println(eg.y); //objectRef.instanceVariable
	}

}
