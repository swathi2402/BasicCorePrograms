package com.bridgeLabz.basiccoreprograms;

public class PowerOfTwo {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int power = 1;
		System.out.println("Table of powers of 2 of number " + number);
		if(number >= 0 && number < 31) {
			if (number == 0) {
				System.out.println("2 ^ " + number + " is " + power);
			}
			for (int index = 1; index <= number; index++) {
				power *= 2;
				System.out.println("2 ^ " + index + " is " + power);
			}
		}
		
		else {
			System.out.println("Number should be between 0 and 31");
		}
	}
}
