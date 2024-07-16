package com.chainsys.programingFundamental;

import java.util.Scanner;

public class EmployeeAnalysis {
	public static Company company;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the no of the Employee");
		int num=sc.nextInt();
		Employee[] employees = addEmployee(num);
		System.out.println("Enter the CompanyName");
		String companyName = sc.next();
		while (!validation.validateCompanyName(companyName)) {
			System.out.println("Enter the company name in alphabet");
			companyName = sc.next();
		}
		company = new Company(companyName, employees, employees.length);
		System.out.println("Average Salary : " + getAverageSalary());
		System.out.println("Max Salary : " + getMaxSalary());
		System.out.println("Enter the employee designation");
		String designation = sc.next();
		getByDesignation(designation);
	}

	public static double getAverageSalary() {
		Employee[] employees = company.getEmployee();
		double averageSalary = 0;
		for (int i = 0; i < employees.length; i++) {
			averageSalary = averageSalary + employees[i].getSalary();
		}
		return averageSalary / employees.length;
	}

	public static double getMaxSalary() {
		Employee[] employees = company.getEmployee();
		double maxSalary = employees[0].getSalary();
		for (int i = 0; i < employees.length - 1; i++) {
			if (employees[i].getSalary() < employees[i + 1].getSalary()) {
				maxSalary = employees[i + 1].getSalary();
			}
		}
		return maxSalary;
	}

	public static void getByDesignation(String designation) {
		Employee[] employees = company.getEmployee();
		System.out.println("Employee By Designation");
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getDesigantion().equals(designation)) {
				System.out.println(employees[i]);
			}
		}
	}

	public static Employee[] addEmployee(int noOfEmployee) {
		Employee[] listOfEmployee = new Employee[noOfEmployee];
		for (int i = 0; i < noOfEmployee; i++) {
			System.out.println("Enter the employee Id");
			String id = sc.next();
			while (!validation.validateId(id)) {
				System.out.println("Enter the employee Id in number");
				id = sc.next();
			}
			System.out.println("Enter the employee name");
			String name = sc.next();
			while (!validation.validateName(name)) {
				System.out.println("Enter the correct employee name");
				name = sc.next();
			}
			System.out.println("Enter the employee designation");
			String desigantion = sc.next();
			while (!validation.validateDesigantion(desigantion)) {
				System.out.println("Enter the correct desigantion");
				desigantion = sc.next();
			}
			System.out.println("Enter the employee salary");
			String salary = sc.next();
			while (!validation.validateSalary(salary)) {
				System.out.println("Enter the correct employee salary");
				salary = sc.next();
			}
			listOfEmployee[i] = new Employee(Integer.parseInt(id), name, desigantion, Double.parseDouble(salary));
		}
		return listOfEmployee;
	}

	public class validation {
		private static String idRegex = "^[1-9]{1,}$";
		private static String nameRegex = "^[A-Za-z]{4,}$";
		private static String designationRegex = "^[A-Za-z]+";
		private static String salaryRegex = "^[1-9]{1}[0-9]{3,}$";
		private static String compamyNameRegex = "^[A-Za-z]{4,}$";
		private static String numOfEmployeeRegex = "^[1-9]{1,}$";

		public static boolean validateId(String id) {
			return id.matches(idRegex);
		}

		public static boolean validateName(String name) {
			return name.matches(nameRegex);
		}

		public static boolean validateDesigantion(String designation) {
			return designation.matches(designationRegex);
		}

		public static boolean validateSalary(String salary) {
			return salary.matches(salaryRegex);
		}

		public static boolean validateCompanyName(String companyName) {
			return companyName.matches(compamyNameRegex);
		}

		public static boolean validateNoOfEmployee(String noOfEmployee) {
			return noOfEmployee.matches(numOfEmployeeRegex);
		}
	}
}
