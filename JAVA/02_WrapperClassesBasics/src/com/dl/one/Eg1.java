package com.dl.one;

public class Eg1 {

	// Primitive Data types with default values
	static byte b;
	static short s;
	static int i;
	static long l;

	static float f;
	static double d;

	boolean bb;

	static char ch;

	public static void main(String[] args) {

		System.out.println(b); // 0
		System.out.println(s); // 0
		System.out.println(i); // 0
		System.out.println(l); // 0
		
		System.out.println(f); // 0.0
		System.out.println(d); // 0.0
		
		System.out.println(ch); // 

		System.out.println(new Eg1().bb); // false

	}

}
