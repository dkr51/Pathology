package com.jpatho.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jpatho.dao.IAppoinmentDao;
import com.jpatho.model.Appoinment;

@Repository
public class AppoinmentDaoImpl implements IAppoinmentDao{
 
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveAppoinment(Appoinment appo) {
		return (Integer)ht.save(appo);
	}
}
