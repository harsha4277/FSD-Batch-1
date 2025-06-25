package com.dl.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Eg17 {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Pradeep");
		l1.add("Praneeth");
		l1.add("Mahesh");
		l1.add("Vikas");
		System.out.println(l1);
		
		List<String> l2 = l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);

	}

}
