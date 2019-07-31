package com.mphasis.sampleproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.mphasis.sampleproject.model.Exam;

@Repository
public class ExamDao {

	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	
	public boolean updateExam(Exam e) {
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		s.merge(e);
		t1.commit();
		s.close();
		return false;
	}
	
	public Exam getById(String examId) {
		Exam e=null;
		List<Exam> li=getAllExams();
		for(Exam ex:li) {
			if(ex.getExamId().equals(examId)) {
				e=new Exam(ex.getExamId(),ex.getExamName(),ex.getDuration(),ex.getNumberOfQuestion(),ex.getPassPercentage(),ex.getDescription());
			}
		}
		/*Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		//e=s.get(Exam.class, examId);
		e=(Exam) s.byId(examId);
		s.close();*/
		return e;
	}
	
	@SuppressWarnings("unchecked")
	public List<Exam> getAllExams(){
		List<Exam> al=new ArrayList<Exam>();
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		al=s.createQuery("from Exam").list();
		s.close();
		
		return al;
	}
	
	public boolean insertExam(Exam e) {
		System.out.println("Inside the DAO Class - Insert Method");
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		
		s.persist(e);
		t1.commit();
		s.close();
	
		return false;
	}
}
