package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		try {
			int a = 10;
			int b = 20;
			int c = 30;
			System.out.println(a+b);
			System.out.println(a/c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After");

	}

}
