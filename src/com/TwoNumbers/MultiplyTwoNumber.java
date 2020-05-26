package com.TwoNumbers;

import java.io.DataOutput;

public class MultiplyTwoNumber {
	
	
	public void multiply(double num1, double num2) {
		int zeroCount1 = 0 ;
		int zeroCount2 = 0;
	
		//split the string with "." as regex
		String[] firstarray = Double.toString(num1).split("\\.");	
		String[] secondarray = Double.toString(num2).split("\\.");
		//System.out.println(firstarray.length);
		//count the number of digits after decimals
		//append the string before decimal and after decimal
		StringBuffer s1 = new StringBuffer(firstarray[0]);
		StringBuffer s2 = new StringBuffer(secondarray[0]);
		if(firstarray.length == 2) {
			 zeroCount1 = firstarray[1].length();
			 s1.append(firstarray[1]);
		}
		if(secondarray.length == 2) {
			 zeroCount2 = secondarray[1].length();
			 s2.append(secondarray[1]);
		}
		System.out.println("s1==" +s1.toString());
		System.out.println("s2==" +s2.toString());
		//convert strings to long
		long integer1 = Long.valueOf(s1.toString());
		long interger2 = Long.valueOf(s2.toString());
		//perform multiplication
		long sum = 0;
		for(int j = 0; j < integer1; j++ ) {
			sum = interger2 + sum;
		}
		
		int countOfZeros = zeroCount1 + zeroCount2;
			double divisor= Math.pow(10, countOfZeros);
		
		//System.out.println(s.toString());
		System.out.println(sum);
		
		double mutiply = (sum / divisor);
		System.out.println(mutiply);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double number1 = 0;
			double number2 = 0;
			MultiplyTwoNumber m = new MultiplyTwoNumber();
			m.multiply(number1, number2);
	}

}
