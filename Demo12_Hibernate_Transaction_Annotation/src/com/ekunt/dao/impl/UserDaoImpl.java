package com.ekunt.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.ekunt.dao.UserDao;
import com.ekunt.entity.User;

/**
 *  DAO����ʵ����
 * @author E-Kunt
 *
 */
@Component("userDao") //����bean ����ָ��id
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("UserDao txHash:" + session.getTransaction().hashCode()); //�����ã����Ƿ�������DAO������ͬ�������С�
	}




}
