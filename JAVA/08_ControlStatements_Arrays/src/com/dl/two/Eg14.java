package com.dl.two;

import java.util.Arrays;

public class Eg14 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(a));

		int b[] = new int[5];
		Arrays.fill(b, 10);
		System.out.println(Arrays.toString(b));

		int c[] = { 10, 20 };
		int d[] = { 10, 20 };
		System.out.println(Arrays.equals(c, d));

		int e[] = { 67, 65, 72, 63, 70 };
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));

		String s1[] = { "D", "A", "C", "B" };
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		

	}

}
