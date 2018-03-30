package com.hongruan.online.task.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hongruan.online.admin.dao.AdminDaoImpl;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TaskServiceImpl {
	@Resource
	private AdminDaoImpl adminDaoImpl;
}
