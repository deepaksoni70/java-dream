/**
 *Copyright © 2017, LowerBound.java, Deepak Soni.
 *
 *Everyone is permitted to copy and distribute the written code below
 */
package com.dpk.lg.generics.wildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * <? super [any class]> is a kind of lower bound.
 *
 * @author deepak
 *
 */
public class LowerBound {
	public static void main(String[] args) {

		List<Object> oList = new ArrayList<>();
		oList.add(new Object());
		oList.add(new A());
		oList.add(new B());
		oList.add(new C());

		List<A> aList = new ArrayList<>();
		aList.add(new A());
		aList.add(new B());
		aList.add(new C());

		List<B> bList = new ArrayList<>();
		bList.add(new B());
		bList.add(new C());

		List<C> cList = new ArrayList<>();
		cList.add(new C());

		List<? super B> bSuperList = oList;

		bSuperList.add(new B());
		bSuperList.add(new C());

		List<? extends B> bExtendsList = bList;
		Object b = bExtendsList.get(0);
		A b1 = bExtendsList.get(0);
		B b2 = bExtendsList.get(0);

		/*
		 *  <?> ==  <? extends Object>
		 */
		List<?> anyList = aList;
		Object oo = anyList.get(0);

		Function<Integer, Integer> sqr = n -> n * n;
		Function<Number, Short> divide2 = n -> n.shortValue();

		System.out.println(sqr.andThen(divide2).apply(3));
	}

	public static <T extends B> void myFunction(List<T> t) {
		A a = t.get(0);
		System.out.println(a);
	}
}

class A {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am A";
	}
}

class B extends A {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am B";
	}
}

class C extends B {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am C";
	}
}