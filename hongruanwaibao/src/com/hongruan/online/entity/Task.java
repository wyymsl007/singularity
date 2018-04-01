package com.hongruan.online.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	private Integer taskId;
	private String taskName;
	private String taskIntroduce;
	private String taskCondition;
	private String taskAdmin;
	private String taskStartTime;
	private String taskEndTime;
	private String taskPay;
	private Set<UserTask> userTaskSet = new HashSet<UserTask>();
	@OneToMany(mappedBy = "task", targetEntity = UserTask.class)
	public Set<UserTask> getUserTaskSet() {
		return userTaskSet;
	}
	public void setUserTaskSet(Set<UserTask> userTaskSet) {
		this.userTaskSet = userTaskSet;
	}
	public String getTaskPay() {
		return taskPay;
	}
	public void setTaskPay(String taskPay) {
		this.taskPay = taskPay;
	}
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
	public String getTaskEndTime() {
		return taskEndTime;
	}
	public void setTaskEndTime(String taskEndTime) {
		this.taskEndTime = taskEndTime;
	}
	
	
}