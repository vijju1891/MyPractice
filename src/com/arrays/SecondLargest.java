package com.arrays;

public class SecondLargest {
	
	public void isSecond(int[] input) {
		for(int i = 0; i < input.length; i++) {
			for(int j = i+1 ; j < input.length ; j++) {
				if(input[i] < input[j]) {
					int temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}
		System.out.println("second largest number = "+ input[1]);
		for(int i = 0 ; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public void secondBigNumber(int[] input) {
		if(!(input.length > 2)) {
			return;
		}
		int firstmax = input[0] ;
		int secondMax = Integer.MIN_VALUE ;
		for(int i = 1; i < input.length; i++) {
			if(input[i] > firstmax) {
				firstmax = input[i];
			}
		}
		for(int i = 1; i < input.length; i++) {
			if(input[i] < firstmax && input[i] > secondMax) {
				secondMax = input[i];
			}
		}
		System.out.println("second Max = "+secondMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5};
		SecondLargest sLargest = new SecondLargest();
		//sLargest.isSecond(input);
		sLargest.secondBigNumber(input);
	}

}
