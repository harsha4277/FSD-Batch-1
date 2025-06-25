package com.dl.three.overloading;

public class Eg1 {

	public static void main(String[] args) {

		// MethodOverloading //Method Name Must be Same // Args must be different
		// In Overloading One class is sufficient
		// Types of Overloading // Method Overloading // Operator Overloading //
		// Constructor Overloading

		Eg1 eg1 = new Eg1();
		eg1.fuleCost(90f, 90f);
		eg1.fuleCost(90d, 90d);
		eg1.fuleCost(90, 90);

	}

	public void fuleCost(float pPrice, float dPrice) {

		System.out.println("Petorl Price: " + pPrice);
		System.out.println("Discel Price: " + dPrice);
	}

	public void fuleCost(double pPrice, double dPrice) {

		System.out.println("Petorl Price: " + pPrice);
		System.out.println("Discel Price: " + dPrice);
	}

	public void fuleCost(int pPrice, int dPrice) {

		System.out.println("Petorl Price: " + pPrice);
		System.out.println("Discel Price: " + dPrice);
	}

}
