package com.hongruan.online.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hongruan.online.admin.service.AdminServiceImpl;
import com.hongruan.online.entity.TaskBit;

@Controller
@RequestMapping("/Admin")
public class AdminController {
	@Resource
	private AdminServiceImpl adminServiceImpl;
	@RequestMapping("/checkLogin")
	public String checkLogin(@RequestParam String adminName, @RequestParam String password) {
		boolean isExist = this.adminServiceImpl.CheckLogin(adminName, password);
		if(isExist == true) {
			return "admin-index";
		}else {
			return "admin-login";
		}
		
	}
	@RequestMapping("/publishTask")
	public void publishTask(@RequestParam String money, @RequestParam String taskStartTime, @RequestParam String taskEndTime,@RequestParam String taskAdmin,@RequestParam String taskIntroduce) {
		TaskBit taskBit = new TaskBit();
		taskBit.setTaskPay(money);
		taskBit.setTaskAdmin(taskAdmin);
		taskBit.setTaskEndTime(taskEndTime);
		taskBit.setTaskIntroduce(taskIntroduce);
		taskBit.setTaskStartTime(taskStartTime);
		this.adminServiceImpl.publishTask(taskBit);
		
	}
}
