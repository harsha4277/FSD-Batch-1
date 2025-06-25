package com.dl.one;

public class Eg13 {

	public static void main(String[] args) {

		//Immutable
		String s1 = "Hello Java";

		String s2 = new String("Hello Java");

		//Mutable //1.0 // Thread Safety
		StringBuffer sb3 = new StringBuffer("Hello Java ");
		sb3.append("Hello JavaScript");
		System.out.println(sb3);

		//Mutable //1.5 // No Thread Safety
		StringBuilder sb4 = new StringBuilder("Hello Java ");
		sb4.append("Hello JavaScript");
		System.out.println(sb4);

	}

}
