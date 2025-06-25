package com.dl.one;

import java.util.ArrayList;
import java.util.Iterator;

public class Eg20 {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Admin01");
		l1.add("Admin02");
		l1.add("Admin03");
		l1.add("Admin04");
		l1.add("Admin05");
		System.out.println(l1);

		l1.forEach(System.out::println);

		Iterator<String> iterator = l1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		l1.forEach(s -> System.out.print(s));
	}

}
