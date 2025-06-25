package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread); // Thread[main,5,main]
		System.out.println(currentThread.getName()); // main
		System.out.println(currentThread.getClass()); // class java.lang.Thread
		System.out.println(currentThread.getState()); // RUNNABLE
	}

}
