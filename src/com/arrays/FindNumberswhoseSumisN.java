package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumberswhoseSumisN {
	public boolean find(int[] input, int number, int left, int right) {
		
		if(right >= left) {
			int pivot = (left + right)/2;
			if(input[pivot] == number)
				return true;
			else if(input[pivot] > number) {
				System.out.println("pivot > number");
				return find(input,  number, left, pivot);
			}			
			else
			   return find(input,  number, pivot, right);
		}
		
		return false;
	}
	
	public void findNumbers(int[] input, int sum) {
		Arrays.parallelSort(input);
		for(int i = 0; i < input.length; i++) {
			int difference = input[i] - sum;
			if(find(input, difference, i+1, input.length - 1)) {
				System.out.println(input[i] + " , " + difference);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 3, 2,5,4,6};
		Scanner s = new Scanner(System.in);
		System.out.println("enter sum");
		int sum = s.nextInt();
		FindNumberswhoseSumisN f = new FindNumberswhoseSumisN();
		f.findNumbers(input, sum);
	}

}
