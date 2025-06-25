package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		
		//String type to Object type // 2 Ways
		String s1 = "10";
		
		//Using Parameterized Cons
		Integer i1 = new Integer(s1);
		System.out.println(s1);
		
		//valueOf()
		Integer valueOf = Integer.valueOf(s1);
		System.out.println(valueOf);
		
		//Object type to String Type // 2 Ways
		
		//Parameterized Cons
		Integer ii = new Integer(10);
		String string = ii.toString();
		System.out.println(string);
		
		//Using + operator
		String ss = ""+ii;
		System.out.println(ss);
	}
}
