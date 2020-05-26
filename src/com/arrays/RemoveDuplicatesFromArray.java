package com.arrays;
//input is sorted Array
public class RemoveDuplicatesFromArray {
		public void removeDuplicates(int[] nums) {
			
			int j = 0;
			for(int i = 0; i < nums.length - 1; i++) {
				if(nums[i] != nums[i+1]) {
					nums[j] = nums[i];
					j++;
				}
			}
			nums[j] = nums[nums.length - 1];
			for(int i = 0 ; i < nums.length; i++) {
				System.out.print(nums[i]+" ");
			}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,0,0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicatesFromArray rArray = new RemoveDuplicatesFromArray();
		rArray.removeDuplicates(input);
	}

}
