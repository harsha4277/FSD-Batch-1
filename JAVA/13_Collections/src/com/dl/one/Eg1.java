package com.dl.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eg1 {

	//Arrays //Index call //loops //Arrays Methods
	//Colections is a class // number of methods
	//Collection is a interface //List and Set //Mehtods, Loops, Cursors
	//Map is not child interface of Collection
	//Collection --- List --- ArrayList --- LinkedList --- Vector --- Stack
	public static void main(String[] args) {
		
		//ArrayList maintains Insertion Order //Allows duplicate
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("NameOne");
//		list.add("NameTwo");
//		list.add("NameThree");
//		list.add("NameFour");
//		list.add("NameFive");
//		list.add("NameFour");
//		System.out.println(list);
		
		//Using Index position we are assiging values
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add(0, "NameZero");
//		arrayList.add(1, "NameOne");
//		arrayList.add(2, "NameTwo");
//		arrayList.add(3, "NameThree");
//		arrayList.add(4,"NameFour");
//		System.out.println(arrayList.size());
//		System.out.println(arrayList);
		
		//Duplicate index will move the elements next postion
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add(0, "NameOne");
//		arrayList.add(1, "NameFour");
//		arrayList.add(2, "NameFive");
//		arrayList.add("NameZero");
//		arrayList.add("NameThree");
//		System.out.println(arrayList);
//		
//		arrayList.add(2, "NameTwo");
//		System.out.println(arrayList);
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("NameOne"); //create
//		list.add("NameTwo");
//		list.add("NameThree");
//		list.add("NameFour");
//		list.add("NameFive");
//		list.add("NameFour");
//		System.out.println(list);
//		System.out.println(list.get(3)); // read
//		
//		list.set(0, "NameZero"); //update
//		System.out.println(list);
//		
//		System.out.println(list.remove(0)); //delete
//		System.out.println(list);
//		
		//passing argument in arraylist constructor
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add(0, "NameZero");
//		arrayList.add(1, "NameOne");
//		arrayList.add(2, "NameTwo");
//		arrayList.add(3, "NameThree");
//		arrayList.add(4,"NameFour");
//		
//		ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
//		arrayList2.add("UserOne");
//		arrayList2.add("UserTwo");
//		arrayList2.add("UserThree");
//		arrayList2.add("UserFour");
//		arrayList2.add("UserFive");
//		System.out.println(arrayList2);
		
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add(0, "NameZero");
//		arrayList.add(1, "NameOne");
//		arrayList.add(2, "NameTwo");
//		arrayList.add(3, "NameThree");
//		arrayList.add(4,"NameFour");
//		
//		ArrayList<String> arrayList2 = new ArrayList<>();
//		arrayList2.add("UserOne");
//		arrayList2.add("UserTwo");
//		arrayList2.add("UserThree");
//		arrayList2.add("UserFour");
//		arrayList2.add("UserFive");
//		arrayList.addAll(3, arrayList2);
//		System.out.println(arrayList2);
//		System.out.println(arrayList);
		
//		LinkedList<String> linkedList = new LinkedList<String>();
//		linkedList.add(0, "NameOne");
//		linkedList.add(1, "NameTwo");
//		linkedList.add(2, "NameThree");
//		linkedList.add(3, "NameFour");
//		linkedList.add(4, "NameFive");
//		linkedList.add(5, "NameSix");
//		linkedList.add(6, "NameSeven");
//		//linkedList.add(3, "NameFourDuplicate");
//		System.out.println(linkedList);
//		
//		System.out.println(linkedList.getFirst());
//		System.out.println(linkedList.getLast());
//		
//		System.out.println(linkedList.indexOf("NameFour"));
//		System.out.println(linkedList.lastIndexOf("NameSeven"));
//		
//		System.out.println(linkedList.get(0));
//		
//		System.out.println(linkedList.set(0, "NameOneD"));
//		System.out.println(linkedList);
//		
//		System.out.println(linkedList.remove(0));
//		System.out.println(linkedList);
		
//		ArrayList<String> arrayList3 = new ArrayList<>();
//		arrayList3.add(null);
//		arrayList3.add(null);
//		arrayList3.add(null);
//		arrayList3.add(null);
//		System.out.println(arrayList3);
//		
//		LinkedList<String> linkedList3 = new  LinkedList<>();
//		linkedList3.add(null);
//		linkedList3.add(null);
//		linkedList3.add(null);
//		linkedList3.add(null);
//		System.out.println(linkedList3);
		
		List<String> arrayList3 = new ArrayList<>();
		arrayList3.add("D");
		arrayList3.add("A");
		arrayList3.add("C");
		arrayList3.add("B");
		arrayList3.add("E");
		arrayList3.add("G");
		arrayList3.add("F");
		arrayList3.sort(null);
		System.out.println(arrayList3);
		
		Collections.reverse(arrayList3);
		System.out.println(arrayList3);
	}
	
}
