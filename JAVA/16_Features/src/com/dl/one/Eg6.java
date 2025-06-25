package com.dl.one;

@FunctionalInterface
interface UserName{
	
	public String userName(String name, String password);
	
}
public class Eg6 {

	public static void main(String[] args) {
		
		UserName uName = (name, password) -> {
			return name + password;
		};
		
		System.out.println(uName.userName("Admin ", "Admin"));
	}

}
