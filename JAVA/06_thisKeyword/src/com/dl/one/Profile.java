package com.dl.one;

public class Profile {

	public String firstName;
	public String lastName;
	public String email;
	public long contactNo;
	public String address;
	
//	public Profile(String firstName, String lastName, String email, long contactNo, String address) {
//		firstName = firstName;
//		lastName = lastName;
//		email = email;
//		contactNo = contactNo;
//		address = address;
//	}

	public Profile(String fName, String lName, String mail, long cNo, String add) {
		firstName = fName;
		lastName = lName;
		email = mail;
		contactNo = cNo;
		address = add;
	}
	
//	public Profile(String firstName, String lastName, String email, long contactNo, String address) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.contactNo = contactNo;
//		this.address = address;
//	}

	public void display() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(contactNo);
		System.out.println(address);
	}
	

	public static void main(String[] args) {
		
		Profile profile = new Profile("Admin", "Admin", "admin@gmail.com", 9876543210L, "Hyd");
		profile.display();
	}

}
