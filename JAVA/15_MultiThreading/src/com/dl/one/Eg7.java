package com.dl.one;

public class Eg7 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}
	}

}
