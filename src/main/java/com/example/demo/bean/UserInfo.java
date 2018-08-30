package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "USERINFO")
public class UserInfo {
	//private Integer id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
