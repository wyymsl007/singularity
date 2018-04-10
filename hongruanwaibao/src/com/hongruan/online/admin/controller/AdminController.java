package com.hongruan.online.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hongruan.online.admin.service.AdminServiceImpl;
import com.hongruan.online.entity.Task;

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
	//@ResponseBody
	public String publishTask(HttpServletRequest request, @RequestParam MultipartFile taskFile, @RequestParam String money, @RequestParam String taskStartTime, @RequestParam String taskEndTime,@RequestParam String taskAdmin,@RequestParam String taskIntroduce) {
		Task task = new Task();
		task.setTaskPay(money);
		task.setTaskAdmin(taskAdmin);
		task.setTaskEndTime(taskEndTime);
		task.setTaskIntroduce(taskIntroduce);
		task.setTaskStartTime(taskStartTime);
		task.setTaskCondition("竞标中");
		Integer taskId = this.adminServiceImpl.publishTask(task);
		this.adminServiceImpl.uploadTaskFile(request,taskFile,taskId);
		return "admin-publish-task-success";
	}
}
