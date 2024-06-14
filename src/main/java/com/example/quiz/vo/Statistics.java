package com.example.quiz.vo;

public class Statistics {// 一題的統計

	private int qId;

	private String qTitle;

	private boolean necessary;

	private String option;

	private int count;

	public Statistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Statistics(int qId, String qTitle, boolean necessary, String option, int count) {
		super();
		this.qId = qId;
		this.qTitle = qTitle;
		this.necessary = necessary;
		this.option = option;
		this.count = count;
	}

	public int getqId() {
		return qId;
	}

	public String getqTitle() {
		return qTitle;
	}

	public boolean isNecessary() {
		return necessary;
	}

	public String getOption() {
		return option;
	}

	public int getCount() {
		return count;
	}

}
