package com.dl.one;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Eg4 {

	public static void main(String[] args) {

		// Set HashSet LinkedHashSet TreeSet
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("E");
		hashSet.add("C");
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("C");
		hashSet.add(null);
		System.out.println(hashSet);
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("D");
		linkedHashSet.add("F");
		linkedHashSet.add("E");
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("D");
		treeSet.add("F");
		treeSet.add("E");
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		//treeSet.add(null);
		System.out.println(treeSet);

	}

}
