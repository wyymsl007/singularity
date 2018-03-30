package com.hongruan.online.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

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
}
