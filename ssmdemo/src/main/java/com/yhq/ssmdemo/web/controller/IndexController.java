package com.yhq.ssmdemo.web.controller;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yhq.ssmdemo.web.mysql.pojo.Human;
import com.yhq.ssmdemo.web.mysql.service.IHumanService;
import com.yhq.ssmdemo.web.mysql.service.Impl.HumanService;

@Controller
public class IndexController {

	private Logger infoLogger = LogManager.getLogger("infoLogger");

	@Autowired
	private HumanService humanService2;
	
	@Autowired
	private IHumanService humanService;


	@RequestMapping("/")
	public String index() {
		System.out.println("index...");
		Set set = new HashSet<Integer>();
		return "index";
	}

	@RequestMapping(value = "firstJsp")
	public String toFirstJsp() {
//		log.info("++log测试...");
//		System.out.println(log);
//		infoLogger.info("++测试...");
//		infoLogger.info("--测试...");
//		System.out.println(infoLogger.getName());
		Human h = humanService.selectByPrimaryKey(1);
		System.out.println(h.getAdress());
		return "firstJsp";
	}
}
