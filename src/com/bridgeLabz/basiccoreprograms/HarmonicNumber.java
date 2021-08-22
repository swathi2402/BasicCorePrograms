package com.bridgeLabz.basiccoreprograms;

public class HarmonicNumber {
	public static void main(String[] args) {
		int ValueOfN = 3;
		float harmonicValue = 0;
		if(ValueOfN != 0) {
			for (int index = 1; index <= ValueOfN; index++) {
				harmonicValue += (float)1 / index;
		    }
		}
		System.out.println("Final Harmonic Value of " + ValueOfN + " is " + harmonicValue);
	}
}
