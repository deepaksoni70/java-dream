/**
 *Copyright © 2017, ErasureExample.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.lg.erasure;

import java.util.List;

/**
 * @author deepak
 *
 * Every generic type is used only for compilation purpose.
 * it doesn't maintain the information about the generics at runtime.
 * hence it provides the type safety.
 *
 *
 * run the command
 * javap -s -classpath target/classes com.dpk.lg.erasure.ErasureExample
 *
 * javap -s -c -classpath target/classes com.dpk.lg.erasure.ErasureExample
 *
 */
public class ErasureExample<T, B extends Comparable<B>> {

	public T unbounded(T t) {
		return t;
	}

	public void lists(List<String> p1, List<List<String>> p2) {
		String s = p1.get(0);
	}

	public B bounded(B b) {
		return b;
	}

}
