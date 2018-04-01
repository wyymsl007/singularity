package com.hongruan.online.task.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hongruan.online.admin.dao.AdminDaoImpl;
import com.hongruan.online.entity.Task;
import com.hongruan.online.entity.User;
import com.hongruan.online.entity.UserTask;
import com.hongruan.online.task.dao.TaskDaoImpl;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TaskServiceImpl {
	@Resource
	private TaskDaoImpl taskDaoImpl;
	public List<Task> getTaskHallAllTasksList(){
		return this.taskDaoImpl.getTaskHallAllTasksList();
	}
	public int getSumOfUsersAssociatedWithTask(Task task) {
		Integer taskId = task.getTaskId();
		Task task1 = this.taskDaoImpl.getTaskById(taskId);
		int sumOfUsersAssociatedWithTask = task1.getUserTaskSet().size();
		return sumOfUsersAssociatedWithTask;
	}
	public List<Task> getTaskConditionTasks(String taskCondition){
		return this.taskDaoImpl.getTaskConditionTasks(taskCondition);
	}
/*	public List<User> getUsersAssociatedWithTask(Integer taskId){
		Task task = this.taskDaoImpl.getTaskById(taskId);
		List<User> users = new ArrayList();
		 Iterator it = task.getUserTaskSet().iterator();
		 while(it.hasNext()) {
			 //根据用户ID得到用户对象
		 }
	}*/
}
