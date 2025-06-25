package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {

		// public final class Integer extends Number implements Comparable<Integer>
		Integer i1 = 10; // WC
		int i2 = 20; // Primitive data type
		System.out.println(i1 + i2);

		Double d1 = 10d;
		double d2 = 30;
		byte b1 = (byte) (d1 + d2);
		System.out.println(b1);

		// Wrapper Class
		// The constructor Integer(int) has been deprecated since version 9 and marked
		// for removal
		Integer ii = 10; // Object converting to PT
		int iii = ii;
		System.out.println(iii);

	}

}
