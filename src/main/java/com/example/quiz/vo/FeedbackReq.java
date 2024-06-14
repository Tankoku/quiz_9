package com.example.quiz.vo;

public class FeedbackReq {

	private int quizId;

	public FeedbackReq() {
		super();
	}

	public FeedbackReq(int quizId) {
		super();
		this.quizId = quizId;
	}

	public Integer getQuizId() {
		return quizId;
	}

}
