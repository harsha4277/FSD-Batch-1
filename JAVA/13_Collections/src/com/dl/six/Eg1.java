package com.dl.six;

import java.util.HashMap;

public class Eg1 {

	public static void main(String[] args) {

		// HashMap //LinkedHashMap //TreeMap
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(5, "NameFive");
		hashMap.put(3, "NameThree");
		hashMap.put(1, "NameOne");
		hashMap.put(2, "NameTwo");
		hashMap.put(6, "NameSix");
		hashMap.put(7, "NameSeven");
		System.out.println(hashMap); // {1=NameOne, 2=NameTwo, 3=NameThree, 5=NameFive, 6=NameSix, 7=NameSeven}
		
		hashMap.put(null, null);
		hashMap.put(null, null);
		System.out.println(hashMap); // {null=null, 1=NameOne, 2=NameTwo, 3=NameThree, 5=NameFive, 6=NameSix, 7=NameSeven}

		System.out.println(hashMap.size()); // 7
		
		hashMap.put(8, null);
		hashMap.put(9, null);
		System.out.println(hashMap); // {null=null, 1=NameOne, 2=NameTwo, 3=NameThree, 5=NameFive, 6=NameSix, 7=NameSeven, 8=null, 9=null}
		System.out.println(hashMap.size()); // 9
		
		hashMap.put(2, "NameTwoDupliacte");
		System.out.println(hashMap);
		
	}
}
