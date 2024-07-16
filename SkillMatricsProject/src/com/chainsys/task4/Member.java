package com.chainsys.task4;

public class Member {
	String name;
	int age;
	long phoneNumber;
	String address;
	int salary;
	public int printSalary() {
		return salary;
	}
	public Member(String name, int age, long phoneNumber, String address, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", salary=" + salary + "]";
	}
	
}
