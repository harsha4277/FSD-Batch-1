package com.dl.six;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Eg2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(5, "NameFive");
		linkedHashMap.put(3, "NameThree");
		linkedHashMap.put(1, "NameOne");
		linkedHashMap.put(2, "NameTwo");
		linkedHashMap.put(6, "NameSix");
		linkedHashMap.put(7, "NameSeven");
		System.out.println(linkedHashMap);
		
		linkedHashMap.put(8, null);
		linkedHashMap.put(9, null);
		System.out.println(linkedHashMap);
		
		linkedHashMap.put(null, null);
		linkedHashMap.put(null, null);
		System.out.println(linkedHashMap);
		
		Collection<String> values = linkedHashMap.values();
		System.out.println(values);
		
		Set<Integer> keySet = linkedHashMap.keySet();
		System.out.println(keySet);
		
		System.out.println(linkedHashMap.remove(3));
		System.out.println(linkedHashMap);
		
		linkedHashMap.clear();
		System.out.println(linkedHashMap);

	}

}
