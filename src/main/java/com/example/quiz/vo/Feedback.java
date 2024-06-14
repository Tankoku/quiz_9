package com.example.quiz.vo;

import java.time.LocalDateTime;

public class Feedback {

	private String userName;

	private LocalDateTime FillinDateTime;

	private FeedbackDetail feedbackDetail;

	public Feedback() {
		super();
	}

	public Feedback(String userName, LocalDateTime fillinDateTime, FeedbackDetail feedbackDetail) {
		super();
		this.userName = userName;
		FillinDateTime = fillinDateTime;
		this.feedbackDetail = feedbackDetail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getFillinDateTime() {
		return FillinDateTime;
	}

	public void setFillinDateTime(LocalDateTime fillinDateTime) {
		FillinDateTime = fillinDateTime;
	}

	public FeedbackDetail getFeedbackDetail() {
		return feedbackDetail;
	}

	public void setFeedbackDetail(FeedbackDetail feedbackDetail) {
		this.feedbackDetail = feedbackDetail;
	}

}
