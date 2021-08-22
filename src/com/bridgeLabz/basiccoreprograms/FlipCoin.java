package com.bridgeLabz.basiccoreprograms;

public class FlipCoin {

	public static void main(String[] args) {
		int numberOfFlips = 10;
		int headsCount = 0;
		
		for (int index = 0; index < numberOfFlips; index++) {
			if (numberOfFlips <= 0) {
				System.err.println("Number of flips should be a positive integer");
			} 
			else {
				if (Math.random() > 0.5) {
					headsCount++;
				}
			}
		}
		
		int headaPercentage = (headsCount * 100) / numberOfFlips;
		int tailsPercentage = 100 - headaPercentage;
		System.out.println("Heads Percentage: " + headaPercentage);
		System.out.println("Tails Percentage: " + tailsPercentage);
	}
}
