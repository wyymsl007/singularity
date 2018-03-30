package com.hongruan.online.task.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	
}
