package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		
		//OOPS
		
		//Object is an Instance of Class
		//State and Behaviour
		//Eg: Bike : state: color, cc etc.. behaviour: runs on the road
		//Diff b/w is-a and has-a (data member)
		
		//Inheritance : Acquiring Properties : Single, Multiple, Multilevel, Hierararchial, Hybrid; 
		//Polymorphism : Many Forms : Method Overloading and Method Overriding
		//Abstraction : Hiding the Data : Abstract Methods
		//Encapsulation : Wrapping Data : Private Properties, Public Methods // Setters and Getters
		
		
		//No need of Type Casting // XXX Methods
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enetr number a: ");
//		int valueOne = sc.nextInt();
//		System.out.println(valueOne);
//		
//		System.out.println("Enetr number b: ");
//		int valueTwo = sc.nextInt();
//		System.out.println(valueTwo);
//		
//		System.out.println(valueOne+valueTwo);
//		
//		sc.close();
		
		//Arthemtaic Operators
//		int a = 10;
//		int b = 10;
//		System.out.println(a+b);
		
		//Depend on Casting
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Salary: ");
		String readLine = bufferedReader.readLine();
		System.out.println(readLine);
//		int parseInt = Integer.parseInt(readLine);
//		System.out.println(parseInt);
		
		System.out.println("Enter id number: ");
		int read = bufferedReader.read();
		System.out.println(read);
		System.out.println((char)read);
		
		
	}

}
