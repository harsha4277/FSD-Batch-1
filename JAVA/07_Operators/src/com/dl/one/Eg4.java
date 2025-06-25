package com.dl.one;

import java.util.Scanner;

public class Eg4 {

	public static void main(String[] args) {

		// Comparision == <= >= != > <
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a: ");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("Enter value b: ");
		int b = sc.nextInt();
		System.out.println(b);

		System.out.println(a == b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);

		sc.close();
	}

}
