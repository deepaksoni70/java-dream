/**
 *Copyright © 2017, EmployeeUtil.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.lg.generics.wildcards;

/**
 * @author deepak
 *
 */
public class EmployeeUtil {
	public static <T extends Employee> T increaseSal(T employee, int percent) {
		employee.setSalary((int) (employee.getSalary() * (1 + percent / 100d)));
		return employee;
	}
}
