package com.hongruan.online.task.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hongruan.online.entity.Task;
import com.hongruan.online.task.service.TaskServiceImpl;

@Controller
@RequestMapping("/Task")
public class TaskController {
	@Resource
	private TaskServiceImpl taskServiceImpl;
	@RequestMapping("/getTaskHallAllTasksList")
	public String getTaskHallAllTasksList(HttpSession session) {
		String userName = (String)session.getAttribute("userName");
		if(userName == null) {
			return "user-login";
		}else {
			List<Task> allTasksList = this.taskServiceImpl.getTaskHallAllTasksList();
			session.setAttribute("allTasksList", allTasksList);
			return "user-taskHall";
		}
	}
	@RequestMapping("/getTaskDetial")
	public String getTaskDetial(Task task, HttpSession session) {
		int bitUsersSum = this.taskServiceImpl.getSumOfUsersAssociatedWithTask(task);
		session.setAttribute("task",task);
		session.setAttribute("bitUsersSum", bitUsersSum);
		String taskCondition = task.getTaskCondition();
		return "user-bit-task";
	}
	@RequestMapping("/getBitTasksList")
	public String getBitTasksList(HttpSession session) {
		List<Task> bitTasksList = this.taskServiceImpl.getTaskConditionTasks("竞标中");
		session.setAttribute("bitTasksList", bitTasksList);
		return "admin-bit";
	}
/*	@RequestMapping("/getUsersAssociatedWithTask")
	public String getUsersAssociatedWithTask(@RequestParam Integer taskId) {
		Set<User> users =  
		return "admin-bit-task-detail";
	}*/
}
