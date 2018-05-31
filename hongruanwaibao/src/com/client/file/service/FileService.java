package com.client.file.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.client.file.dao.FileTaskDao;
import com.hongruan.online.entity.UserTask;

@Service
public class FileService {
	@Resource
	private FileTaskDao fileDao;
	/*
	 * 要求userTask中有Userid和主键id
	 * */
	public UserTask GetFileUrlService(UserTask userTask) {
		return fileDao.GetUrl(userTask);
	}
	
}
