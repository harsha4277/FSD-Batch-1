package com.dl.two;

public class Eg9 {

	public static void main(String[] args) {

//		int a[] = new int[-5];
//		a[-4] = 10;
//		a[-3] = 20;
//		System.out.println(a[-4]); //java.lang.NegativeArraySizeException
//		System.out.println(a[-3]);
		
		int a[] = new int[0];
		System.out.println(a);
		a[0] = 10;
		System.out.println(a[0]); // java.lang.ArrayIndexOutOfBoundsException:

	}

}
