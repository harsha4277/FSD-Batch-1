package com.dl.three;

public class Client {

	public static void main(String[] args) {

		ProfileImpl profileImpl = new ProfileImpl();
		profileImpl.m1();
		profileImpl.m2();
		profileImpl.m3();
		profileImpl.m4();

		ProfileOne profileOne = new ProfileImpl();
		profileOne.m1();
		profileOne.m2();

		ProfileTwo profileTwo = new ProfileImpl();
		profileTwo.m3();
		profileTwo.m4();

	}

}
