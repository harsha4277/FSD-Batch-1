package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {

		// bitwise operators & | ^ ~ 
		// & both conditions must satisfy
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);

		// | any condition must satisfy
		System.out.println(true | true);
		System.out.println(false | true);
		System.out.println(true | false);
		System.out.println(false | false);
		
		//^
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		
		//~
		int a = 10;
		System.out.println(~a);  
		// 0000000000001010
		// 1111111111110101
		
		int b = -11;
		System.out.println(~b);
		

	}

}
