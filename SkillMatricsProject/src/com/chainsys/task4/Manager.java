package com.chainsys.task4;

public class Manager extends Member {
	String department;
	String specialization;
	public Manager(String name, int age, long phoneNumber, String address, int salary, String department,
			String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department + ", specialization=" + specialization + ", name=" + name + ", age="
				+ age + ", phoneNumber=" + phoneNumber + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
