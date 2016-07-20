package com.ekunt.dao.impl;

import org.springframework.stereotype.Component;

import com.ekunt.dao.UserDao;
import com.ekunt.entity.User;

/**
 *  DAO����ʵ����
 * @author E-Kunt
 *
 */
@Component("userDao") //����bean ����ָ��id
public class UserDaoImpl extends SuperDaoImpl implements UserDao {
	
	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}
	
}
