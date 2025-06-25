package com.dl.one;

import java.util.Optional;
import java.util.stream.Stream;

public class Eg16 {

	public static void main(String[] args) {
		
		Stream<String> name = Stream.of("Mani", "Hari", "Mahesh", "Vikas");
		Optional<String> findFirst = name.filter(i -> i.startsWith("H")).findFirst();
		
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}else {
			System.out.println("No Name Checked");
		}

	}

}
