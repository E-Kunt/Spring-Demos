package com.ekunt.dao.impl;

import org.springframework.stereotype.Component;
import com.ekunt.dao.UserDao;
import com.ekunt.entity.User;

/**
 *  DAO����ʵ����
 * @author E-Kunt
 *
 */
@Component("dao") //����bean ����ָ��id
public class UserDaoImpl implements UserDao {
	
	@Override
	public void add(User user) {
		System.out.println("UserDaoImpl : Add a user!");
	}

}
