package com.dl.two.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Eg1 {

	public static void main(String[] args) {

		// Enumeration Vector and Stack
		Vector<String> vector = new Vector<>();
		vector.add("NameOne");
		vector.add("NameTwo");
		vector.add("NameThree");
		vector.add("NameFour");
		vector.add("NameFive");
		System.out.println(vector);

		Enumeration<String> elements = vector.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

	}

}
