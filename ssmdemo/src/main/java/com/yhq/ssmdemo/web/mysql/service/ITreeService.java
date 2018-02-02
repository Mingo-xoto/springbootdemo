package com.yhq.ssmdemo.web.mysql.service;

import com.yhq.ssmdemo.web.mysql.pojo.Tree;

public interface ITreeService extends IBaseService<Integer, Tree> {

	Tree get(Integer id);

	int save(Tree tree);
}
