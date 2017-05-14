/**
 *Copyright © 2017, RawTypeExample.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.lg.rawtypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author deepak
 *
 */
public class RawTypeExample {
	public static void main(String[] args) {
		List rawList = new ArrayList();
		rawList.add("Deepak");
		rawList.add(22);
		rawList.add(new Object());

		List<Integer> intList = new ArrayList<>();
		rawList = intList;

		List<String> stringList = rawList;

		Iterator iter = rawList.iterator();
		while (iter.hasNext()) {
			Object object = iter.next();
			System.out.println(object);

		}
	}
}
