package com.chainsys.programingFundamental;

public class Company{
	private String companyName;
	private Employee[] employee;
	private int numOfEmployee;
	public Company(String companyName, Employee[] employee, int numOfEmployee) {
		super();
		this.companyName = companyName;
		this.employee = employee;
		this.numOfEmployee = numOfEmployee;
	}
	public String getCompanyName() {
		return companyName;
	}
	public Employee[] getEmployee() {
		return employee;
	}
	public int getNumOfEmployee() {
		return numOfEmployee;
	}
}
