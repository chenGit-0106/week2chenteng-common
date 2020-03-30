package com.ct.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * 
 * @ClassName: PersonTest 
 * @Description:测试工具 和批量生成
 * @author: 陈腾
 * @date: 2020年3月30日 下午3:12:10
 */
public class PersonTest {

	@Test
	public void testToString() {
		//批量生成1万个人
		for (int i = 1; i < 10001; i++) {
			Person p = new Person();
			//姓名属性值调用StringUtil.generateChineseName()创建
			p.setName(StringUtil.generateChineseName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间
			p.setAge(RandomUtil.random(1, 120));
			//介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
			p.setAbout(StringUtil.randomChineseString(140));
			//注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			p.setCreated(DateUtil.randomDate(c.getTime(), new Date()));
			System.out.println("第"+i+"位人的信息是:"+p);
		}
	}

}
