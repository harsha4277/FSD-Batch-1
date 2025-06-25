package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {

		// PT to ST // 2 Ways
		int a = 10;

		String string = Integer.toString(a);
		System.out.println(string);

		String ss = "" + a;
		System.out.println(ss);

		// ST to PT // 1 Way
		String s1 = "10";
		int parseInt = Integer.parseInt(s1);
		System.out.println(parseInt);
	}

}
