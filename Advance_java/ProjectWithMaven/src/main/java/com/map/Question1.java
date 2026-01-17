package com.map;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question1 {

	@Id
	private int question_id;
	private String question;
	@OneToMany (mappedBy = "question1",cascade = CascadeType.ALL)
	private List<Answer1> answer1;
	
	
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Question1(int question_id, String question, List<Answer1>answer1) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer1 = answer1;
	}
	
	
	@Override
	public String toString() {
		return "Question1 [question_id=" + question_id + ", question=" + question ;
	}
	
	
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer1> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(List<Answer1> answer1) {
		this.answer1 = answer1;
	}
	
}
