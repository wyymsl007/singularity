package com.hongruan.online.task.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hongruan.online.entity.Task;
import com.hongruan.online.task.service.TaskServiceImpl;

@Controller
@RequestMapping("/Task")
public class TaskController {
	@Resource
	private TaskServiceImpl taskServiceImpl;
	@RequestMapping("/getTaskHallAllTasksList")
	public String getTaskHallAllTasksList(HttpSession session) {
		List<Task> allTasksList = this.taskServiceImpl.getTaskHallAllTasksList();
		session.setAttribute("allTasksList", allTasksList);
		return "user-taskHall";
	}
}
