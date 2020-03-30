package com.ct.common.utils;

import java.util.Date;

/**
 * 
 * @ClassName: Person 
 * @Description: 实体类
 * @author: 陈腾
 * @date: 2020年3月30日 下午1:55:58
 */
public class Person {

	private String name; //姓名
	private Integer age;  //年龄
	private String about; //介绍
	private Date created; //注册日期
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Person(String name, Integer age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	
	
	
	
	

}
