package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.UserInfo;

public interface UserService {
	UserInfo getUser(String username);
	
	int insertUser(String username,String password);
	
	//新增加的方法
    List<UserInfo> selectALL();
}
