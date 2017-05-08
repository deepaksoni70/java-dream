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
public class Lead extends Employee {
	public void displayLeadSal() {
		System.out.println("I am Lead and my Salary is : " + getSalary());
	}
}
