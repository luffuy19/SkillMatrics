package com.chainsys.skillmatrics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
//	Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//			Ex 1: Given nums = [1,1,2],
//
//			Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//
//			It doesn't matter what you leave beyond the returned length.
//
//			Ex 2: Given nums = [0,0,1,1,1,2,2,3,3,4],
//
//			Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
//			It doesn't matter what values are set beyond the returned length.
	
	public static void removeDuplicate(int[] arr) {
		int duplicate=0;
		HashSet<int[]> hashSet = new HashSet<>(Arrays.asList(arr));
		System.out.println(duplicate);
	}
	public static void main(String[] args) {
		removeDuplicate(new int[] {1,1,2});
		removeDuplicate(new int[] {0,0,1,1,1,2,2,3,3,4});
	}
}
