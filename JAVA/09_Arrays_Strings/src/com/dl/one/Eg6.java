package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {

		String s1 = new String("Hello Java and Hello Python");
		System.out.println(s1.charAt(6));
		System.out.println(s1.charAt(8));
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(100)); // java.lang.StringIndexOutOfBoundsException

	}

}
