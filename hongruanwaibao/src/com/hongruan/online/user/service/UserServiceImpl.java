package com.hongruan.online.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hongruan.online.entity.Admin;
import com.hongruan.online.entity.Task;
import com.hongruan.online.entity.User;
import com.hongruan.online.entity.UserTask;
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
	public boolean CheckLogin(String userName, String password) {
		List<User> list = this.userDaoImpl.getAllLegalUsers();
		for(int i = 0; i < list.size(); i++) {
			if(((User)list.get(i)).getUserName().equals(userName) && ((User)list.get(i)).getPassword().equalsIgnoreCase(password)) {
				return true;
			}
		}
		return false;
	}
	public User getUserByUserName(String userName){
		return this.userDaoImpl.getUserByUserName(userName);
	}
	public void userTaskmapped(UserTask ut,User user,Task task) {
		this.userDaoImpl.userTaskmapped(ut,user,task);
	}
}
