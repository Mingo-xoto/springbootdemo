package com.yhq.ssmdemo.web.service;

public interface IBaseService<PK, T> {
	public int deleteByPrimaryKey(PK id);

	public int insert(T record);

	public int insertSelective(T record);

	public T selectByPrimaryKey(PK id);

	public int updateByPrimaryKeySelective(T record);

	public int updateByPrimaryKey(T record);
}
