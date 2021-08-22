package com.bridgeLabz.basiccoreprograms;

public class Swap {
	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 20;
		System.out.println("Before swaping:" + firstNumber + " " + secondNumber);
		int tempVariable = 0;
		tempVariable = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tempVariable;
		System.out.println("After swaping:" + firstNumber + " " + secondNumber);
	}
}
