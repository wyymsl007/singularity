package com.hongruan.online.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="taskselected")
@PrimaryKeyJoinColumn(name="taskId")
public class TaskSelected extends Task{
	private User user;
}
