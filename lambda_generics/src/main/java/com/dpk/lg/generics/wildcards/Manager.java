/**
 *Copyright © 2017, Manager.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.lg.generics.wildcards;

/**
 * @author deepak
 *
 */
public class Manager extends Employee {
	public void displayManagerSal() {
		System.out.println("I am Manager and my Salary is : " + getSalary());
	}
}
