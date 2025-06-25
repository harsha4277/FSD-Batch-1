package com.dl.one;

public class Eg4 extends Thread {

	public static void main(String[] args) {

		Eg4 eg4 = new Eg4();
		System.out.println(eg4.getName());
		
		Thread.currentThread().setName("Custom Thread");
		System.out.println(Thread.currentThread().getName());

	}

}
