/**
 *Copyright © 2017, Wildcards.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.lg.generics.wildcards;

/**
 * Setup:
 *
 * Employee class. Manager extends Employee, Lead extends Employee.
 * create a method which will take any Employee Object using Upper bounded generics,
 * increase his salary by 20 % and return the same object.
 *
 * i.e. Employee e = increaseSal(employee);
 *      Manager m = increaseSal(manager);
 *      Lead l = increaseSal(lead);
 *
 * @author deepak
 *
 */
public class Wildcards {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setSalary(1000);
		Manager m = new Manager();
		m.setSalary(100000);
		Lead l = new Lead();
		l.setSalary(10000);

		Employee newemp = EmployeeUtil.increaseSal(e1, 20);
		newemp.displayEmpSal();

		Manager newMan = EmployeeUtil.increaseSal(m, 30);
		newMan.displayManagerSal();

		Lead newLead = EmployeeUtil.increaseSal(l, 10);
		newLead.displayLeadSal();
	}
}
