package com.hongruan.online.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hongruan.online.admin.service.AdminServiceImpl;

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
}
