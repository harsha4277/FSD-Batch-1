package com.dl.two;

public class Eg8 {

	static final int a[] = new int[10];

	public static void main(String[] args) {

//		for (int i = 0; i < a.length; i++) { // load alll the elements, increment
//			System.out.println(a[i]);
//		}

//		for (int i = 0; i < 4; i++) { // load the elements based on condition, increment
//			System.out.println(a[i]);
//		}

		//itteratte the data over arrays and collectons
		for (int i : a) { // no condtion, no increment, enhanced for loop
			System.out.println(i);
		}
	}

}
