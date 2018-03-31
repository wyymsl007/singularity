package com.hongruan.online.admin.service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hongruan.online.admin.dao.AdminDaoImpl;
import com.hongruan.online.entity.Admin;
import com.hongruan.online.entity.Task;




@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AdminServiceImpl {
	@Resource
	private AdminDaoImpl adminDaoImpl;
	public boolean CheckLogin(String adminName, String password) {
		List<Admin> list = this.adminDaoImpl.getAllAdmins();
		for(int i = 0; i < list.size(); i++) {
			if(((Admin)list.get(i)).getName().equals(adminName) && ((Admin)list.get(i)).getPassword().equalsIgnoreCase(password)) {
				return true;
			}
		}
		return false;
	}
	public void publishTask(Task task) {
		this.adminDaoImpl.publishTask(task);
		
	}
}
