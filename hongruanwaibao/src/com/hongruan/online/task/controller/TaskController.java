package com.hongruan.online.task.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hongruan.online.entity.Task;
import com.hongruan.online.entity.User;
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
		if(taskCondition.equals("竞标中")) {
			return "user-bit-task";
		}
		return "user-index";
	}
	@RequestMapping("/getBitTasksList")
	public String getBitTasksList(HttpSession session) {
		List<Task> bitTasksList = this.taskServiceImpl.getTaskConditionTasks("竞标中");
		session.setAttribute("bitTasksList", bitTasksList);
		return "admin-bit";
	}
	@RequestMapping("/getDoneTasksList")
	public String getDoneTasksList(HttpSession session) {
		List<Task> doneTasksList = this.taskServiceImpl.getDoneTasksList("已完成");
		session.setAttribute("doneTasksList",doneTasksList);
		return "admin-taskResult";
	}
	@RequestMapping("/getUsersAssociatedWithTask")
	public String getUsersAssociatedWithTask(HttpServletRequest request, @RequestParam Integer taskId, HttpSession session) {
		String lastPage = request.getHeader("referer");
		if(lastPage.equals("http://localhost:8080/hongruanwaibao/Task/getBitTasksList.do")){
			List<User> users = this.taskServiceImpl.getUsersAssociatedWithTask(taskId);
			session.setAttribute("bitUsers", users);
			return "admin-bit-task-detail";
		}else {
			List<User> users = this.taskServiceImpl.getUsersAssociatedWithTask(taskId);
			session.setAttribute("bitUsers", users);
			return "admin-taskresult-task-detail";
		}
		
	}
	@RequestMapping("/agreeBit")
	public String agreeBit(@RequestParam Integer userId, @RequestParam Integer taskId) {
		this.taskServiceImpl.agreeBit(userId, taskId);
		return "admin-examine-bit-success";
	}
	@RequestMapping("/getTaskConditionTasks")
	public String getTaskConditionTasks(@RequestParam String taskCondition) {
		List<Task> tasksList = this.taskServiceImpl.getTaskConditionTasks(taskCondition);
		return "user-taskHall";
	}
}
