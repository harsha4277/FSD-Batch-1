package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
		
		//WC : PT to OT, 
		//OT to PT, 
		//OT to ST, 
		//ST to OT, 
		//ST to PT, 
		//PT to ST
		//Casting : Implicit Casting and Explicit Casting
		//Byte--Short--Integer--Long--Float--Double
		//Double--Float--Long--Integer-Short--Byte
		
		int i1 = 20;
		Integer i2 = i1;
		System.out.println(i2);
		
//		int i3 = 30;
//		Long l1 = (Long)i3;
		
		Long l2 = 40l;
		int i4 = (int)l2.intValue();
		System.out.println(i4);
		
		Byte b1 = 15;
		Short s1 = b1.shortValue();
		System.out.println(s1);
		
		byte b2 = 15;
		short s2 = b2;
		System.out.println(s2);
		
		

	}

}
