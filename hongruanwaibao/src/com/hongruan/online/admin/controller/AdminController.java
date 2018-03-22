package com.hongruan.online.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.hongruan.online.admin.service.AdminServiceImpl;

@Controller
public class AdminController {
	@Resource
	private AdminServiceImpl adminServiceImpl;
	public String checkLogin(String adminName, String password) {
		
	}
}
