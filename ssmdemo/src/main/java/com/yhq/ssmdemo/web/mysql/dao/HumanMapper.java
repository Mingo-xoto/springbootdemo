package com.yhq.ssmdemo.web.mysql.dao;

import com.yhq.ssmdemo.web.mysql.MySqlMapper;
import com.yhq.ssmdemo.web.mysql.pojo.Human;

public interface HumanMapper extends MySqlMapper<Human> {

	Human get(Integer id);
}