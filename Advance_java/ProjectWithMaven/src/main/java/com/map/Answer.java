package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	@OneToOne(mappedBy = "answerId")
	private Question ques;
	
	
	
	
	public Answer(int answerId, String answer, Question ques) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.ques = ques;
	}
	public Question getQues() {
		return ques;
	}
	public void setQues(Question ques) {
		this.ques = ques;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + ", ques=" + ques + "]";
	}
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
