package com.dl.one;

class JDBC {

	static {
		System.out.println("Connection Connected");
	}
}

public class Eg6 {

	public static void main(String[] args) {

		try {
			Class.forName("com.dl.one.JDBC");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
