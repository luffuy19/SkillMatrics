package com.chainsys.skillmatrics;

import java.util.Arrays;

public class Sorting {
//	3.Your task is to sort the array in non-decreasing order and print out the original indices of the new sorted array.
//	Example:
//	A={4,5,3,7,1}
//	After sorting the new array becomes A={1,3,4,5,7}.
//	The required output should be "4 2 0 1 3"
	public static int[] sortIndex(int[] arr1) {
        int temp;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        return arr1;
    }
	public static void main(String[] args) {
		int[] arr={4,5,3,7,1};
		int[] arr1 = sortIndex(new int[] {4,5,3,7,1});
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==arr1[i]) {
					System.out.print(j);
				}
			}
		}
		
	}
}
