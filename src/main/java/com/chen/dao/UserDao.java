package com.chen.dao;

import org.springframework.stereotype.Repository;

import com.chen.domain.User;

@Repository
public interface UserDao {
	
	public User getUserByName(String name);
	public void insertUser(User user);

}
