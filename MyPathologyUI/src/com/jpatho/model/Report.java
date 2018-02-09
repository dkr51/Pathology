package com.jpatho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="report")
public class Report implements Comparable<Report>{
	@Id
	@Column(name="mobile")
	private int mobile;
	@Column(name="rid")
	private String reportid;
	
	public Report() {
		
	}
	
	public Report(int mobile) {
		super();
		this.mobile = mobile;
	}

	public Report(int mobile, String reportid) {
		super();
		this.mobile = mobile;
		this.reportid = reportid;
		
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getReportid() {
		return reportid;
	}
	
	public void setReportid(String reportid) {
		this.reportid = reportid;
	}

	@Override
	public String toString() {
		return "Report [mobile=" + mobile + ", reportid=" + reportid+"]";
	}

	@Override
	public int compareTo(Report o) {
		// TODO Auto-generated method stub
		return this.getMobile()-o.getMobile();
	}
	
	
	

}
