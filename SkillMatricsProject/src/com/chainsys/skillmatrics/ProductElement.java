package com.chainsys.skillmatrics;

import java.util.Arrays;

public class ProductElement {
//	4.Implement a function which, given an array of integers, returns a new array for which every index carries the value of the product of the remaining elements.
//	Example
//	Given array [1, 3, 2, 4, 5] it would return [120, 40, 60,30, 24]
//	Given array [4, 10, 3] it would return [30, 12, 40]
	public static void productOfElement(int[] arr) {
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int sum=1;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					sum=sum*arr[j];
				}
			}
			arr1[i]=sum;
		}
		System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		productOfElement(new int[]{1,3,2,4,5});
	}
}
