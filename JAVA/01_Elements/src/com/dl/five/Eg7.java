package com.dl.five;

public class Eg7 {

	public static void main(String[] args) {

		new Eg7().getAccountForCustomers("Admin", "Hyd", 9876654321L, "FGY8IO7TG"); // No Users
		getBanKDetails("ICICI", "ICI2000"); // Same Copy 
	}

	public static void getBanKDetails(String bankName, String ifsc) {
		System.out.println(bankName);
		System.out.println(ifsc);
	}

	// Instance Method
	public void getAccountForCustomers(String userName, String address, long contactNo, String pancard) {

		System.out.println(userName);
		System.out.println(address);
		System.out.println(contactNo);
		System.out.println(pancard);
	}

}
