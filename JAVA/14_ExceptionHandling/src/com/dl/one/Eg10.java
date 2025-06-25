package com.dl.one;

import java.io.File;
import java.io.IOException;

public class Eg10 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("one.txt");
		f.createNewFile();
		System.out.println("File Created");
	}
}
