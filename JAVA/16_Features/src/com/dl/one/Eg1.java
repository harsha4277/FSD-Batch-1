package com.dl.one;

public class Eg1 {

	static int x = 5;
	int y = 10;

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("Local V: " + a);
		System.out.println("Local V: " + b);

		System.out.println("Static V: " + x);
		System.out.println("Local V: " + new Eg1().y);

	}

}
