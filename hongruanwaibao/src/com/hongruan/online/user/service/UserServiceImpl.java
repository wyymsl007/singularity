package com.hongruan.online.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hongruan.online.entity.User;
import com.hongruan.online.user.dao.UserDaoImpl;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl {
	@Resource
	private UserDaoImpl userDaoImpl;
	public void saveUser(User user) {
		userDaoImpl.saveUser(user);
		
	}
	public List<User> getNewUsers(){
		return this.userDaoImpl.getNewUsers();
	}
	public void userSureRegist(Integer userId) {
		this.userDaoImpl.updateUserRegist(userId,true);
	}
	public void aaa() {
		this.userDaoImpl.aaa();
	}
}
