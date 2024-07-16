package com.chainsys.task2;

import java.util.Scanner;


public class MyClass {
	
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Employee[] employees = addEmployee(3);
		System.out.println("Employee with Highest Rating : "+findEmployeeWithSecondHighestRating(employees));
		System.out.println("No of Employees using the company Transport : "+findCountOfEmployeesUsingCompTransport(employees,"mechanical"));
	}
	public static int findCountOfEmployeesUsingCompTransport(Employee[] employees,String branch) {
		int count=0;
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getBranch().equals(branch) && employees[i].isCompanyTransport()==true) {
				count++;
			}
		}
		return count;
	}
	public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
		for(int i=0;i<2;i++) {
			for(int j=i+1;j<employees.length-1;j++) {
				if(employees[i].getRating()<employees[j].getRating()) {
					Employee temp=null;
					temp=employees[i];
					employees[i]=employees[j];
					employees[j]=temp;
				}
			}
		}
		return employees[1];
	}
	public static Employee[] addEmployee(int noOfEmployee) {
		Employee[] employee = new Employee[noOfEmployee];
		for (int i = 0; i < noOfEmployee; i++) {
			System.out.println("Enter the employee Id");
			int id = sc.nextInt();
			System.out.println("Enter the employee name");
			String name = sc.next();
			System.out.println("Enter the employee branch");
			String branch = sc.next();
			System.out.println("Enter the employee rating");
			double rating = sc.nextDouble();
			System.out.print("Enter the CompanyTransport (true or false)");
			boolean companyTransport = sc.nextBoolean();
			employee[i]=new Employee(id, name, branch, rating, companyTransport);
		}
		return employee;
	}
}
