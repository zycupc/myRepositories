package com.hello;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflex {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String s="fun";
		Class clazz = Hello.class;
		System.out.println(clazz);
		Method m=clazz.getMethod(s);
		System.out.println(m);
		m.invoke(new Hello());
	}
}
