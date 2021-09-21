package com.Xworkz.oopsConcepts;

public class Booking {

	int price;
	int date;
	int time;
	int seat;
	String name;
	
	public void payment() {
		System.out.println(" payment after booking slot");
	}
	public void notification() {
		System.out.println(" notification of time and date");
	}
	public void availability() {
		System.out.println(" Number of seat availability");
	}
	
	
}
