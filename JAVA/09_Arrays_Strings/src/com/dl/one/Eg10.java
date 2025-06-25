package com.dl.one;

public class Eg10 {

	public static void main(String[] args) {

		String s1 = new String("I like Java and I like JavaScript and I like Python");
		System.out.println(s1.lastIndexOf("like"));
		System.out.println(s1.indexOf("like", 0));
		System.out.println(s1.indexOf("like", 12));
		System.out.println(s1.lastIndexOf("look")); // -1

	}

}
