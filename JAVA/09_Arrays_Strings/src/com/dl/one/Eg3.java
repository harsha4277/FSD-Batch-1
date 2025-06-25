package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {

		// Immutable
		String s1 = "Java"; // 1 // SCP
		String s2 = s1.concat("Java"); // Heap Area
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false

		String s3 = new String("Java"); // SCP // HeapArea
		String s4 = s3.concat("Java"); // HeapArea
		System.out.println(s1.equals(s4)); // false
		System.out.println(s3 == s4); // false
		
		String s5 = new String("Python");
		System.out.println(s5.concat("Django").concat("DRF"));
	}

}
