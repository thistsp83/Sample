package com.mphasis.sampleproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.mphasis.sampleproject.model.User;

@Repository
public class UserDao {

	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers(){
		List<User> li=new ArrayList<User>();
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		li=s.createQuery("from User164").list();
		s.close();
		
		return li;
	}
	public User getById(int id) {
		User u=null;
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		u=s.get(User.class, id);
		s.close();
		return u;
	}
	public boolean insertUser(User u) {
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		
		s.persist(u);
		t1.commit();
		s.close();
	
		return false;
	
	}
}
