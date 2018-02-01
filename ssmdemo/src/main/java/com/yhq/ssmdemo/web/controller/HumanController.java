package com.yhq.ssmdemo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhq.ssmdemo.web.service.IHumanService;
import com.yhq.ssmdemo.web.service.IPersonService;

@RestController()
@RequestMapping("/human/")
public class HumanController {

	@Autowired
	private IHumanService<Integer, ?> humanService;

	@Autowired
	private IPersonService personService;

	@RequestMapping(value = "{id}/human")
	public String human(@PathVariable Integer id) {
		return humanService.selectByPrimaryKey(id).toString();
	}

	@RequestMapping(value = "{id}/person")
	public String person(@PathVariable Integer id) {
		return personService.selectByPrimaryKey(id).toString();
	}
}
