package com.hongruan.online.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hongruan.online.entity.Task;
import com.hongruan.online.entity.TaskCompleted;
import com.hongruan.online.entity.TaskEnd;
import com.hongruan.online.entity.User;


@Repository
public class UserDaoImpl {
	@Resource
	private SessionFactory sessionFactory;
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
	public List<User> getNewUsers(){
		String hql = "from User where regist = false";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list = query.list();
		return list;
	}
	public void updateUserRegist(Integer userId, boolean newValue) {
		String hql = "update User set regist = ? where userId = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0,newValue);
		query.setParameter(1,userId);//query.setParameter(n,变量名);代表将前面sql字符串中第n+1个问号换成这个变量名对应变量存储的值
		int m = query.executeUpdate();
	}
	public void aaa() {
/*		User u = this.sessionFactory.getCurrentSession().get(User.class,new Integer(17));
		TaskCompleted tc = new TaskCompleted();
		tc.setAaa("666");
;
		tc.setUser(u);
		
		this.sessionFactory.getCurrentSession().save(tc);*/
	/*	TaskCompleted tc   = this.sessionFactory.getCurrentSession().get(TaskCompleted.class,new Integer(20));
		System.out.println(tc.getAaa()+tc.getUser().getName());*/
		
		User u  = this.sessionFactory.getCurrentSession().get(User.class,new Integer(17));
		System.out.println(u.getName()+u.getTaskCompletedSet().size());
	}
}
