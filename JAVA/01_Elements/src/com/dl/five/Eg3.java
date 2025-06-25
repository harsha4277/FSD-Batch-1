package com.dl.five;

public class Eg3 {

	public static void main(String[] args) {

		m2();
		new Eg3().m1();
	}

	// Instance Method
	public void m1() {
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	
	//Static Method
	public static void m2() {
		int c = 30;
		int d = 40;
		System.out.println(c);
		System.out.println(d);
	}

	{
		int x = 100;
		int y = 200;
		System.out.println(x);
		System.out.println(y);
	}
	
	static{
		int i = 1000;
		int j = 2000;
		System.out.println(i);
		System.out.println(j);
	}
}
