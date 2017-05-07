/**
 *Copyright © 2017, AmountHandler.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.designpattern.behavioral.chain;

import org.apache.log4j.Logger;

/**
 * @author deepak
 *
 */
public abstract class AmountHandler implements Handler<Integer> {

	Logger LOG = Logger.getLogger(AmountHandler.class);

	private Handler<Integer> nextHadnler;

	public void passToNextHandler(Integer t) {
		if (nextHadnler == null) {
			printMessage("No one can handle this request! sorry!", MessageType.ERROR);
		} else {
			nextHadnler.handleRequest(t);
		}
	}

	/**
	 * @param nextHadnler
	 *            the nextHadnler to set
	 */
	@Override
	public void setNextHandler(Handler<Integer> nextHandler) {
		this.nextHadnler = nextHandler;
	}

	public void printMessage(String message, MessageType type) {
		if (type == MessageType.ERROR) {
			LOG.error(message);
		} else {
			LOG.info(message);
		}

	}

}
