package com.ekunt.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
 * ����DAO�ĸ��࣬����ͳһ�ڴ�ע��HibernateTemplate��
 * @author E-Kunt
 *
 */
@Component("superDao")
public class SuperDaoImpl {

	private HibernateTemplate hibernateTemplate;
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
}
