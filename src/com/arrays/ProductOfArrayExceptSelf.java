package com.arrays;

public class ProductOfArrayExceptSelf {
	 public int[] productExceptSelf(int[] nums) {
	        int total_product = 1;
	        int[] output = new int[nums.length];
	        for(int i = 0; i < nums.length; i ++) {
	        	total_product = total_product * nums[i];
	        }
	        for(int j = 0; j < nums.length; j++) {
	        	output[j] = total_product/nums[j];
	        }
	        return output;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input =  {1,2,3,4};
		ProductOfArrayExceptSelf pSelf = new ProductOfArrayExceptSelf();
		System.out.println(pSelf.productExceptSelf(input));
	}

}
