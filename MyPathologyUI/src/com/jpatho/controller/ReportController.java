package com.jpatho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.jpatho.service.IReportService;

@Controller
public class ReportController {

	@Autowired
	private IReportService service;
	
	@RequestMapping("/repoReg")
	public String showRegPage(){
		return "Report";
	}
	
	
}
