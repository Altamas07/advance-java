package com.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer1 {

	@Id
	private int answer1_id;
	private String answer;
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question1 question1;
	public int getAnswer1_id() {
		return answer1_id;
	}
	public void setAnswer1_id(int answer1_id) {
		this.answer1_id = answer1_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question1 getQuestion() {
		return question1;
	}
	public void setQuestion(Question1 question1) {
		this.question1 = question1;
	}
	@Override
	public String toString() {
		return "Answer1 [answer1_id=" + answer1_id + ", answer=" + answer ;
	}
	public Answer1(int answer1_id, String answer, Question1 question1) {
		super();
		this.answer1_id = answer1_id;
		this.answer = answer;
		this.question1 = question1;
	}
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
