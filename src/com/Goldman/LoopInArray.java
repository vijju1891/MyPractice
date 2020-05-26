package com.Goldman;

public class LoopInArray {
	
	public void haveLoop(int[] input) {
		int[] visit = new int[input.length];
		int i = 0;
		while(i >= 0) {
			int temp = input[i];
			System.out.println(temp);
			if(visit[temp] != 1) {
				visit[temp] = 1;
				i = temp;
			}	
			else {
				System.out.println("loop encountered");
				for(int j = 0; j < visit.length; j++)
					System.out.print(" "+visit[j]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5, 2, 3, 1, 0, 4};
		LoopInArray lArray = new LoopInArray();
		lArray.haveLoop(input);
		
	}

}
