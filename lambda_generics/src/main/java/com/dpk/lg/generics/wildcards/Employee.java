/**
 *Copyright © 2017, Employee.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.lg.generics.wildcards;

/**
 * @author deepak
 *
 */
public class Employee {

	private int salary;

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void displayEmpSal() {
		System.out.println("I am Employee and my Salary is : " + salary);
	}

}
