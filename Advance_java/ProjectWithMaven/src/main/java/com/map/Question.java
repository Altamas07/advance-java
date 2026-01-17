package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name = "questin_id")
	private int questionId;
	private String question;
	@OneToOne
	private Answer answerid;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer_id() {
		return answerid;
	}
	public void setAnswer_id(Answer answer_id) {
		this.answerid = answer_id;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer_id=" + answerid + "]";
	}
	public Question(int questionId, String question, Answer answer_id) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerid = answer_id;
	}
	
	
}
