package com.dl.one;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Eg19 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(3);
		l1.add(2);
		l1.add(5);
		l1.add(4);
		l1.add(6);
		Stream<Integer> sorted = l1.stream().sorted();
		System.out.println("Natural Sorting");
		sorted.forEach( (n) -> System.out.print(n));

	}

}
