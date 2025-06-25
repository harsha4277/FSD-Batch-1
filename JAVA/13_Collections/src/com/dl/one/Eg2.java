package com.dl.one;

import java.util.Vector;

public class Eg2 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("NameOne");
		vector.add("NameTwo");
		vector.add("NameThree");
		vector.add("NameFour");
		vector.add("NameFive");
		System.out.println(vector);
		
		
		Vector<String> v = new Vector<String>(vector);
		v.add("One");
		v.add("Two");
		v.add("Three");
		v.add("Four");
		v.add("Five");
		System.out.println(v);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
	}
	

}
