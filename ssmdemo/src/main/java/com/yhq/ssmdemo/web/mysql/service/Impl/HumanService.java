package com.yhq.ssmdemo.web.mysql.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.ssmdemo.web.mysql.dao.HumanMapper;
import com.yhq.ssmdemo.web.mysql.pojo.Human;
import com.yhq.ssmdemo.web.mysql.service.IHumanService;

@Service(value = "humanService")
public class HumanService extends BaseService<Integer, Human> implements IHumanService {

	@Autowired
	private HumanMapper humanMapper;

	@Override
	public Human get(Integer id) {
		Human h = humanMapper.selectByPrimaryKey(1);
		return h;
	}

	@Override
	public int save(Human human) {
		// TODO Auto-generated method stub
		return humanMapper.insert(human);
	}
	

}
