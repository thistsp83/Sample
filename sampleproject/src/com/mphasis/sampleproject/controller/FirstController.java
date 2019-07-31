package com.mphasis.sampleproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mphasis.sampleproject.dao.ExamDao;
import com.mphasis.sampleproject.dao.UserDao;
import com.mphasis.sampleproject.model.Exam;
import com.mphasis.sampleproject.model.User;

@Controller
public class FirstController {
	
	@Autowired
	ExamDao ed;
	
	@Autowired
	UserDao ud;
	
	@RequestMapping("/")
	public ModelAndView firstMethod() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/home")
	public ModelAndView secondMethod() {
		return new ModelAndView("home");
	}

	@RequestMapping("/addexam")
	public ModelAndView thirdMethod() {
		return new ModelAndView("addexam");
	}
	
	@RequestMapping("addexamdetails")
	public ModelAndView addExamEntry(HttpServletRequest req) {
		ModelAndView mv=null;
		String eid=req.getParameter("eid");
		String ename=req.getParameter("ename");
		System.out.println(eid+"  "+ename);
		
		int duration=Integer.parseInt(req.getParameter("eduration"));
		int noq=Integer.parseInt(req.getParameter("enoq"));
		int pass=Integer.parseInt(req.getParameter("epass"));
		String des=req.getParameter("edes");
		Exam e=new Exam(eid,ename,duration,noq,pass,des);
		
		//WebApplicationContext wb=WebApplicationContextUtils.getWebApplicationContext(Exam.class, "ex");
		boolean b1=ed.insertExam(e);
		
		if(b1==false) {
			mv=new ModelAndView("success");
			//String value="Sucessfully Inserted";
			mv.addObject("value","Sucessfully Inserted");
		}
		else {
			mv=new ModelAndView("error");
		}
		return mv;
	}
	
	@RequestMapping("/viewexams")
	public ModelAndView viewAllExams() {
		ModelAndView mv=new ModelAndView("viewexams");
		List<Exam> al=ed.getAllExams();
		System.out.println("Inside Controller"+al);
		mv.addObject("al", al);
		return mv;
	}
	
	@RequestMapping("/editexam")
	public ModelAndView editIssue(HttpServletRequest request)throws Exception {
		ModelAndView mv=null;
		String id=request.getParameter("id");
		Exam e=ed.getById(id);
		
		System.out.println("Inside Controller: "+e);
		mv=new ModelAndView("editexam");
		mv.addObject("exam",e);
		return mv;
	}
	
	@RequestMapping("/updateexam")
	public ModelAndView updateIssue(HttpServletRequest request)throws Exception {
	
		ModelAndView mv=null;
		String eid=request.getParameter("examid");
		String ename=request.getParameter("examname");
		int duration=Integer.parseInt(request.getParameter("examduration"));
		int noq=Integer.parseInt(request.getParameter("examnoq"));
		int passper=Integer.parseInt(request.getParameter("epass"));
		
		String desc=request.getParameter("examdesc");
		Exam e=new Exam(eid,ename,duration,noq,passper,desc);
		boolean b1=ed.updateExam(e);
		if(b1==true) {
			mv=new ModelAndView("error");
		}
		else {
			mv=new ModelAndView("success");
		}
		
		return mv;
	}
	
	//  USER Related Coding
	
	@RequestMapping("/login")
	public ModelAndView loginMethod() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/register")
	public ModelAndView registerMethod() {
		return new ModelAndView("register");
	}
	
	@RequestMapping(value="adduser", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest req) throws Exception
	{
		ModelAndView mv=null;
		int i=Integer.parseInt(req.getParameter("empid"));
		String name=req.getParameter("uname");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String question=req.getParameter("question");
		String answer=req.getParameter("answer");
		System.out.println(i+" "+name);
		User u=new User(i,name,password,email,phone,question,answer,"USER");
		boolean b1=ud.insertUser(u);
		if(b1==true) {
		 mv= new ModelAndView("success");
		 }
		 else {
			 mv=new ModelAndView("error");
		 }
		
		return mv;
	}
	
	@RequestMapping(value="checkuser", method = RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req) throws Exception
	{
		ModelAndView mv=null;
		
		String name=req.getParameter("uname");
		String password=req.getParameter("password");
		
		List<User> li=ud.getAllUsers();
		int flag=0;
		for(User u:li) {
			if(name.equals(u.getName())) 
			{
				flag=1;
				if(u.getUserType().equals("Admin")) 
				{
					mv= new ModelAndView("adminhome");
					break;
				}
				else 
				{
					mv=new ModelAndView("userhome");
					mv.addObject("name", u.getName());
					 mv.addObject("email", u.getEmailId());
					 
					 mv.addObject("id", u.getEmpId());
					 break;
				}
			}
			
					
				
			}
		if(flag==0) {
			mv=new ModelAndView("error");
		}
		
		return mv;
	}
	
}
