package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int output = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length;i++) {
        	if(map.containsKey(nums[i])) {
        		map.put(nums[i], map.get(nums[i]) + 1);
        	}
        	else {
        		map.put(nums[i], 1);
        	}
        }
        for(int key : map.keySet()) {
        	if((nums.length / 2) < map.get(key)) {
        		output = key;
        		break;
        	}
        }
        return output;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,2,1,1,1,2,2};
		MajorityElement jElement = new MajorityElement();
		System.out.println(jElement.majorityElement(input));
	}		
}