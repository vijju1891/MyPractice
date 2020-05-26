package com.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	
	 public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] output = new int[2];
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			System.out.println(diff);
			System.out.println(map.get(3));
			if(map.get(diff) != null && map.get(diff) != map.get(nums[i])) {
				System.out.println("enter");
				output[0] = i;
				output[1] = map.get(diff);
				return output;
			}
		}
		return output;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] input = {3,3};
			TwoSum tSum = new TwoSum();
			int[] output = new int[2];
			output = tSum.twoSum(input, 6);
			System.out.println(output[0] +"  "+ output[1]);
			
	}

}
