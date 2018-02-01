package com.yhq.ssmdemo.web.service.impl;

import org.springframework.stereotype.Service;

import com.yhq.ssmdemo.web.pojo.Human;
import com.yhq.ssmdemo.web.service.IHumanService;

@Service(value = "humanService")
public class HumanService extends BaseService<Integer, Human> implements IHumanService<Integer, Human> {
}
