package com.dl.two;

public class Eg10 {

	public static void main(String[] args) {

		//Arrays : Mutable
		int []a = {10,20,30,40,50};
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//Strings : 
		char ch[] = {'p', 'y', 't', 'h', 'o', 'n'};
		System.out.println(ch);
		System.out.println(ch.length);
		
		//Strings : imutable
		String s1 = "python";
		System.out.println(s1.length());
	}

}
