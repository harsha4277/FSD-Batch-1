package com.dl.one;

public class Eg1 {

	//Implicit Casting
	//Byte--Short--Integer--Long--Float--Double
	//------------ Character
	public static void main(String[] args) {
		
		byte b1 = 10;
		short s1 = b1;
		System.out.println(s1);
		
		short s2 = 20;
		int i1 = s2;
		System.out.println(i1);
		
		int i2 = 30;
		long l2 = i2;
		System.out.println(l2);
		
		long l3 = 40;
		float f1 = l3;
		System.out.println(f1);
		
		float f2 = 50f;
		double d1 = f2;
		System.out.println(d1);
		
		//Explicit
		char ch = 'A';
		byte b11 = (byte)ch;
		System.out.println(b11);
		
		char ch2 = 'B';
		short s11 = (short)ch2;
		System.out.println(s11);
		
		char ch3 = 'C';
		int i3 = ch3;
		System.out.println(i3);
		
		
	}

}
