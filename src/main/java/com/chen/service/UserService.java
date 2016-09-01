package com.chen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.dao.UserDao;
import com.chen.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User getUserByName(String name){
		return userDao.getUserByName(name);
	}

}
