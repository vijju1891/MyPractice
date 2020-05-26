package com.arrays;

import java.util.Arrays;

public class ShortUnsortedContinousArray {
	public int findUnsortedSubarray(int[] nums) {
        int[] b = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
        	b[i] = nums[i];
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
        	System.out.print("  "+b[i]);
        }
        int start = 0, end = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != b[i]) {
        		start= i;
        		break;
        	}
        }
        for(int i = nums.length-1; i >= 0; i--) {
        	if(nums[i] != b[i]) {
        		end= i;
        		break;
        	}
        }
        return (end - start) + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 6, 4, 8, 10, 9, 15};
		ShortUnsortedContinousArray s = new ShortUnsortedContinousArray();
		System.out.println(s.findUnsortedSubarray(input));
		
	}

}
