package com.yhq.springboot.ssmdemo.generatype;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//泛型通配符容器：?
		List<? extends Fruit> list = new ArrayList<Apple>();
		list.add(null);
		//编译不通过
//		list.add(new Apple());
//		list.add(new Orange());
		Fruit f = new Apple();
		
		//父子类容器
		List<Fruit> list2 = new ArrayList<Fruit>();
		list2.add(new Apple());
		list2.add(new Orange());
		
		//超类型
		List<? super Fruit> list3 = new ArrayList<>();
		list3.add(new Apple());
		list3.add(new Orange());
	}
}
