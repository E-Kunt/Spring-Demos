package com.ekunt.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.ekunt.dao.UserDao;
import com.ekunt.entity.User;

/**
 * Userҵ���߼���
 * @author E-Kunt
 *
 */
@Scope("singleton")  //������Χ
@Component  //����bean
public class UserService {
	private UserDao dao;
	
	public UserService() {

	}

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	@Resource(name="dao")  //����ע�룬����ָ��Ҫע���bean������
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	public UserDao getDao() {
		return dao;
	}
	
	public void add(User user) {
		System.out.println("UserService : ready to add a user!");
		dao.add(user);
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
