package com.dl.one;

class AAA implements Runnable {

	@Override
	public void run() {

		System.out.println("04 Run Method of Class A");

		synchronized (this) {
			System.out.println("05 Synchronized Block of Class A");
			for (int i = 1; i < 5; i++) {
				System.out.println("06 Loop Inside Run Method and Synchronized Block");
			}
			notify();
		}
	}

}

public class Eg12 {

	public static void main(String[] args) throws InterruptedException  {

		AAA  a = new AAA();
		System.out.println("01 Object A Ref "); 
		
		Thread t = new Thread(a);
		t.start();
		System.out.println("02 Start Method"); 
		
		synchronized (a) {
			System.out.println("03 Synchronized Block of Class Eg12"); 
			a.wait();
			for (int i = 1; i < 5; i++) {
				System.out.println("07 Loop Inside Synchronized Block");
			}
		}
	}

}

//Object A Ref Thread[Thread-0,5,main]
//Start Method
//Synchronized Block of Class Eg12
//0 Loop Inside Synchronized Block
//1 Loop Inside Synchronized Block
//Thread A: 0
//2 Loop Inside Synchronized Block
//3 Loop Inside Synchronized Block
//Thread A: 1
//4 Loop Inside Synchronized Block
//Thread A: 2
//Thread A: 3
//Thread A: 4

