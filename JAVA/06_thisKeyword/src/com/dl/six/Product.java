package com.dl.six;

public class Product {

	public Product get() {

		Product p = new Product();
		return p;
	}

	public Product update() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Product product = new Product();
		System.out.println(product.get());
		System.out.println(product.get());
		System.out.println(product.get());
		
		System.out.println(product.update());
		System.out.println(product.update());
		System.out.println(product.update());
	}
}
