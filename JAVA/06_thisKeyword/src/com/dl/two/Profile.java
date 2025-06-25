package com.dl.two;

public class Profile {

	public void m1() {
		m2(); //this.m2();
		System.out.println("M1 Method");
		m3(); //this.m3();
	}

	public void m2() {
		System.out.println("M2 Method");
	}
	
	public void m3() {
		System.out.println("M3 Method");
	}

	public static void main(String[] args) {

		Profile profile = new Profile();
		profile.m1();
	}

}
