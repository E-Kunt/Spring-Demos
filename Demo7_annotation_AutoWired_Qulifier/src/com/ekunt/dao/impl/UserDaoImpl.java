package com.ekunt.dao.impl;

import com.ekunt.dao.UserDao;
import com.ekunt.entity.User;

/**
 *  DAO����ʵ����
 * @author E-Kunt
 *
 */
public class UserDaoImpl implements UserDao {
	
	private int daoId;
	
	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}
	
	@Override
	public void add(User user) {
		System.out.println("daoId : " + daoId);
		System.out.println("UserDaoImpl : Add a user!");
	}

}
