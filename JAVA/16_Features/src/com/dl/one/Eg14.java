package com.dl.one;

import java.util.function.Predicate;

public class Eg14 {

	public static void main(String[] args) {

//	Predicate<Integer> p = x -> (x>50);
//	System.out.println(p.test(40));

//	Predicate<Integer> p1 = a-> a>100;
//	Predicate<Integer> p2 = a-> a<300;
//	Predicate<Integer> predicate = p1.and(p2);
//	boolean test = predicate.test(200);
//	System.out.println(test);
//	System.out.println("200 > 100 and 200 <300 so it is true");
		
//	Predicate<Integer> p = a-> a>100;
//	Predicate<Integer> predicate = p.negate();
//	boolean b1 = predicate.test(90);
//	System.out.println(b1);
//	boolean b2 = predicate.test(101);
//	System.out.println(b2);
		
//	String s1 = "Hello";
//	String s2 = "Hi";
//	Predicate<Object> p = Predicate.isEqual(s2);
//	System.out.println(p.test(s1));
//	System.out.println(p.test(s2));
		
	Predicate<String> predicate = (s) -> s.length() > 5;
	System.out.println(predicate.test("Hello Java"));

	}

}
