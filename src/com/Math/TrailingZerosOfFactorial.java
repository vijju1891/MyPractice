package com.Math;

public class TrailingZerosOfFactorial {
	public long factorial(long input) {
		if(input == 0)
			return 1;
		else if(input == 1)
			return 1;
		else {
			return input * factorial(input - 1);
		}
	}
	
	public long trailingZeros(long input) {
		long factorial = factorial(input);
		String fact = String.valueOf(factorial);
		int count = 0;
		for(int i = fact.length() - 1; i >= 0; i--) {
			if(fact.charAt(i) != '0') {
				break;
			}
			count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long input = 1;
		TrailingZerosOfFactorial tFactorial = new TrailingZerosOfFactorial();
		System.out.println(tFactorial.factorial(input));
		System.out.println(tFactorial.trailingZeros(input));
	}

}
