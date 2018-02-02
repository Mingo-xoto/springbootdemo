package com.yhq.ssmdemo.web.mysql.service;

import com.yhq.ssmdemo.web.mysql.pojo.Human;

public interface IHumanService extends IBaseService<Integer, Human> {

	Human get(Integer id);

	int save(Human human);
}
