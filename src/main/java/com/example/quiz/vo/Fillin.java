package com.example.quiz.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fillin {

	// question_id ²��qId
	@JsonProperty("question_id")
	private int qId;
	//�h�ӿﶵ�Τ���(;)�h�걵
	private String options;
	
	private String question;

	//�h�ӵ��׬O�Τ���(;)�걵
	private String answer;

	private String type;

	private boolean necessary;

	public Fillin() {
		super();
	}

	public Fillin(int qId, String answer, String type, boolean necessary) {
		super();
		this.qId = qId;
		this.answer = answer;
		this.type = type;
		this.necessary = necessary;
	}

	public int getqId() {
		return qId;
	}

	public String getAnswer() {
		return answer;
	}

	public String getType() {
		return type;
	}

	public boolean isNecessary() {
		return necessary;
	}

	public Fillin(int qId, String questiion, String answer, String type, boolean necessary) {
		super();
		this.qId = qId;
		this.question = questiion;
		this.answer = answer;
		this.type = type;
		this.necessary = necessary;
	}

	public String getQuestiion() {
		return question;
	}

	public Fillin(int qId, String options, String questiion, String answer, String type, boolean necessary) {
		super();
		this.qId = qId;
		this.options = options;
		this.question = questiion;
		this.answer = answer;
		this.type = type;
		this.necessary = necessary;
	}

	public String getOptions() {
		return options;
	}

}
