package com.hongruan.online.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="taskbit")
@PrimaryKeyJoinColumn(name="taskId")
public class TaskBit extends Task{
	
}
