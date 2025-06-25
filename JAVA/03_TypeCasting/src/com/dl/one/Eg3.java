package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {

		// Casting
		byte b1 = 10;
		long l1 = b1;
		System.out.println(l1);

		long l2 = 10;
		byte b2 = (byte) (short) (int) (long) (float) (double) l2;
		System.out.println(b2);

		int i1 = 10;
		int i2 = 20;
		long l3 = (long) (i1 + i2);
		System.out.println(l3);

		float f1 = 20f;
		int i3 = 30;
		byte b3 = (byte) (f1 + i3);
		System.out.println(b3);

		int i4 = 50;
		short s1 = (byte) i4;
		System.out.println(s1);

		float f2 = 60f;
		double d1 = (int) f2;
		System.out.println(d1);

		int ii = 2000;
		byte bb = (byte) ii;
		System.out.println(bb); // -48

	}

}

//Key points
//Casting : Converting from one data type to another data type
//Implicit : assign lower to higher (compiler)
//Explicit : assign higher to lower (developer)

//Left is Bigger : Right Side is Smaller
//In explicit Casting both left and right must be same

//Assignment:
//
