package com.bridgeLabz.basiccoreprograms;

public class LeapYear {
	public static void main(String[] args) {
		int yearToCheck = 2001;
		boolean isLeapYear = false;
		
		if (Integer.toString(yearToCheck).length() == 4) {
			if(yearToCheck % 4 == 0) {
				isLeapYear = true;
				if(yearToCheck % 400 == 0) {
					isLeapYear = true;
					if(yearToCheck % 100 == 0) {
						isLeapYear = true;
					}
					else {
						isLeapYear = false;
					}
				}
				else {
					isLeapYear = false;
				}
			}
			else {
				isLeapYear = false;
			}
		}
		else {
			System.err.println("Year should be a 4-digit number");
		}
		System.out.println(yearToCheck + " is a leap year? : " + isLeapYear);
	}
}
