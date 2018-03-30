package com.hongruan.online.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	private Integer taskId;
	private String taskName;
	private String taskIntroduce;
	private String taskCondition;
	private String taskAdmin;
	private String taskStartTime;
	private String taskEndtTime;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskIntroduce() {
		return taskIntroduce;
	}
	public void setTaskIntroduce(String taskIntroduce) {
		this.taskIntroduce = taskIntroduce;
	}
	public String getTaskCondition() {
		return taskCondition;
	}
	public void setTaskCondition(String taskCondition) {
		this.taskCondition = taskCondition;
	}
	public String getTaskAdmin() {
		return taskAdmin;
	}
	public void setTaskAdmin(String taskAdmin) {
		this.taskAdmin = taskAdmin;
	}
	public String getTaskStartTime() {
		return taskStartTime;
	}
	public void setTaskStartTime(String taskStartTime) {
		this.taskStartTime = taskStartTime;
	}
	public String getTaskEndtTime() {
		return taskEndtTime;
	}
	public void setTaskEndtTime(String taskEndtTime) {
		this.taskEndtTime = taskEndtTime;
	}
	
}