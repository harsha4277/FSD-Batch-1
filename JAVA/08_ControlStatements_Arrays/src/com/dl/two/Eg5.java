package com.dl.two;

import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {

		int a[] = { 10, (int) 20.0, 30, (int) 40.0, 50 };
		System.out.println(a);

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int size = sc.nextInt();
		System.out.println(size);
		int arraySize[] = new int[size];
		
		System.out.println("Enter the firstElement: ");
		int firstElement = sc.nextInt();
		arraySize[0]  = firstElement;
		System.out.println(arraySize[0]);
		
		System.out.println("Enter the secondElement: ");
		int secondElement = sc.nextInt();
		arraySize[1]  = secondElement;
		System.out.println(arraySize[1]);
		
		System.out.println("Enter the thirdElement: ");
		int thirdElement = sc.nextInt();
		arraySize[2]  = thirdElement;
		System.out.println(arraySize[2]);
		
		System.out.println("Enter the fourtElement: ");
		int fourthElement = sc.nextInt();
		arraySize[3]  = fourthElement;
		System.out.println(arraySize[3]);
		
		System.out.println("Enter the fiveElement: ");
		int fifthElement = sc.nextInt();
		arraySize[4]  = fifthElement;
		System.out.println(arraySize[4]);
		
		sc.close();
		
	}

}
