package com.hongruan.online.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tasktrust")
@PrimaryKeyJoinColumn(name="taskId")
public class TaskTrust extends Task{
	private User user;
}
