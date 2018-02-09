package com.jpatho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GetInTouch")
public class GetInTouch implements Comparable<GetInTouch>{

	@Id
	@Column(name="mobile")
	private int mobile;
	@Column(name="name")
	private String name;
	@Column(name="msg")
	private String message;

	public GetInTouch() {
		
	}
	


	public GetInTouch(int mobile) {
		super();
		this.mobile = mobile;
	}



	public GetInTouch(int mobile, String name, String message) {
		super();
		this.mobile = mobile;
		this.name = name;
		this.message = message;
	}



	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return " GetInTouch [mobile=" + mobile + ", name=" + name
				+ ", message=" + message + "]";
	}

	@Override
	public int compareTo(GetInTouch o) {
		return this.getMobile()-o.getMobile();
	}

}
