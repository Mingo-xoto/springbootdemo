package com.yhq.ssmdemo.web.mysql.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.ssmdemo.web.mysql.dao.TreeMapper;
import com.yhq.ssmdemo.web.mysql.pojo.Tree;
import com.yhq.ssmdemo.web.mysql.service.ITreeService;

@Service("treeService")
public class TreeService extends BaseService<Integer, Tree> implements ITreeService {

	@Autowired
	private TreeMapper treeMapper;

	@Override
	public Tree get(Integer id) {
		List<Tree> list = treeMapper.selectAll();
		return list != null ? list.get(0) : null;
	}

	@Override
	public int save(Tree tree) {
		// TODO Auto-generated method stub
		return 0;
	}

}
