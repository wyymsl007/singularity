package com.hongruan.online.task.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.hongruan.online.task.service.TaskServiceImpl;

@Controller
public class TaskController {
	@Resource
	private TaskServiceImpl taskServiceImpl;
}
