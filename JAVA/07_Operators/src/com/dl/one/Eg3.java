package com.dl.one;

import java.util.Scanner;

public class Eg3 {

	// Unary ++ --
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a: ");
		int a = sc.nextInt();
//		System.out.println(a++); // in memeory 11 but increment later
//		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		sc.close();
	}

}
