package com.chainsys.task3;

public class Bank2 implements Bank {
	double depositAmount=1000.0;
	double rateOfIntrest=4.0;
	@Override
	public double getBalance() {
		return depositAmount*rateOfIntrest;
	}
}
