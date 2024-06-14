package com.example.quiz.vo;

import java.time.LocalDate;
import java.util.List;

public class FeedbackDetail {

	private String quizName;

	private String description;

	private LocalDate startDate;

	private LocalDate endDate;

	private String userName;

	private String phone;

	private String email;

	private int age;

	private List<Fillin> fillinList;

	public FeedbackDetail() {
		super();
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FeedbackDetail(String quizName, String description, LocalDate startDate, LocalDate endDate, String userName,
			String phone, String email, int age, List<Fillin> fillinList) {
		super();
		this.quizName = quizName;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.fillinList = fillinList;
	}

	public List<Fillin> getFillinList() {
		return fillinList;
	}

	public void setFillinList(List<Fillin> fillinList) {
		this.fillinList = fillinList;
	}

}
