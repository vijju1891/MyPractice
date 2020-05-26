package com.arrays;

public class MoveZeroToEnd {
	public void moveBack(int[] input) {
		int[] output = new int[input.length];
		int left = 0;
		int right = output.length - 1;
		for(int i = 0; i < input.length; i++) {
			if(input[i] == 0) {
				output[right] = input[i];
				right--;
			}
			else {
				output[left] = input[i];
				left++;
			}
		}
		for(int i = 0; i < output.length; i++) {
			System.out.print(" "+output[i]);
		}
		
	}
	
	
	
	public void inPlaceMoveZeroToEnd(int[] input) {
		int zero = -1;
		int non_zero = 0;
		int i = 0;
		for(i = 0; i < input.length; i++) {
			if(input[i] == 0 && zero == -1) {
				zero = i;
			}
			if(input[i] != 0 && zero != -1) {
				non_zero = i;
				if(zero < non_zero) {
					int temp = input[zero];
					input[zero] = input[non_zero];
					input[non_zero] = temp;
					zero++;				
				}
			}
						
		}
		for(int j = 0; j < input.length; j++) {
			System.out.print(" "+input[j]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,1,0,0,5,6,0,8,7};
		int x= Integer.MIN_VALUE;
		MoveZeroToEnd mEnd = new MoveZeroToEnd();
		//mEnd.moveBack(input);
		mEnd.inPlaceMoveZeroToEnd(input);
	}

}
