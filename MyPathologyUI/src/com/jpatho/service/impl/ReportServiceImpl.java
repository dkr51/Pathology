package com.jpatho.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpatho.dao.IReportDao;
import com.jpatho.model.Report;
import com.jpatho.service.IReportService;

@Service
public class ReportServiceImpl implements IReportService{

	@Autowired
	private IReportDao dao;

	public Report getReportById(int mobile) {
		return dao.getReportById(mobile);
	}
}
