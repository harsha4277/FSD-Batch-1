package com.dl.one;

public class Eg21 {

	public static void main(String[] args) {

		add();
		Eg21.add();
		
		Thread t1 = new Thread(Eg21::add);
		t1.start();
		
		Thread  t2 = new Thread( () -> add());
		t2.start();
	}

	public static void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

}
