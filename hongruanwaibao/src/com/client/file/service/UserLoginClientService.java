package com.client.file.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.client.file.dao.UserLoginClientDao;
import com.hongruan.online.entity.User;

@Service
public class UserLoginClientService {
	@Resource
	private UserLoginClientDao userLoginClientDao;
	public User SelectUser(User user) {
		
		return userLoginClientDao.UserLogin(user);
		
	}
}
