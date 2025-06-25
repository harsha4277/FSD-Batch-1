package com.dl.one;

public class Eg14 {

	public static void main(String[] args) {
		
//		String s1 = "Hello Java and Hello Python";
//		String[] split = s1.split(" ");
//		for (String string : split) {
//			System.out.println(string);
//		}
//
//		String s1 = "Hello Java and Hello Python and Hello JavaScript";
//		String[] split = s1.split("and");
//		for (String string : split) {
//			System.out.println(string);
//		}
		
		
//		String s1 = "Hello Java : Hello Python : Hello JavaScript";
//		String[] split = s1.split(":");
//		for (String string : split) {
//			System.out.println(string);
//		}
		
//		String s1 = "Hello Java : Hello Python : Hello JavaScript";
//		String[] split = s1.split(" : ", 2);
//		for (String string : split) {
//			System.out.println(string);
//		}

		String s1 = "Hello Java and Hello Python";
		String[] split = s1.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		String s2 = String.join(" ", "Hello", "Java", "and", "Hello", "Python");
		System.out.println(s2);
		
	}

}
