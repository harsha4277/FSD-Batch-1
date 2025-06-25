package com.dl.three;

public abstract class Parent {
	
	int a = 10;
	int b = 20;
	
	static int c = 30;
	static int d = 40;

	public static void main(String[] args) {
		
		int e = 50;
		int f = 60;
		System.out.println("LV: " + e + " " + f);
		
		System.out.println("SV: " + c);
		System.out.println("SV: " + d);
		

	}

}
