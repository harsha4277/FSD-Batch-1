package com.dl.six;

import java.util.TreeMap;

public class Eg3 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(5, "NameFive");
		treeMap.put(3, "NameThree");
		treeMap.put(1, "NameOne");
		treeMap.put(2, "NameTwo");
		treeMap.put(6, "NameSix");
		treeMap.put(7, "NameSeven");
		System.out.println(treeMap); // {1=NameOne, 2=NameTwo, 3=NameThree, 5=NameFive, 6=NameSix, 7=NameSeven}

		//treeMap.put(null, "NameSix");
		//treeMap.put(null, "NameSeven");
		treeMap.put(8, null);
		treeMap.put(9, null);
		System.out.println(treeMap);
		
		System.out.println(treeMap.size());

	}

}
