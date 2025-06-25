package com.dl.two.cursors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Eg2 {

	public static void main(String[] args) {

		//Iterator List and Set
		ArrayList<String> list = new ArrayList<String>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");
		System.out.println(list);

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(" ");
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("NameOne");
		hashSet.add("NameTwo");
		hashSet.add("NameThree");
		hashSet.add("NameFour");
		hashSet.add("NameFive");
		
		Iterator<String> iterator2 = hashSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
