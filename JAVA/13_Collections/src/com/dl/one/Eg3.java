package com.dl.one;

import java.util.Stack;

public class Eg3 {

	public static void main(String[] args) {

//		Stack<String> stack = new Stack<String>();
//		stack.add("D");
//		stack.add("F");
//		stack.add("E");
//		stack.add("B");
//		stack.add("A");
//		stack.add("C");
//		System.out.println(stack);
		
//		stack.add(0, "a");
//		stack.add(7, "b");
//		System.out.println(stack);
		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		Stack<String> stack = new Stack<String>();
		stack.push("D");
		stack.push("F");
		stack.push("E");
		stack.push("B");
		stack.push("A");
		stack.push("C");
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.search("C"));
		
		
		System.out.println(stack.empty());
		stack.clear();
		System.out.println(stack.empty());
		
		
	}
	

}
