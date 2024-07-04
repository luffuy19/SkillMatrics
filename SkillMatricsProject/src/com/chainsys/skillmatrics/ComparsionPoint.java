package com.chainsys.skillmatrics;

public class ComparsionPoint {
//	2. We define the rating for Alice's challenge to be the triplet a = (a[0],a[1],a[2]), and the rating for Bob's challenge to be the triplet b = (b[0],b[1],b[2]).
//			Your task is to find their comparison points by comparing a[i] with b[i]
//			if a[i] > b[i] - alice is awarded 1 point
//			if a[i] < b[i] - bob is awarded 1 point
//			if a[i] = b[i] - then neither person receives a point.
//			Sample Input
//			5 6 7
//			3 6 10
//
//
//			Sample Output
//			1 1
//
//
//			Sample Input
//			17 28 30
//			99 16 8
//
//
//			Sample Output
//			2 1
	public static void getMarks(int[] person1,int[] person2) {
		int person1Mark=0;
		int person2Mark=0;
		for(int i=0;i<person1.length;i++) {
			if(person1[i]>person2[i]) {
				person1Mark++;
			}
			else if(person2[i]>person1[i]){
				person2Mark++;
			}
		}
		System.out.println("Alice "+person1Mark+"\n"+"Bob "+person2Mark);
	}
	public static void main(String[] args) {
		getMarks(new int[] {5,6,7}, new int[]{3,6,10});
		getMarks(new int[] {17,28,30}, new int[]{99,16,8});
	}
}
