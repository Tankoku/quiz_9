package com.example.quiz.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteReq {

	@JsonProperty("id_list")
	private List<Integer> idList;

	public DeleteReq() {
		super();
//		System.out.println("預設建構方法");
	}

	public DeleteReq(List<Integer> idList) {
		this.idList = idList;
//		System.out.println("有參數的建構方法");
	}

	public List<Integer> getIdList() {
		return idList;
	}

}
