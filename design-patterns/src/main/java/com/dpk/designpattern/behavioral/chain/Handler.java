/**
 *Copyright © 2017, Handler.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.designpattern.behavioral.chain;

/**
 * @author deepak
 *
 */
public interface Handler<T> {

	public void handleRequest(T t);

	/**
	 * @param nextHandler
	 */
	public void setNextHandler(Handler<T> nextHandler);

}
