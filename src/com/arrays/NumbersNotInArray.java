package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersNotInArray {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
		   
		    List<Integer> output = new ArrayList<Integer>();
		    if(nums.length > 0) {
		    	 Set<Integer> list = new HashSet<Integer>();
			        for(int i = 0; i < nums.length; i++){
			            list.add(nums[i]);
			        }
			        for(int i = 1; i <=nums.length ; i++) {
			        	if(!(list.contains(i))){
			        		output.add(i);
			        	}
			        }
		    }
		    return output;
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {};
			NumbersNotInArray nArray = new NumbersNotInArray();
			System.out.println(nArray.findDisappearedNumbers(input));
	}

}
