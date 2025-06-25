package com.dl.one;

public class Eg2 {

	//Explicit Casting
	// Double--Float--Long--Integer--Short--Byte
	// ---------------------Character
	public static void main(String[] args) {

		double d1 = 10.0f;
		float f1 = (float) d1;
		System.out.println(f1);

		float f2 = 20.0f;
		long l1 = (long) f2;
		System.out.println(l1);

		long l2 = 30;
		int i1 = (int) l2;
		System.out.println(i1);

		int i2 = 65;
		char ch1 = (char) i2;
		System.out.println(ch1);

		int i3 = 70;
		short s2 = (short) i3;
		System.out.println(s2);

		short s3 = 30;
		byte b1 = (byte) s3;
		System.out.println(b1);
	}

}
