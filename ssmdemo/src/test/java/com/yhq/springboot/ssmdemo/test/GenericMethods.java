package com.yhq.springboot.ssmdemo.test;

public class GenericMethods {

	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
}
