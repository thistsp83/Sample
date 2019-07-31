package com.mphasis.sampleproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Exam {
	
	@Id
	private String examId;
	private String examName;
	private int duration;
	private int numberOfQuestion;
	private int passPercentage;
	private String description;
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getNumberOfQuestion() {
		return numberOfQuestion;
	}
	public void setNumberOfQuestion(int numberOfQuestion) {
		this.numberOfQuestion = numberOfQuestion;
	}
	public int getPassPercentage() {
		return passPercentage;
	}
	public void setPassPercentage(int passPercentage) {
		this.passPercentage = passPercentage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Exam(String examId, String examName, int duration, int numberOfQuestion, int passPercentage,
			String description) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.duration = duration;
		this.numberOfQuestion = numberOfQuestion;
		this.passPercentage = passPercentage;
		this.description = description;
	}
	public Exam() {
		super();
	}
	@Override
	public String toString() {
		return "Exam examId=" + examId + ", examName=" + examName + ", duration=" + duration + ", numberOfQuestion="
				+ numberOfQuestion + ", passPercentage=" + passPercentage + ", description=" + description ;
	}
	
	

}
