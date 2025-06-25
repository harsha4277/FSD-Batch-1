package com.dl.variables.two;

import com.dl.variables.Parent;

public class SubChildClass extends Parent{

	public static void main(String[] args) {

		System.out.println(new SubChildClass().userName); //protected
		System.out.println(userContactNo);
		
		//public 
		System.out.println(Parent.userContactNo);
		
	}

}

//