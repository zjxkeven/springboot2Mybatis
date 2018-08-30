package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserInfo;
import com.example.demo.mapper.UserDao;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//引入dao层接口
    @Autowired
    UserDao userDao;
    
	@Override
	public int insertUser(String username, String password) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		return userDao.insert(userInfo);
		//return userDao.insert(username, password);
	}

	@Override
	public UserInfo getUser(String username) {
		return userDao.findByName(username);
	}

	//新增加的实现
    @Override
    public List<UserInfo> selectALL(){
    	return userDao.selectAll();
    }
}
