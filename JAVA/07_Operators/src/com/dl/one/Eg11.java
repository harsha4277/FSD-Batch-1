package com.dl.one;

public class Eg11 {

	public static void main(String[] args) {
		
		System.out.println(true && true);
		int a = 10;
		int b = 20;
//		boolean c = (a++ ==10 && b++ == 20);
//		System.out.println(c);
//		System.out.println(a); // 11
//		System.out.println(b); // 21
		
//		System.out.println(false && true);
//		boolean c = (a++ == 11 && b++ == 20);
//		System.out.println(c);
//		System.out.println(a); // 11
//		System.out.println(b); // 20
		
//		System.out.println(true && false);
//		boolean c = (a++ == 10 && b++ == 21);
//		System.out.println(c);
//		System.out.println(a); // 11
//		System.out.println(b); // 21
		
		System.out.println(false && false);
		boolean c = (a++ == 11 && b++ == 21);
		System.out.println(c);
		System.out.println(a); // 11
		System.out.println(b); // 20
		
		
	}

}
