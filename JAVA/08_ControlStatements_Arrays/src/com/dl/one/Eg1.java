package com.dl.one;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		
		//if condition
//		if (true) {
//			System.out.println("if condition");
//		}
		
//		if (false) {
//			System.out.println("if condition");
//		}

//		if(5>15) {
//			System.out.println("if condition");
//		}
		
//		int a = 5;
//		int b = 15;
//		if(a<b) {
//			System.out.println("if condition");
//		}
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		boolean b = (a == 10);
		if(b) {
			System.out.println(b);
		}
		sc.close();
	}

}
