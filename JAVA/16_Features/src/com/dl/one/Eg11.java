package com.dl.one;

public class Eg11 {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Main Thread");
			}
		});
		t.start();
	}
}

//Java + JDBC + Servlets(UI+Middleware) + JSP(UI)
//Java + JDBC + Servlets(Middleware) + JSP(UI) 
//Java + ORM + Spring + SpringBoot + JSP + JSTL Basics