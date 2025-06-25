package com.dl.four;

public class Customer {

	public void m1(Customer customer) {

		System.out.println("M1 Method");
	}

	public void m2() {
		m1(this);
	}

	public static void main(String[] args) {

		Customer c = new Customer();
		c.m2();
	}
}
