package com.Goldman;

public class SecondMaxInteger {
	public void secondMax(int[] input) {
		int max = 0;
		for(int i = 0; i < input.length; i++) {
			if(max < input[i]) {
				max = input[i];
			}
		}
		System.out.println("max= "+max);
		int secondMax = 0;
		for(int i = 0; i < input.length; i++) {
			//System.out.println(input[i]+" "+secondMax + "  "+ max+ " ");
			if(secondMax < input[i] && input[i] < max) {
			
				secondMax = input[i];
			}
		}
		System.out.println(secondMax);
		
	}
	
	public void minLength(int[] input, int target) {
		int sum = 0;
		int count = 0; 
		int min_length = 10000;
		for(int i = 0 ; i < input.length; i++) {
			for(int j = i; j < input.length; j++) {
				//System.out.println(sum);
				if(sum < target) {
					sum = sum + input[j];
					count++;
				}
				if(sum >= target) {
					if(min_length > count) {
						min_length = count ;					
					}
					
				}
			}
			sum = 0;
			count = 0;
			
		}
		if(min_length == 10000)
			System.out.println("-1");
		else
		System.out.println(min_length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,3,1,2,6,5,5,4,6};
		int target = 6;
		SecondMaxInteger sInteger = new SecondMaxInteger();
	//	sInteger.minLength(input, target);
		sInteger.secondMax(input);
	}

}
