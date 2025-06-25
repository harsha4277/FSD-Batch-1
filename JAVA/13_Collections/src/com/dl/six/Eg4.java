package com.dl.six;

import java.util.HashMap;

public class Eg4 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "NameOne");
		hashMap.put(2, "NameTwo");

		HashMap<Integer, String> hashMap2 = new HashMap<>(hashMap);
		hashMap2.put(3, "NameThree");
		hashMap2.put(4, "NameFour");
		System.out.println(hashMap2);

	}

}
