package com.mphasis.sampleproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user164")
public class User {
	
	@Id
	private int empId;
	private String name;
	private String password;
	private String emailId;
	private String mobile;
	private String question;
	private String answer;
	private String userType;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public User(int empId, String name, String password, String emailId, String mobile, String question, String answer,
			String userType) {
		super();
		this.empId = empId;
		this.name = name;
		this.password = password;
		this.emailId = emailId;
		this.mobile = mobile;
		this.question = question;
		this.answer = answer;
		this.userType = userType;
	}
	public User() {
		super();
	}


	
	
}
