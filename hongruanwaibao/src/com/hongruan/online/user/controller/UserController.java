package com.hongruan.online.user.controller;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hongruan.online.entity.Task;
import com.hongruan.online.entity.User;
import com.hongruan.online.entity.UserTask;
import com.hongruan.online.user.service.UserServiceImpl;

@Controller
@RequestMapping("/User")
public class UserController {
	@Resource
	private UserServiceImpl userServiceImpl;
	@RequestMapping("/saveUser")
	public void saveUser(@RequestParam String yourusername,@RequestParam String yourpass,@RequestParam String yourname,@RequestParam String personalIntroduction,@RequestParam String youralipayId,@RequestParam String youralipayName,@RequestParam String yourphoneNumber) {
		User user = new User();
		user.setAlipayId(youralipayId);
		user.setAlipayName(youralipayName);
		user.setName(yourname);
		user.setPassword(yourpass);
		user.setPhoneNumber(yourphoneNumber);
		user.setUserName(yourusername);
		user.setPersonalIntroduction(personalIntroduction);
		user.setRegist(false);
		userServiceImpl.saveUser(user);
		
		
		
	}
	@RequestMapping("/showNewUsers")//session,request,response作为controller的方法的形参时，在实际调用该方法时就代表声明创建了一个session了，然后在方法体里直接就可以用了
	public String showNewUsers(HttpSession session){
		session.setAttribute("newUsersList",this.userServiceImpl.getNewUsers());
		return "admin-newUser";
	}
	@RequestMapping("/showNewUserDetails")
	public String showNewUserDetails(HttpSession session,User user) {
		session.setAttribute("user", user);
		return "admin-newUser-details";
		
	}
	@RequestMapping("/userSureRegist")
	public String userSureRegist(Integer userId) {
		this.userServiceImpl.userSureRegist(userId);
		return "redirect:/User/showNewUsers.do";
	}
	@RequestMapping("/checkLogin")
	public String checkLogin(@RequestParam String userName, @RequestParam String password, HttpSession session) {
		boolean isExist = this.userServiceImpl.CheckLogin(userName, password);
		if(isExist == true) {
			session.setAttribute("userName", userName);
			return "user-index";
		}else {
			return "user-login";
		}
	}
	@RequestMapping("/applyBit")
	public String applyBit(HttpSession session) {
		Task task = (Task)session.getAttribute("task");
		String userName = (String)session.getAttribute("userName");
		User user = this.userServiceImpl.getUserByUserName(userName);
		Iterator it = user.getUserTaskSet().iterator();
		while(it.hasNext()) {
			UserTask t = (UserTask)it.next();
			if(t.getTask().getTaskId() == task.getTaskId()) {
				return "already-bit";
			}
		}
			UserTask ut = new UserTask();
			ut.setTaskCondition("竞标中");
			ut.setTask(task);
			ut.setUser(user);
			task.getUserTaskSet().add(ut);
			user.getUserTaskSet().add(ut);
			this.userServiceImpl.userTaskmapped(ut,user,task);
			return "success-bit";
		

	}
}
