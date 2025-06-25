package com.dl.one;

public class Eg8 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Eg8 eg1 = new Eg8();
		Eg8 eg2 = new Eg8();
		Eg8 eg3 = new Eg8();
		
		eg1.start();
		eg1.join();
		eg2.start();
		eg2.join();
		eg3.start();
		eg3.join();
		
	}

}
