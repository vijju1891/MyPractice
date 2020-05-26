package com.Integer;

public class ProductAndSum {
	 public int subtractProductAndSum(int n) {
	        int sum = 0;
	        int product = 1;
	        while(n > 0) {
	        	int reminder = n % 10;
	        	sum = sum + reminder;
	        	product = product * reminder;
	        	n = n/10;
	        }
	        return product - sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 234;
		ProductAndSum pSum = new ProductAndSum();
		System.out.println(pSum.subtractProductAndSum(n));
	}

}
