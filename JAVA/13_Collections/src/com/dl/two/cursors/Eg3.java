package com.dl.two.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Eg3 {

	public static void main(String[] args) {

		// List
		ArrayList<String> list = new ArrayList<String>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");
		System.out.println(list);

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

		System.out.println(" ");
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}

	}

}
