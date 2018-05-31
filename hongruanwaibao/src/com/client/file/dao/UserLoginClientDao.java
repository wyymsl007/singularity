package com.client.file.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hongruan.online.entity.User;

@Repository
public class UserLoginClientDao {
	@Resource
	private SessionFactory sessionFactory;
	public User UserLogin(User user) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User where userName = ? and password = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getUserName());
		query.setParameter(1, user.getPassword());
		User a = null;
		try {
		 a = (User) query.list().get(0);
		}
		catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		return a;
	}
}
