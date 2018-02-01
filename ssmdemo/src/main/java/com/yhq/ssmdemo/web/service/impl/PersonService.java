package com.yhq.ssmdemo.web.service.impl;

import org.springframework.stereotype.Service;

import com.yhq.ssmdemo.web.pojo.Person;
import com.yhq.ssmdemo.web.service.IPersonService;

@Service("personSerivce")
public class PersonService extends BaseService<Integer, Person> implements IPersonService {

}
