package com.hongruan.online.admin.service;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.hongruan.online.admin.dao.AdminDaoImpl;
import com.hongruan.online.entity.Admin;
import com.hongruan.online.entity.Task;





@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AdminServiceImpl {
	@Resource
	private AdminDaoImpl adminDaoImpl;
	public boolean CheckLogin(String adminName, String password) {
		List<Admin> list = this.adminDaoImpl.getAllAdmins();
		for(int i = 0; i < list.size(); i++) {
			if(((Admin)list.get(i)).getName().equals(adminName) && ((Admin)list.get(i)).getPassword().equalsIgnoreCase(password)) {
				return true;
			}
		}
		return false;
	}
	public Integer publishTask(Task task) {
		return this.adminDaoImpl.publishTask(task);
		
	}
	public void uploadTaskFile(HttpServletRequest request, MultipartFile taskFile, Integer taskId) {
		CommonsMultipartResolver commonsMultipartResolver = new   
				CommonsMultipartResolver(request.getSession().getServletContext()); 
		//设置编码  
		   commonsMultipartResolver.setDefaultEncoding("utf-8");  	
		 //判断 request 是否有文件上传,即多部分请求...  
		 if (commonsMultipartResolver.isMultipart(request))  
		   {  
		      //转换成多部分request  
		      MultipartHttpServletRequest multipartRequest =         
		    commonsMultipartResolver.resolveMultipart(request);  
		  
		   // file 是指 文件上传标签的 name=值  
		    // 根据 name 获取上传的文件...
		    MultipartFile taskfile = taskFile;//multipartRequest.getFile(taskFile);  
		   
		    //判断路径里有没有这个放任务文件的文件夹. 
		    File f = new File(request.getSession().getServletContext().getRealPath("/file/Taskfile"));
		    if(!f.exists()) {
		    	f.mkdir();
		    }
	
		    File File = new File(request.getSession().getServletContext().getRealPath("/file/Taskfile/" + taskId + ".zip"));  
	    	
		     
		    try {
		    	//向file路径上传文件(就是先创建一个file空文件)
		    	taskfile.transferTo(File);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		  
		    }
	}
}
