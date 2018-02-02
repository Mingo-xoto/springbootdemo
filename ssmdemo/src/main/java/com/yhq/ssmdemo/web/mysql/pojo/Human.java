package com.yhq.ssmdemo.web.mysql.pojo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Human {
	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 性别
	 */
	private Byte sex;

	/**
	 * 职业
	 */
	private Integer occupation;

	/**
	 * 学历
	 */
	private Integer education;

	/**
	 * 生日
	 */
	private Date birthday;

	/**
	 * 所在城市
	 */
	private String city;

	/**
	 * 详细地址
	 */
	private String adress;

	/**
	 * 镇
	 */
	private String town;

	/**
	 * 村
	 */
	private String village;

	/**
	 * 省份
	 */
	private String province;

	/**
	 * 区
	 */
	private String district;

	/**
	 * 获取主键
	 *
	 * @return id - 主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置主键
	 *
	 * @param id
	 *            主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取姓名
	 *
	 * @return name - 姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置姓名
	 *
	 * @param name
	 *            姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取年龄
	 *
	 * @return age - 年龄
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * 设置年龄
	 *
	 * @param age
	 *            年龄
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * 获取性别
	 *
	 * @return sex - 性别
	 */
	public Byte getSex() {
		return sex;
	}

	/**
	 * 设置性别
	 *
	 * @param sex
	 *            性别
	 */
	public void setSex(Byte sex) {
		this.sex = sex;
	}

	/**
	 * 获取职业
	 *
	 * @return occupation - 职业
	 */
	public Integer getOccupation() {
		return occupation;
	}

	/**
	 * 设置职业
	 *
	 * @param occupation
	 *            职业
	 */
	public void setOccupation(Integer occupation) {
		this.occupation = occupation;
	}

	/**
	 * 获取学历
	 *
	 * @return education - 学历
	 */
	public Integer getEducation() {
		return education;
	}

	/**
	 * 设置学历
	 *
	 * @param education
	 *            学历
	 */
	public void setEducation(Integer education) {
		this.education = education;
	}

	/**
	 * 获取生日
	 *
	 * @return birthday - 生日
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 设置生日
	 *
	 * @param birthday
	 *            生日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 获取所在城市
	 *
	 * @return city - 所在城市
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置所在城市
	 *
	 * @param city
	 *            所在城市
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取详细地址
	 *
	 * @return adress - 详细地址
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * 设置详细地址
	 *
	 * @param adress
	 *            详细地址
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * 获取镇
	 *
	 * @return town - 镇
	 */
	public String getTown() {
		return town;
	}

	/**
	 * 设置镇
	 *
	 * @param town
	 *            镇
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * 获取村
	 *
	 * @return village - 村
	 */
	public String getVillage() {
		return village;
	}

	/**
	 * 设置村
	 *
	 * @param village
	 *            村
	 */
	public void setVillage(String village) {
		this.village = village;
	}

	/**
	 * 获取省份
	 *
	 * @return province - 省份
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 设置省份
	 *
	 * @param province
	 *            省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 获取区
	 *
	 * @return district - 区
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * 设置区
	 *
	 * @param district
	 *            区
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

}