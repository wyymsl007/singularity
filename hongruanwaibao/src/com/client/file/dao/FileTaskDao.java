package com.client.file.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hongruan.online.entity.UserTask;

@Repository
public class FileTaskDao {
	@Resource
	private SessionFactory sessionFactory;
	/*
	 * 
	 * 查找下载任务（客户端）
	 * 
	 * */
	public UserTask GetUrl(UserTask userTask) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from usertask where id = ? and userId = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, userTask.getId());
		query.setParameter(1, userTask.getUser().getUserId());
		UserTask res = (UserTask)query.uniqueResult();
		session.close();
		return res;
	}
}
