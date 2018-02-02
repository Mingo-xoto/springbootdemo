package com.yhq.ssmdemo.web.mysql.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.ssmdemo.web.mysql.dao.PersonMapper;
import com.yhq.ssmdemo.web.mysql.pojo.Person;
import com.yhq.ssmdemo.web.mysql.service.IPersonService;

@Service("personSerivce")
public class PersonService extends BaseService<Integer, Person> implements IPersonService {
	
	@Autowired
	private PersonMapper personMapper;

}
