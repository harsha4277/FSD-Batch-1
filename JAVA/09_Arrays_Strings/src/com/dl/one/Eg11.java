package com.dl.one;

public class Eg11 {

	public static void main(String[] args) {

		String s1 = new String("I like programming and I like programs");
		System.out.println(s1.replace("pro", "Pro"));
		System.out.println(s1.replaceAll("a", "A"));
		System.out.println(s1.replaceFirst("like", "love"));
		System.out.println(s1.replace("like", "Love"));

	}

}
