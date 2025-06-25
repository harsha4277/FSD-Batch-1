package com.dl.six;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Eg6 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		String s1 = new String("a");
		hashMap.put(s1, 1);
		System.out.println(hashMap);
		
		s1 = null;
		System.gc();
		System.out.println(hashMap);
		
		WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
		String s2 = new String("a");
		weakHashMap.put(s2, 1);
		System.out.println(weakHashMap);
		
		s2 = null;
		System.gc();
		System.out.println(weakHashMap);
	}

}
