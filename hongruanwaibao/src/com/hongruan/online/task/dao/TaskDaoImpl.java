package com.hongruan.online.task.dao;



import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hongruan.online.entity.Task;

@Repository
public class TaskDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public List<Task> getTaskHallAllTasksList(){
		String hql = "from Task";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql);
		List<Task> allTasksList = q.list();
		return allTasksList;
	}
}
