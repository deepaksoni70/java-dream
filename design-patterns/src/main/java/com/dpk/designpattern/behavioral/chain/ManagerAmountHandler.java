/**
 *Copyright © 2017, ManagerAmountHandler.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.designpattern.behavioral.chain;

/**
 * @author deepak
 *
 */
public class ManagerAmountHandler extends AmountHandler {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.dpk.designpattern.behavioral.chain.Handler#handleRequest(java.lang.
	 * Object)
	 */
	@Override
	public void handleRequest(Integer t) {
		if (t <= 30000) {
			printMessage("Manager has approved the amount : " + t, MessageType.INFO);
		} else {
			passToNextHandler(t);
		}

	}

}
