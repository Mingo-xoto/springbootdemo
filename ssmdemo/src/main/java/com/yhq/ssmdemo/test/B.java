package com.yhq.ssmdemo.test;

public class B implements A<User> {

	@Override
	public User get() {
		User u = new User();
		u.setName("faker");
		return u;
	}

}
