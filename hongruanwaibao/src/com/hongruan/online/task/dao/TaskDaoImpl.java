package com.hongruan.online.task.dao;



import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hongruan.online.entity.Task;
import com.hongruan.online.entity.User;

import entity.Goods;
import entity.Orders_detail;

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
	/*
	 * 分页代码
	 * 
	 * 
	 * 
	 * */
	/*
	 * 查找结果条数
	 * 用法
	 * a为需要查找的对象，函数会根据对象内的相应属性进行匹配查找
	 * */
	public int SearchResultNum(Object SelectObject) throws IllegalArgumentException, IllegalAccessException{
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(SelectObject.getClass());
		Criterion Rs[] = null;
		Field attribute[]=SelectObject.getClass().getDeclaredFields();
		int i = attribute.length;
		for(int cr = 0; cr < i ; cr++) {
			Field f = attribute[i];
			if(Restrictions.isNull(f.getName()) == null) 
			{
				if(f.getType().toString().equals("class java.lang.String")) {
					Rs[i] = Restrictions.like(f.getName(), f.get(SelectObject));
					criteria.add(Rs[i]);
				}
				if(f.getType().toString().equals("int")||f.getType().toString().equals("float")||f.getType().toString().equals("double"))
				{
					Rs[i] = Restrictions.eq(f.getName(), f.get(SelectObject));
					criteria.add(Rs[i]);
				}
			}
		}
		int num = criteria.list().size();
		session.close();
		return num;
	}
	/*
	 * a为输入查找的对象
	 * pagecount为页数
	 * Maxresult为每页最大条数
	 * 此函是仅限简单查找（字符串查找和数值查找）
	 * */
	public List<Object> ResultPageDevide(Object SelectObject,int PageCount,int MaxResult) throws IllegalArgumentException, IllegalAccessException{
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(SelectObject.getClass());
		Criterion Rs[] = null;
		Field attribute[]=SelectObject.getClass().getDeclaredFields();//通过反射获取查找对象的所有属性
		int i = attribute.length;
		for(int cr = 0; cr < i ; cr++) {
			Field f = attribute[i];
			if(Restrictions.isNull(f.getName()) == null)//判断查找值是否为空，如果为空，则跳过 
			{
				if(f.getType().toString().equals("class java.lang.String")) {
					Rs[i] = Restrictions.like(f.getName(), f.get(SelectObject));
					criteria.add(Rs[i]);
				}
				if(f.getType().toString().equals("int")||f.getType().toString().equals("float")||f.getType().toString().equals("double"))
				{
					Rs[i] = Restrictions.eq(f.getName(), f.get(SelectObject));
					criteria.add(Rs[i]);
				}
			}
		}
		int num = criteria.list().size();
		session.close();
		criteria.setFirstResult((PageCount-1)*MaxResult);
		criteria.setMaxResults(MaxResult);
		List<Object> goodDevide = criteria.list();
		session.close();
		return goodDevide;
	}
}
