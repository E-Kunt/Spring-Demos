package com.ekunt.dao.impl;

import com.ekunt.dao.UserDao;
import com.ekunt.entity.User;

/**
 *  DAO����ʵ����
 * @author E-Kunt
 *
 */
public class UserDaoImpl implements UserDao {
	/**
	 * ������ֻΪ˵����������������XML�е����á�
	 */
	private String testProperty;
	
	@Override
	public void add(User user) {
		System.out.println("UserDaoImpl : testProperty = " + testProperty );
		System.out.println("UserDaoImpl : Add a user!");
	}

	public String getTestProperty() {
		return testProperty;
	}

	public void setTestProperty(String testProperty) {
		this.testProperty = testProperty;
	}
}
