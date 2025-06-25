package com.dl.one;

public class Eg2 {

	// Wrapper Classes with default values
	static Byte b;
	static Short s;
	static Integer i;
	static Long l;

	static Float f;
	static Double d;

	Boolean bb;

	static Character ch;

	public static void main(String[] args) {

		System.out.println(b); // null
		System.out.println(s); // null
		System.out.println(i); // null
		System.out.println(l); // null
		
		System.out.println(f); // null
		System.out.println(d); // null
		
		System.out.println(ch); // null

		System.out.println(new Eg1().bb); // false
	}

}
