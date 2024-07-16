package com.chainsys.task4;

public class Employee extends Member {
	String department;
	String specialization;
	public Employee(String name, int age, long phoneNumber, String address, int salary,String department, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
		this.specialization = specialization;
	}
	
}
