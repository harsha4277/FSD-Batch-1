package com.dl.two;

public interface Profile {

	int id = 101;
	public static final String userName = "Sai";
	String email = "sai@gmail.com";
	long contact = 9876543210L;
	String address = "Hyd";
	
	public static void main(String[] args) {
		
		System.out.println(id);
		System.out.println(userName);
		System.out.println(email);
		System.out.println(contact);
		System.out.println(address);
		
	}
	
}
