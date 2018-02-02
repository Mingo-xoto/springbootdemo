/**
 * 
 */
package com.yhq.ssmdemo.web.mysql.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yhq.ssmdemo.web.mysql.MySqlMapper;
import com.yhq.ssmdemo.web.mysql.service.IBaseService;

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
	private MySqlMapper<T> baseMapper;

	public int deleteByPrimaryKey(PK id) {
		// TODO Auto-generated method stub
		return baseMapper.deleteByPrimaryKey(1L);
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
		return baseMapper.selectByPrimaryKey(id);
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
