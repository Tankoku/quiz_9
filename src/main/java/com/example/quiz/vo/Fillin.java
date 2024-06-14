package com.example.quiz.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fillin {

	// question_id 簡稱qId
	@JsonProperty("question_id")
	private int qId;
	//多個選項用分號(;)去串接
	private String options;
	
	private String question;

	//多個答案是用分號(;)串接
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
