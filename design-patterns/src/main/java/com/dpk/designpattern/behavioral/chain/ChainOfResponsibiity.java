/**
 *Copyright © 2017 , Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.designpattern.behavioral.chain;

import org.apache.log4j.BasicConfigurator;

/**
 * <pre>
 * This class demonstrate the Chain of Responsibility pattern, In this pattern
 * we follow the if else type of request handling. If first handler is not able
 * to handle the request, it will pass on to second one, if second is also not
 * able to handle the request, then it will pass it to third one and so on.
 *
 * Example Below will approve the expense based on the the amount. 1. If amount
 * is less than 1000, clerk can approve it. 2. If amount is less than 10000,
 * manager will approve it. 3. If amount is less than 100000, CFO will approve
 * it. 4. All other will be approved by CEO.
 *
 * @author deepak
 *
 */
public class ChainOfResponsibiity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Handler<Integer> leadHandler = new LeadAmountHandler();
		Handler<Integer> managerHandler = new ManagerAmountHandler();
		leadHandler.setNextHandler(managerHandler);
		managerHandler.setNextHandler(new CEOAmountHandler());

		leadHandler.handleRequest(900);
		leadHandler.handleRequest(2000);
		leadHandler.handleRequest(50000);
		leadHandler.handleRequest(900000);

	}

}
