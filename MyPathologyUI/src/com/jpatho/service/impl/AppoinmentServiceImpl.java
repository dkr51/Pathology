package com.jpatho.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jpatho.dao.IAppoinmentDao;
import com.jpatho.model.Appoinment;
import com.jpatho.service.IAppoinmentService;

@Service
public class AppoinmentServiceImpl implements IAppoinmentService{

	@Autowired
	private IAppoinmentDao dao;

	@Override
	public int saveAppoinment(Appoinment appo) {
		return dao.saveAppoinment(appo);
	}
}
