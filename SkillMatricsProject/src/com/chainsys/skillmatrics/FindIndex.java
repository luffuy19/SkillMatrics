package com.chainsys.skillmatrics;

public class FindIndex {
	
//	1. Program to print the following
//	SAMPLE INPUT
//	7 6
//	4 3 7 6 7 2 2
//	SAMPLE OUTPUT
//	3
	public static void main(String[] args) {
		int[] arr= {4,3,7,6,7,2,2};
		int num=76;
		
		for(int i=0;i<arr.length-1;i++) {
			if((arr[i]*10)+arr[i+1]==num) {
				System.out.println(arr[i-1]);
				break;
			}
		}
	}

}
