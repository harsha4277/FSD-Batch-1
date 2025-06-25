package com.dl.three;

public enum Books {

	JavaBook, PythonBook, JavaScriptBook;

	public static void main(String[] args) {

		Books[] values = Books.values();
		for (Books books : values) {
			System.out.println(books);
			System.out.println(books.ordinal());
		}

		Books valueOf = Books.valueOf("PythonBook");
		System.out.println(valueOf);

	}
}
