package com.Xworkz.oopsConcepts;

public class Bank {

	String name;
	String ifsc;
	String branch;
	long phonenumber;
	long aadharnumber;
	
	public void payToAccount() {
		System.out.println(" amount is credit to user account");
	}
	public void withdraw() {
		System.out.println(" amount is debited from user account");
	}
	public void loan() {
		System.out.println(" can take any kind of loan");
	}
	
}
