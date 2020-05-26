package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {
	 public int lastStoneWeight(int[] stones) {
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i = 0; i < stones.length; i++) {
	        	list.add(stones[i]);
	        }
	        
	        while(list.size() > 1) {
	        	Collections.sort(list);
	        	
	        	int max = list.get(list.size() - 1);
	        	int second_max = list.get(list.size() - 2);
	        	list.set((list.size() - 1), max - second_max);
	        	list.remove(list.size() - 2);
	        	System.out.println(list);
	        	System.out.println(list.size());
	        }
	        return list.get(0);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2,4,1,1,1 };
		LastStoneWeight lWeight = new LastStoneWeight();
		System.out.println(lWeight.lastStoneWeight(input));
	}

}