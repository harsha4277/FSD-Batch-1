package com.dl.one;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {

//		if (false) {
//			System.out.println("if condition");
//		} else {
//			System.out.println("else condition");
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a: ");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("Enter value b: ");
		int b = sc.nextInt();
		System.out.println(b);
		int c;
		if (a == b) {
			c = 30;
			System.out.println(c);
		} else {
			c = 40;
			System.out.println(c);
		}
		sc.close();
	}

}
