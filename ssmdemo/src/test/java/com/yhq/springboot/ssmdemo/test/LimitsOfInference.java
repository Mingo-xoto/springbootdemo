//package com.yhq.springboot.ssmdemo.test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import com.yhq.ssmdemo.web.pojo.Human;
//import com.yhq.ssmdemo.web.pojo.Person;
//
//public class LimitsOfInference {
//
//	static void f(Map<Person, List<? extends Human>> man) {
//		System.out.println(man.getClass().getName());
//	};
//
//	public static void main(String[] args) {
////		f(New.map());
////		f(New.<Person, List<? extends Human>> map());
////		Class cl = new ArrayList<Integer>().getClass();
////		Class c2 = new ArrayList<Integer>().getClass();
////		System.out.println(cl == c2);
//	}
//}
