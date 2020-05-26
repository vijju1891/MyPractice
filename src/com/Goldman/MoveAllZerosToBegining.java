package com.Goldman;

public class MoveAllZerosToBegining {
	public void moveZeros(int[] input) {
		if(input.length <= 0)
			return;
		int pointer = 0;
		int temp;
		for(int i = 0; i < input.length; i++) {
			if(input[i] == 0) {
				temp = input[pointer];
				input[pointer] = input[i];
				input[i] = temp;
				pointer++;
			}
		}
		for(int i = 0; i < input.length; i++) {
			System.out.print(" "+ input[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 6,0,8};
		MoveAllZerosToBegining mToBegining = new MoveAllZerosToBegining();
		mToBegining.moveZeros(input);
	}

}
