package com.chainsys.programingFundamental;

public class Employee{
	private int id;
	private String name;
	private String desigantion;
	private double salary;
	
	public Employee(int id, String name, String desigantion, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.desigantion = desigantion;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesigantion() {
		return desigantion;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desigantion=" + desigantion + ", salary=" + salary + "]";
	}	
	
}
