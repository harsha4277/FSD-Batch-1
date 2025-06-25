package com.dl.two.methods;

public class Eg2 {

	public static void main(String[] args) {

		new Eg2().m1(); // new ClassName().instanceMethod()
		new Eg2().m2(); // new ClassName().instanceMethod()
		new Eg2().m3(); // new ClassName().instanceMethod()
		new Eg2().m4(); // new ClassName().instanceMethod()

		System.out.println(" ");
		
		Eg2 eg2 = new Eg2();
		eg2.m1(); // Objectref.instanceMethod()
		eg2.m2();
		eg2.m3();
		eg2.m3();

	}

	// Non Static Variable / Instance Method
	public void m1() {
		System.out.println("M1 Method");
	}

	public void m2() {
		System.out.println("M2 Method");
	}

	public void m3() {
		System.out.println("M3 Method");
	}

	public void m4() {
		System.out.println("M4 Method");
	}
}
