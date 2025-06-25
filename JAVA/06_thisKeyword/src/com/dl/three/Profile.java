package com.dl.three;

public class Profile {
	
	public Profile() {
		this(10);
		System.out.println("Default Cons");
		//this(10.0); // Constructor call must be the first statement in a constructor
	}
	
	public Profile(int i) {
		System.out.println("Para Cons One");
	}
	
	public Profile(float f) {
		System.out.println("Para Cons Two");
	}

	public static void main(String[] args) {

		new Profile();
	}

}
