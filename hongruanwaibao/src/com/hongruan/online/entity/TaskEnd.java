package com.hongruan.online.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="taskend")
@PrimaryKeyJoinColumn(name="taskId")
public class TaskEnd extends Task{
	//private User user;
	private String bbb;

	public String getBbb() {
		return bbb;
	}

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}
}
