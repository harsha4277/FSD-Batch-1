package com.dl.two;

public class ProfileSomeError {

	public void m1() {
		this.m1();
		System.out.println("M1 Method");
	}
	
	public static void main(String[] args) {

		ProfileSomeError profile = new ProfileSomeError();
		profile.m1();
	}
}