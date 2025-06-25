package com.dl.five;

public class Eg5 {

	String productName = "Samsung";
	String productDescription = "Samsuung Note 15";
	static float productPrice = 30000f;
	float productDiscount = 2000f;
	float afterDiscount = productPrice-productDiscount; // InstV = s-i

	public static void main(String[] args) {

		new Eg5().order();
		new Eg5().test();
		test2();
	}
	
	public void order() {
		System.out.println(productName);
		System.out.println(productDescription);
		System.out.println(afterDiscount);
		
	}

	int a = 10;
	static int b = 20;
	
	public void test() {
		System.out.println(a+b);
	}
	public static void test2() {
		//System.out.println(a); // Cannot make a static reference to the non-static field a
		System.out.println(b);
	}
}
