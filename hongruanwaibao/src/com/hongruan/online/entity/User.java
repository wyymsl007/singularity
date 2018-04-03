package com.hongruan.online.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	private Integer userId;
	private String userName;
	private String password;
	private String name;
	private String phoneNumber;
	private String alipayId;
	private String alipayName;
	private String personalIntroduction;
	private boolean isRegist;
	private Set<UserTask> userTaskSet = new HashSet<UserTask>();
	@OneToMany(mappedBy = "user", targetEntity = UserTask.class)
	public Set<UserTask> getUserTaskSet() {
		return userTaskSet;
	}
	public void setUserTaskSet(Set<UserTask> userTaskSet) {
		this.userTaskSet = userTaskSet;
	}
	public boolean isRegist() {
		return isRegist;
	}
	public void setRegist(boolean isRegist) {
		this.isRegist = isRegist;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public String getAlipayId() {
		return alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAlipayName() {
		return alipayName;
	}
	public void setAlipayName(String alipayName) {
		this.alipayName = alipayName;
	}
	public String getPersonalIntroduction() {
		return personalIntroduction;
	}
	public void setPersonalIntroduction(String personalIntroduction) {
		this.personalIntroduction = personalIntroduction;
	}

}
