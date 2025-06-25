package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {

		try {

			int a = 10;
			int b = 20;
			int c = 30;
			System.out.println(a + b);
			System.out.println(a / c);

			int aa[] = { 10, 20, 30, 40, 50 };
			System.out.println(aa[2]);
			System.out.println(aa[40]);

			String s1 = "10";
			int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);

			String s11 = null;
			// System.out.println(s11.length());

			String s111 = "Hello Java and Hello Python";
			System.out.println(s111.charAt(12));
			System.out.println(s111.charAt(14));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
