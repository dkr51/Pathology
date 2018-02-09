package com.jpatho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AppBook_TAB")
public class Appoinment implements Comparable<Appoinment>{
	@Id
	@Column(name="p_mobile")
	private int pmobile;
	@Column(name="p_name")
	private String pName;
	@Column(name="pAddr")
	private String pAddr;

	
	
	public Appoinment() {
	}
	
	public Appoinment(int pmobile) {
		this.pmobile = pmobile;
	}
	
	public Appoinment(int pmobile, String pName, String pAddr) {
		super();
		this.pmobile = pmobile;
		this.pName = pName;
		this.pAddr = pAddr;
	}
	
	public int getPMobile() {
		return pmobile;
	}
	public void setPMobile(int pmobile) {
		this.pmobile = pmobile;
	}
	public String getPName() {
		return pName;
	}
	public void setPName(String pName) {
		this.pName = pName;
	}
	public String getPAddr() {
		return pAddr;
	}
	public void setPAddr(String pAddr) {
		this.pAddr = pAddr;
	}
	
	@Override
	public String toString() {
		return "Appoinment [pmobile=" + pmobile + ", pName=" + pName
				+ ", pAddr=" + pAddr + "]";
	}

	@Override
	public int compareTo(Appoinment o) {
		return pmobile-o.pmobile;
	}
	
}
