package com.dl.six;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Eg5 {

	public static void main(String[] args) {
		
		String s1 = new String("a");
		String s2 = new String("a");
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put(s1, "A");
		hashMap.put(s2, "B");
		System.out.println(hashMap);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();
		identityHashMap.put(s1, "A");
		identityHashMap.put(s2, "B");
		System.out.println(identityHashMap);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

	}

}
