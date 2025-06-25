package com.dl.two;

public class Eg6 {

	public static void main(String[] args) {
		
		int a[] = { 10, (int) 20.0, 30, (int) 40.0, 50 };
		System.out.println(a);

		int i = 0;
		while (i<5) {
			System.out.println(a[i]);
			i++;
		}
		
		int j = 0;
		do {
			System.out.println(a[j]);
			j++;
		} while (j<5);

	}

}
