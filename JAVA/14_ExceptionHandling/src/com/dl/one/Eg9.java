package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		
		getCoupon("BX46789");

	}
	
	public static void getCoupon(String coupon) {
		
		if(coupon != "BX4678") {
			try {
				throw new Exception("Coupon Not Matched");
			} catch (Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("Finally Block");
			}
		}else {
			System.out.println(coupon);
		}
	}

}
