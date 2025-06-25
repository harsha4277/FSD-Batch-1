package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {

		//String Literals //Pool Area
		String s1 = "Java"; //1
		String s2 = "Java"; //1
		String s3 = "Python"; //1
		
		System.out.println(s1.equals(s2)); // content // true
		System.out.println(s1 == s2 ); // ref // true
		System.out.println(s1 == s3); // false 

		//using new Keyword // Heap Area
		String ss1 = new String("Spring"); //2
		String ss2 = new String("Spring"); //2
		String ss3 = new String("SpringBootMicroServices"); //2
		
		System.out.println(ss1.equals(ss2)); // true
		System.out.println(ss1 == ss2); // false

	}

}
