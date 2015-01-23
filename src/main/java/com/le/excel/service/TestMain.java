package com.le.excel.service;

import java.lang.reflect.Field;
import java.util.Date;

import com.le.excel.model.Person;

public class TestMain {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("张三");
		p.setAge(20);
		p.setBirthday(new Date());
		p.setAddress("北京市");
		
		Class pClass = p.getClass();
		System.out.println(pClass.getName());
		Field[] flds = pClass.getDeclaredFields();
		if (flds != null) {
			for ( int i = 0; i < flds.length; i++ ){
				try {
					System.out.println(flds[i].getName() + " - " + flds[i].get(pClass));
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		}
		
	}
	
}
