package com.bridgeLabz.basiccoreprograms;

public class PrimeFactorization {
	public static void main(String[] args) {
		int valueOfN = 24;
		System.out.println("Prime factors of " + valueOfN + ": ");
		for (int i = 2; i <= Math.sqrt(valueOfN); i += 2) {
			while (valueOfN % i == 0) {
				System.out.println(i + " ");
				valueOfN /= i;
			}
		}

		if (valueOfN > 2)
			System.out.println(valueOfN);
	}
}