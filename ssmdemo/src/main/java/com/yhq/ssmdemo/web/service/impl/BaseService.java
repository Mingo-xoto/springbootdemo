/**
 * 
 */
package com.yhq.ssmdemo.web.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yhq.ssmdemo.test.A;
import com.yhq.ssmdemo.test.B;
import com.yhq.ssmdemo.test.User;
import com.yhq.ssmdemo.web.service.IBaseService;

import tk.mybatis.mapper.common.Mapper;

/**
 * 基础服务接口实现
 * 
 * @author Riven
 *
 * @param <PK>
 * @param <T>
 */
public abstract class BaseService<PK, T> implements IBaseService<PK, T> {

	@Autowired
	protected Mapper<T> baseMapper;

	protected A<T> a;

	public int deleteByPrimaryKey(PK id) {
		// TODO Auto-generated method stub
		return baseMapper.deleteByPrimaryKey(id);
	}

	public int insert(T record) {
		// TODO Auto-generated method stub
		return baseMapper.insert(record);
	}

	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return baseMapper.insertSelective(record);
	}

	public T selectByPrimaryKey(PK id) {
		B b = new B();
		Class<?> cl = b.getClass();
		try {
			a = (A<T>) cl.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User u = (User) a.get();
		System.out.println(u.getName());
		T t =  baseMapper.selectByPrimaryKey(id);
		return t;
	}

	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return baseMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return baseMapper.updateByPrimaryKey(record);
	}

}
