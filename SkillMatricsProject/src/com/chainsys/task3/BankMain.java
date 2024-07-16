package com.chainsys.task3;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("Enter the choice to see Balance \n 1) bank1 \n 2) bank2 \n 3) bank3 \n 4) Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				Bank bank1 = new Bank1();
				System.out.println(bank1.getBalance());
				break;
			}
			case 2: {
				Bank bank2 = new Bank2();
				System.out.println(bank2.getBalance());
				break;
			}
			case 3: {
				Bank bank3 = new Bank2();
				System.out.println(bank3.getBalance());
				break;
			}
			default: {
				run=false;
			}
			}
		}
		sc.close();
	}
}
