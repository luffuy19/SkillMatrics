package com.chainsys.programingFundamental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	public static String name;
	public static long accountNumber;
	public static String branch;
	public static String IFSC;
	public static double exixtingBalance = 10000.0;
	public static double withdrawal;
	public static Scanner scanner = new Scanner(System.in);
	
	public static List<User> detail=new ArrayList<User>();
	

	public static double withdrawal(double withdrawAmount) {
		exixtingBalance = exixtingBalance - withdrawAmount;
		return exixtingBalance;
	}
	public static void addUser() {
		User user = new User();
		for(int i=0;i<1;i++) {
			System.out.println("add User");
			System.out.println("Enter the name");
			name=scanner.next();
			while(!validation.validateName(name)) {
				System.out.println("Enter the name only in letter");
				name=scanner.nextLine();
			}
			user.setName(name);
			System.out.println("Enter the Account Number");
			String accountNo=scanner.next();
			while(!validation.validateAccountNo(accountNo)) {
				System.out.println("Enter the correct Account number");
				accountNo=scanner.next();
			}
			user.setAccountNumber(accountNumber);
			accountNumber = Long.parseLong(accountNo);
			System.out.println("Enter the IFSC Number");
			IFSC=scanner.next();
			while(!validation.validateIFSC(IFSC)) {
				System.out.println("Enter the correct IFSC number");
				IFSC=scanner.next();
			}
			user.setIFSC(IFSC);
			detail.add(user);
		}
	}
	public static void login() {
		System.out.println("ATM");
		System.out.println("Enter the name");
		name=scanner.next();
		while(!validation.validateName(name)) {
			System.out.println("Enter the name only in letter");
			name=scanner.nextLine();
		}
		System.out.println("Enter the Account Number");
		String accountNo=scanner.next();
		while(!validation.validateAccountNo(accountNo)) {
			System.out.println("Enter the correct Account number");
			accountNo=scanner.next();
		}
		accountNumber = Long.parseLong(accountNo);
		System.out.println("Enter the IFSC Number");
		IFSC=scanner.next();
		while(!validation.validateIFSC(IFSC)) {
			System.out.println("Enter the correct IFSC number");
			IFSC=scanner.next();
		}
	}
	public static void main(String[] args) {
		addUser();
		login();
		int n = 1;
		for(User user:detail) {
			if(user.getAccountNumber()==accountNumber && user.getIFSC().equals(IFSC) && user.getName().equals(name)) {
				while (n == 1) {
					System.out.println("Enter the choice \n 1) Withdrawal \n 2) Deposit \n 3) Exit");
					int choice = scanner.nextInt();
					switch(choice) {
					case 1: {
						System.out.println("Enter the amount");
						withdrawal = scanner.nextDouble();
						if (withdrawal < exixtingBalance) {
							exixtingBalance = withdrawal(withdrawal);
							System.out.println("Balance amount : " + exixtingBalance);

						} else {
							System.out.println("Blanace limit exceed");
						}
						break;
					}
					case 2: {
						System.out.println("Enter the deposit Amount");
						int amount = scanner.nextInt();
						if(amount%100==0 && amount>100) {
							exixtingBalance = exixtingBalance + amount;
							System.out.println("Balanace : " + exixtingBalance);
						}
						else {
							System.out.println("Denomination should be 100 or 500 or 1000");
						}
						break;
					}
					case 3: {
						n = 2;
					}
					}
				}
			}
		}
	}
	public class validation{
		public static String nameRegex="^[a-zA-Z]{5,}$";
		public static String accountRegex="^[1-9]{1}[0-9]{11}$";
		public static String IFSCRegex="^[A-Z]{4}0[0-9]{6}$";
		public static boolean validateName(String name) {
			return name.matches(nameRegex);
		}
		public static boolean validateAccountNo(String accountNumber) {
			return accountNumber.matches(accountRegex);
		}
		public static boolean validateIFSC(String IFSC) {
			return IFSC.matches(IFSCRegex);
		}
	}
}
