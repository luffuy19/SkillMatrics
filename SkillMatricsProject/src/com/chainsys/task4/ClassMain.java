package com.chainsys.task4;

public class ClassMain {
	public static void main(String[] args) {
		Member member=new Member("Luffy",19,9940767083l,"Wano",30000);
		System.out.println(member);
		System.out.println("Salary of the Member : "+member.printSalary());
		Employee employee=new Employee("Luffy",19,9940767083l,"Wano",40000,"DataZap","Angular Devolper");
		System.out.println(employee);
		System.out.println("Salary of the Employee : "+employee.printSalary());
		Manager manager=new Manager("Luffy",19,9940767083l,"Wano",50000,"DataZap","Manager");
		System.out.println(manager);
		System.out.println("Salary of the Manager : "+manager.printSalary());
	}
}
