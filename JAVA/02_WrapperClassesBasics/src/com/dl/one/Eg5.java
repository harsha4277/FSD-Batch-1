package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {

		// PT to OT // 3 Ways
		int i = 10;

		System.out.println("Primitive Type to Object Type");
		//Using Parameterized Constructor
		Integer i1 = new Integer(i);
		System.out.println(i1);

		//Using valueOf() Method
		Integer valueOf = Integer.valueOf(i);
		System.out.println(valueOf);

		// Auto-boxing 
		Integer autoBoxing = i;
		System.out.println(autoBoxing);
		
		System.out.println("Object Type to Primitve Type");
		//OT to PT // 2 Ways
		Integer ii = new Integer(10);
		int intValue = ii.intValue();
		System.out.println(intValue);
		
		//Auto-Unboxing
		int iii = ii;
		System.out.println(iii);

	}

}
