package com.arrays;

public class MaxiumSubArray {
	public int maxArray(int[] input) {
		int maximum_so_far = Integer.MIN_VALUE;
		int current_maxium = 0;
		for(int i = 0; i < input.length; i++) {
			
			if(current_maxium < input[i] && current_maxium < 0) {
				current_maxium = input[i];
			}
			else {
				current_maxium = current_maxium + input[i];
			}
			if(maximum_so_far < current_maxium) {
				maximum_so_far  = current_maxium;
			}
		}
		return maximum_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2};
		MaxiumSubArray mArray = new MaxiumSubArray();
		System.out.println(mArray.maxArray(input));
		
	}	
}
