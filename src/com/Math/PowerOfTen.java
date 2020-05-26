package com.Math;

//given number is power of 10 or not
public class PowerOfTen {
	public void isPowerTen(int input) {
		while(input > 1) {
			int reminder  = input % 10;
			if(reminder != 0) {
				System.out.println("false");
				return;
			}
			input = input/10;	
			System.out.println(input);
		}
		System.out.println("true");
	}
	
	public void isPowerofTenUsingString( int input) {
		String value = String.valueOf(input);
		System.out.println(value);
		if(value.charAt(0) != '1') {
			System.out.println("false");
			return;
		}
		else {
			for(int i = 1; i < value.length(); i++) {
				System.out.println(value.charAt(i));
				if(value.charAt(i) != '0') {
					System.out.println("false");
					return;
				}
			}
			System.out.println("true");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		PowerOfTen pTen = new PowerOfTen();
		//pTen.isPowerTen(input);
		pTen.isPowerofTenUsingString(input);
		
	}

}
