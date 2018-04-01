package com.hongruan.online.task.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hongruan.online.admin.dao.AdminDaoImpl;
import com.hongruan.online.entity.Task;
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
		int sumOfUsersAssociatedWithTask = task1.getUserSet().size();
		return sumOfUsersAssociatedWithTask;
	}
}
