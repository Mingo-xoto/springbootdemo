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

	/**
	 * 这种注入会导致调用selectByPrimaryKey方法后进行Person对象实体的转换报异常：java.lang.
	 * ClassCastException: com.yhq.ssmdemo.web.pojo.Person cannot be cast to
	 * com.yhq.ssmdemo.web.pojo.Person
	 * 具体原因未明，只知道多调用了一次Method类invoke()方法将本来已经是Person类型的返回结果进行了一次Cast
	 */
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
