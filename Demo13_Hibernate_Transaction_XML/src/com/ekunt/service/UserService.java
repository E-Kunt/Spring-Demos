package com.ekunt.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ekunt.dao.LogDao;
import com.ekunt.dao.UserDao;
import com.ekunt.entity.Log;
import com.ekunt.entity.User;

/**
 * Userҵ���߼���
 * @author E-Kunt
 *
 */
@Scope("singleton")  //������Χ
@Component  //����bean
public class UserService {
	private UserDao userDao;
	private LogDao logDao;
	
	public UserService() {

	}

	public UserService(UserDao dao) {
		this.userDao = dao;
	}
	
	@Resource(name="userDao")  //����ע�룬����ָ��Ҫע���bean������
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Resource(name="logDao")
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	public LogDao getLogDao() {
		return logDao;
	}
	
	public void add(User user) {
		userDao.save(user);
		logDao.save(new Log("Add a user("+ user.getName() +") !"));
	}
	
	@PostConstruct //��ʼ������
	public void init() {
		System.out.println("UserService : initial.");
	}

	@PreDestroy //���ٷ���
	public void destroy() {
		System.out.println("UserService : destroy.");
	}

}
