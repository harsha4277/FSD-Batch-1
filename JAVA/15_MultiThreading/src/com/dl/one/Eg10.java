package com.dl.one;

class AA{
	
	public synchronized void m1() {
		
		for (int i = 0; i <5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
		}
	}
}

class BB extends Thread{
	
	AA a;

	public BB(AA a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}
	
	
}

class CC extends Thread{
	
	AA a;

	public CC(AA a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}
	
}

class DD extends Thread{
	
	AA a;

	public DD(AA a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}
	
}
public class Eg10 extends Thread {

	AA a;
	
	
	public Eg10(AA a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}


	public static void main(String[] args) {
		
		AA a = new AA();
		BB b = new BB(a);
		CC c = new CC(a);
		DD d = new DD(a);
		
		b.start();
		c.start();
		d.start();

	}

}
