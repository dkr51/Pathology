package com.jpatho.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpatho.dao.IGetInTouchDao;
import com.jpatho.model.GetInTouch;
import com.jpatho.service.IGetInTouchService;
//SL-POJO-ServiceImpl
@Service
public class GetInTouchServiceImpl implements IGetInTouchService{
	@Autowired
	private IGetInTouchDao dao;

	@Override
	public int saveGetInTouch(GetInTouch getin) {
		return dao.saveGetInTouch(getin);
	}
}