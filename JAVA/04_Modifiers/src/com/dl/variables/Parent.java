package com.dl.variables;

public class Parent {

	// Modifies // We can access all the variables here
	private static int userId = 101;
	protected String userName = "Admin";
	public static long userContactNo = 987654321L;
	static double userSalary = 10000;

	public static void main(String[] args) {

		System.out.println(userId);
		System.out.println(new Parent().userName);
		System.out.println(userContactNo);
		System.out.println(userSalary);
	}

}
