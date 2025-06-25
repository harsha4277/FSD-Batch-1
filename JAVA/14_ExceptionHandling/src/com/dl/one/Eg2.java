package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {

		System.out.println("Before");
		try {

			int a[] = { 10, 20, 30, 40, 50 };
			System.out.println(a[2]);
			System.out.println(a[20]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("After");
	}
}
