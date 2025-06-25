package com.dl.one;

@FunctionalInterface
interface Variables{
	
	void sum();
}

public class Eg2 implements Variables{
	
	static int x = 5;
	int y = 10;

	public static void main(String[] args) {
		
		new Eg2().sum();
	}

	@Override
	public void sum() {
		
		int a = 10, b = 20;
		System.out.println("Local V: " + a);
		System.out.println("Local V: " + b);
		System.out.println("Static V: " + x);
		System.out.println("Local V: " + new Eg2().y);
	}

}
