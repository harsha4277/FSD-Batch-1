package com.dl.one.overriding;

class SBI extends RBI {

	public int rateOfInterest() {
		return 5;

	}
}

class AXIS extends RBI {
	public int rateOfInterest() {
		return 6;

	}

}

class ICICI extends RBI {
	public int rateOfInterest() {
		return 7;
	}

}

public class Banks {

	public static void main(String[] args) {
		
		RBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		
		RBI axis = new AXIS();
		System.out.println(axis.rateOfInterest());
		
		RBI icici = new ICICI();
		System.out.println(icici.rateOfInterest());
		
	}
}
