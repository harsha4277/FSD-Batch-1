package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {

		try {
			System.out.println("Before");
			String s1 = "Hello Java and Hello Python";
			System.out.println(s1.charAt(12));
			System.out.println(s1.charAt(40));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("After");

	}

}
