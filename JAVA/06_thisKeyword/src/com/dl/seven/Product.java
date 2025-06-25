package com.dl.seven;

public class Product {

	public void m1() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		Product product = new Product();
		System.out.println(product);
		product.m1();
	}
}
