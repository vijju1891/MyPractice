package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	 public boolean isHappy(int n) {
		 int sum = 0;
		 Set<Integer> set = new HashSet<Integer>();
		 while(true) {
			 while(n > 0) {
				 sum  = (int) (sum + Math.pow((n % 10), 2));
				 n = n / 10; 
			 }
			 if(sum == 1) {
				 return true;
			 }
			 else if(set.contains(sum)){
				return false;
			 }
			 set.add(sum);
			 n = sum;
		 }
		   
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.isHappy(19));
				
	}

}
