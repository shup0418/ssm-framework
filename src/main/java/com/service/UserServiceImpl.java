package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}
	
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
