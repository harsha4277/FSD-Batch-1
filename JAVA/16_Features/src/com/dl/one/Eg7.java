package com.dl.one;

@FunctionalInterface
interface Sigin {

	public abstract void login();
}

class UserOne implements Sigin {

	@Override
	public void login() {

		System.out.println("Login Mehtod Invoked");
	}

}

public class Eg7 {

	public static void main(String[] args) {

		//Constructor
		UserOne userOne = new UserOne();
		userOne.login();
		
		//Ploymorphsim
		Sigin sigin = new UserOne();
		sigin.login();
		
		//Anonymus Inner Type Implementation
		Sigin signin = new Sigin() {
			
			@Override
			public void login() {
				System.out.println("Login Method Invoked");
				
			}
		};
		signin.login();
	}

}
