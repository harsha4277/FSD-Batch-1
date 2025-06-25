package com.dl.three.blocks;

public class Eg1 {

	public static void main(String[] args) {

		//instance block, instance method, instance variable // 100% need Object
		//static 
		new Eg1();
		new Eg1();
		new Eg1();
		
	}

	// instance block
	{
		System.out.println("Instance Block");
	}

	//static block
	static {
		System.out.println("Static Block");
	}
}
