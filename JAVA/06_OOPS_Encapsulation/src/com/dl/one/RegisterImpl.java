package com.dl.one;

public class RegisterImpl extends Register {

	public static void main(String[] args) {
		
		RegisterImpl impl = new RegisterImpl();
		impl.setId(101);
		impl.setUserName("Sai");
		impl.setEmail("sai@gmail.com");
		impl.setContact(9876543210L);
		impl.setAddress("Hyd");
		
		System.out.println(impl.getId());
		System.out.println(impl.getUserName());
		System.out.println(impl.getEmail());
		System.out.println(impl.getContact());
		System.out.println(impl.getAddress());
		
	}
}
