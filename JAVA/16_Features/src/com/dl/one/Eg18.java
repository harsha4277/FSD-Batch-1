package com.dl.one;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Eg18 {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(3);
		l1.add(2);
		l1.add(5);
		l1.add(4);
		l1.add(6);
		System.out.println("Orginal List: " + l1);

		Stream<Integer> stream = l1.stream();

		Optional<Integer> min = stream.min(Integer::compare);
		if (min.isPresent()) {
			System.out.println("Minimum Value : " + min.get());
		}

		stream = l1.stream();

		Optional<Integer> max = stream.max(Integer::compare);
		if (max.isPresent()) {
			System.out.println("Minimum Value : " + max.get());
		}
	}

}
