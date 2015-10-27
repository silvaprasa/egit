package com.prasad.egit;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();

		displayGreeting();
		data.display();

		System.out.println("test 1");

	}

	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE.");
		System.out.println("THIS APP SHOWS SALES DATA.");
		System.out.println("----------------------------");
	}
}
