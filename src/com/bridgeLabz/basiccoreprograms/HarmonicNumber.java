package com.bridgeLabz.basiccoreprograms;

public class HarmonicNumber {
	public static void main(String[] args) {
		int valueOfN = 3;
		float harmonicValue = 0;
		if(valueOfN != 0) {
			for (int index = 1; index <= valueOfN; index++) {
				harmonicValue += (float)1 / index;
		    }
		}
		System.out.println("Final Harmonic Value of " + valueOfN + " is " + harmonicValue);
	}
}
