package com.hongruan.online.task.dao;



import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hongruan.online.entity.Task;
import com.hongruan.online.entity.User;

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
	public Task getTaskById(Integer taskId) {
		Task task = this.sessionFactory.getCurrentSession().get(Task.class,new Integer(taskId));
		return task;
	}
	public List<Task> getTaskConditionTasks(String taskCondition){
		String hql = "from Task where taskCondition = ?";
		Query q = this.sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, taskCondition);
		return q.list();
	}
	public User getUserById(Integer userId) {
		User u = this.sessionFactory.getCurrentSession().get(User.class, userId);
		return u;
	}
	public void agreeBit(Integer userId, Integer taskId) {
		String hql1 = "update Task set taskCondition = '已选中' where taskId = ?";
		Query q1  = this.sessionFactory.getCurrentSession().createQuery(hql1);
		q1.setParameter(0, taskId);
		q1.executeUpdate();
		
		String hql2 = "update UserTask set taskCondition = '竞标失败' where taskId = ?";
		Query q2  = this.sessionFactory.getCurrentSession().createQuery(hql2);
		q2.setParameter(0, taskId);
		q2.executeUpdate();
		
		String hql3 = "update UserTask set taskCondition = '已选中' where userId = ? and taskId = ?";
		Query q3  = this.sessionFactory.getCurrentSession().createQuery(hql3);
		q3.setParameter(0, userId);
		q3.setParameter(1, taskId);
		q3.executeUpdate();
	}
}
