package com.jpatho.dao.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jpatho.dao.IReportDao;
import com.jpatho.model.Report;

@Repository
public class ReportDaoImpl implements IReportDao{
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Report getReportById(int mobile) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
