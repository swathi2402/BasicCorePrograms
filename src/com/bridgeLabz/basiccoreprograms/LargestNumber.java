package com.bridgeLabz.basiccoreprograms;

public class LargestNumber {
	public static void main(String[] args) {
		int firstNumber = 50;
		int secondNumber = 40;
		int thirdNumber = 30;
		if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Largest number is:" + firstNumber);
        }
        else if(secondNumber > thirdNumber){
            System.out.println("Largest number is:" + secondNumber);
        }
        else {
            System.out.println("Largest number is:"+thirdNumber);
        }
	}
}
