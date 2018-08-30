package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.UserInfo;
import com.example.demo.dao.mybatis.baseDao.MyMapper;

@Mapper
public interface UserDao extends MyMapper<UserInfo> {
	@Select("select * from userinfo where username=#{username}")
	UserInfo findByName(@Param("username") String userName);
	
	//@Insert("INSERT INTO USERINFO(username, password) VALUES(#{username}, #{password})")
	//int insert(@Param("username") String username,@Param("password") String password);
}
