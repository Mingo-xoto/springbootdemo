package com.yhq.ssmdemo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhq.ssmdemo.web.mysql.pojo.Human;
import com.yhq.ssmdemo.web.mysql.pojo.Person;
import com.yhq.ssmdemo.web.mysql.service.IHumanService;
import com.yhq.ssmdemo.web.mysql.service.IPersonService;
import com.yhq.ssmdemo.web.mysql.service.ITreeService;

@RestController()
@RequestMapping("/human/")
public class HumanController {

	@Autowired
	private IHumanService humanService;
	
	@Autowired
	private ITreeService treeService;

	@Autowired
	private IPersonService personService;

	@RequestMapping(value = "{id}/human")
	public String human(@PathVariable Integer id) {
		treeService.get(id);
		Human h1 = humanService.get(id);
		return h1.getAdress();
	}

	@RequestMapping(value = "{id}/person")
	public String person(@PathVariable Integer id) {
		// Object o = personService.selectByPrimaryKey(id);
		// return o.toString();
		return personService.selectByPrimaryKey(id).toString();
	}

	@RequestMapping(value = "{id}/person2")
	public Person person2(@PathVariable Integer id) {
		Person o = personService.selectByPrimaryKey(id);
		return o;
	}
}
