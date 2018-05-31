package com.client.file.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.client.file.service.FileService;
import com.client.file.service.UserLoginClientService;
import com.google.gson.Gson;
import com.hongruan.online.entity.User;
import com.hongruan.online.entity.UserTask;

@Controller
@RequestMapping("/Client")
public class FileClient {
	@Resource 
	private FileService fileservice;
	@Resource
	private UserLoginClientService userloginclientservice;
	/*客户端任务提交
	 * 上传的文件储存在当前项目的file中的Tasksubmit下
	 * 文件名以时间和用户提供文件名组成
	 * 以后需要加上用户id(未完成)
	 * */
	@RequestMapping(value="/FileUpload",method=RequestMethod.POST)
	@ResponseBody
	public String FileUpload(HttpServletRequest res,HttpServletResponse resp,MultipartFile file)  {
		String filePath = res.getSession().getServletContext().getRealPath("/")+"file\\TaskSubmit\\"+new Date().getTime()
                + file.getOriginalFilename();
		if(file!=null) {
			try {
				file.transferTo(new File(filePath));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "1";
		}
		return "1";
	}
	/*客户端文件下载
	 * 需要下载码，用户id,
	 * 
	 * 
	 * */
	@RequestMapping(value="/FileDownLoad",method=RequestMethod.POST)
	@ResponseBody
	public String FileDownLoad(HttpServletRequest res,HttpServletResponse resp,@RequestBody String userTask) throws IOException {
		  String FileName="";
		  System.out.println(userTask);
		  Gson gosn = new Gson();
		  UserTask findTask = gosn.fromJson(userTask, UserTask.class);
//		  UserTask Taskurl = fileservice.GetFileUrlService(findTask);
//		  System.out.println(Taskurl.getUrl());
		  
		  
//		  FileInputStream input = new FileInputStream(Taskurl.getUrl());
		  String filePath = res.getSession().getServletContext().getRealPath("/file/Taskfile/59.zip");
		  System.out.println(filePath);
	            
		  FileInputStream input = new FileInputStream(filePath);
      //   String fileName = Taskurl.getTask().getTaskName();
		  
          resp.setCharacterEncoding("utf-8");
          resp.setContentType("multipart/form-data");
          String file = "59.zip";
          resp.setHeader("Content-Disposition", "attachment;filename=\"" + file + "\"");//返回时可以取文件名
          ServletOutputStream outStream = resp.getOutputStream();
          byte []b =new byte[1024];
          while(input.read(b)!=-1) {
          outStream.write(b);
          }
          input.close();
          outStream.close();
          return FileName;
	}
	@RequestMapping(value="/UserLogin",method=RequestMethod.POST)
	@ResponseBody
	public String UserLogin(HttpServletRequest res,HttpServletResponse resp,@RequestBody String user) throws IOException  {
			
		 Gson gson =new Gson();
		 System.out.println(user);
		 User users = gson.fromJson(user, User.class);
		 users=userloginclientservice.SelectUser(users);
		 System.out.println(users.getPhoneNumber());
		 if(users!=null){
			 	 String reUser=users.getUserId().toString();
				 resp.setCharacterEncoding("utf-8");
				 resp.setContentType("multipart/form-data");
				 resp.setHeader("Content-Disposition", "attachment;userId="+reUser);//返回时可以取文件名
				 System.out.println(reUser);
				 String filePath =  res.getSession().getServletContext().getRealPath("/file/ImgFiled")+users.getImgUrl();
				 FileInputStream input = new FileInputStream(new File(filePath));
				 System.out.println(input.available());
				 ServletOutputStream output = resp.getOutputStream();
				 byte []b =new byte[1024];
				 while(input.read(b)!=-1) {
					 output.write(b);
				 }
				 input.close();
				 output.close();
		}
	
		return null;
	}

	
}
