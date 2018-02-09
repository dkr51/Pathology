package com.jpatho.dao.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.jpatho.dao.IGetInTouchDao;
import com.jpatho.model.GetInTouch;
//DAL-POJO-DaoImpl
@Repository
public class GetInTouchDaoImpl implements IGetInTouchDao{
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveGetInTouch(GetInTouch getin) {
		// TODO Auto-generated method stub
		return 0;
	}
}