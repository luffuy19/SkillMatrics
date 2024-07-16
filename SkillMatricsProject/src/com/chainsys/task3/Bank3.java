package com.chainsys.task3;

public class Bank3 implements Bank {
	double depositAmount=2000.0;
	double rateOfIntrest=5.0;
	@Override
	public double getBalance() {
		return depositAmount*rateOfIntrest;
	}
}
