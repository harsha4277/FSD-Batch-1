package com.dl.one;

public class Eg12 {

	public static void main(String[] args) {

		String s1 = "Hello Java and Hello Python";
		char[] ch = s1.toCharArray();
		ch[15] = 'h';
		System.out.println(ch);

		String s2 = "JavaProgramming";
		System.out.println(s2.substring(0, 5)); // JavaP

		StringBuffer sb = new StringBuffer("Java");
		StringBuffer deleteCharAt = sb.deleteCharAt(0);
		System.out.println(deleteCharAt);
	}

}
