package com.dl.one;

import java.util.stream.Stream;

public class Eg15 {

	public static void main(String[] args) {
		
		//(1,2,3,4,5);
		Stream<Integer> s = Stream.of(1,2,3,4,5,6);
		System.out.println(s.count());
	}
}
