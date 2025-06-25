package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {

		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = new String("java");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // true

	}

}
