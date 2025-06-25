package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		String s1 = new String("A");
		String s2 = new String("B");
		String s3 = new String("C");
		String s4 = new String("a");
		
		System.out.println(s1.compareTo(s2)); // 65-66
		System.out.println(s1.compareTo(s3)); // 65-67
		
		System.out.println(s1.compareToIgnoreCase(s4)); // 0

	}

}
